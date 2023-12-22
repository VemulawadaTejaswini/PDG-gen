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
        int num  = in.nextInt();
        System.out.println(num * 6.2832);
    }

}
