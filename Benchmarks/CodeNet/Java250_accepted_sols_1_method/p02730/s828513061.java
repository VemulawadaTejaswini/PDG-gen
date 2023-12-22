/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author wnqmw
 */
public class Main {
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        
        String k = kb.nextLine();
        boolean fin = false;
        int i = 0;
        int j = k.length()-1;
        
        while(i <= j){
            if(k.charAt(i) != k.charAt(j)){
                System.out.println("No");
                fin = true;
                break;
            }
            i++;
            j--;
        }
        i = 0;
        j = (k.length()-1)/2-1;
        while(i <= j && fin != true){
            if(k.charAt(i) != k.charAt(j)){
                System.out.println("No");
                fin = true;
                break;
            }
            i++;
            j--;
        }
        i = (k.length()+3)/2-1;
        j = k.length()-1;
        while(i <= j && fin != true){
            if(k.charAt(i) != k.charAt(j)){
                System.out.println("No");
                fin = true;
                break;
            }
            i++;
            j--;
        }
        if(fin == false){
            System.out.println("Yes");
        }
    }
}
