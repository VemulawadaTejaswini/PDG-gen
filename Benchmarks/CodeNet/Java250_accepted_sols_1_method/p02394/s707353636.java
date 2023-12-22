
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
    int W = sc.nextInt();
    int H = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int r = sc.nextInt();
    
    if(0 < W && W <= 100 && 0 < H && H <= 100 && 0 < r && r <= 100 
             && -100 <= x && x <= 100 && -100 <= y && y <= 100) {
        if(x + r <= W && y + r <= H && x - r >= 0 && y - r >= 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }        
    }else {
        System.out.println("Please enter appropriate number.");
    }
  }
}