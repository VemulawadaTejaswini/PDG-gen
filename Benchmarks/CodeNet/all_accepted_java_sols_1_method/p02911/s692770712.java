/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int point = sc.nextInt();
        int wnum = sc.nextInt();
        int win[] = new int[n];
        for(int i = 0;i<wnum;i++){
            win[sc.nextInt()-1]++;
        }
        for(int i = 0;i<n;i++){
            if(point + win[i] > wnum) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    
}
