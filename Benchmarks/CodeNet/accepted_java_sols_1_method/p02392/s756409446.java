
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author otsuhata
 */
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    if(0 <= a && a <= 100 && 0 <= b && b <= 100 && 0 <= c && c <= 100) {
        if(a < b && b < c) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }        
    }else {
        System.out.println("Please enter a number from 0 to 100.");
    }
  }    
}