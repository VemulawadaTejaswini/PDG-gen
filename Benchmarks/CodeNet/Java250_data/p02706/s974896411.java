/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author yoovraj.shinde
 */
public class Main {
    public static void main(String[] args) {
    //        if (true) return;
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s  = in.nextLine();
        int n = Integer.parseInt(s.split(" ")[0]);
        int act = 0;
        String tasks = in.nextLine();
        for (String t : tasks.split(" ")) {
            act = act + Integer.parseInt(t);
        }
        int res = n - act;
        if (res < 0) {
            System.out.println("-1");
        } else {
            System.out.println(res);
        }
        
    }

}
