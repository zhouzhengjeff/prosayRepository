package com.prosay.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloworldController {

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello() {
        return "helloworld springboot";
    }
}
