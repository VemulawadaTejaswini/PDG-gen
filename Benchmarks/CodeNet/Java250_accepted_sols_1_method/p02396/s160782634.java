/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otsuhata
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int count = 0;
        int x = 1;
        
        Scanner sc = new Scanner(System.in);            
        
        for(int i = 0; i < 10000; i ++) {
            x = sc.nextInt();
            
            if(x == 0 || x < 1 || x > 10000) {
                break;
            }else {
                System.out.println("Case " + (i + 1) + ": " + x);
            }
        }
        
//        while(x != 0) {
//            x = sc.nextInt();
//            count ++;
//            System.out.println("Case " + count + ": " + x);
//        }
    }
    
}