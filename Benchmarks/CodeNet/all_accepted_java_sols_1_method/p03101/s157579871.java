/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt(), W = sc.nextInt();
    int h = sc.nextInt(), w = sc.nextInt();
    boolean tbl[][] = new boolean[H][W];
    for(int i = 0; i<h; i++){
      for(int j = 0; j<W; j++){
        tbl[i][j] = true; 
      }
    }
    for(int j = 0; j<w; j++){
      for(int i = 0; i<H; i++){
        tbl[i][j] = true; 
      }
    }
    int cnt = 0;
    for(int i = 0; i<H; i++){
      for(int j = 0; j<W; j++){
        if(!tbl[i][j]){
          cnt++; 
        }
      }
    }
    System.out.println(cnt);
  }
}
