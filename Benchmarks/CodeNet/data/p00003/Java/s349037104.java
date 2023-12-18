/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author izumi
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            
            int[] l = new int[3];
            
            for (int j = 0; j < 3; j++) {
                l[j] = sc.nextInt();
            }
            
            Arrays.sort(l);

            if ((l[2]*l[2]) == ((l[1]*l[1])+(l[0]*l[0]))) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}