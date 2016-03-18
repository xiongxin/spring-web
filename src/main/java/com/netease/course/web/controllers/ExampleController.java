package com.netease.course.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by xiongxin on 16/3/18.
 */
@Controller
@RequestMapping(value = "/hello")
public class ExampleController {

    @RequestMapping(value = "/spring")
    public void spring(HttpServletResponse response) throws IOException {
        response.getWriter().write("Hello, Spring Web!");
    }
}
