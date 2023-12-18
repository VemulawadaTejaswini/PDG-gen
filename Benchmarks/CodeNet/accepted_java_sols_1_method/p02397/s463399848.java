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
        
        Scanner sc = new Scanner(System.in);            
        
        for(int i = 0; i < 3000; i ++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if((x == 0 && y == 0) || x < 0 || x > 10000 || y < 0 || y > 10000) {
                break;
            }else if(x < y){                
                System.out.println(x + " " + y);
            }else {
                System.out.println(y + " " + x);
            }
        }
    }    
}