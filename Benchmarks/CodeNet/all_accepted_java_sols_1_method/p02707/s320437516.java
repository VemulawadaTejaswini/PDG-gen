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
        int n  = in.nextInt();
        int[] mem = new int[n];
        for (int i = 0 ; i < n-1; i++) {
            mem[Integer.parseInt(in.next()) - 1 ] ++;
        }
        for (int i : mem) {
            System.out.println(i);
        }
    }

}
