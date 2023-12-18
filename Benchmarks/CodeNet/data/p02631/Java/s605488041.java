import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int[] arr = new int[n];
    int xor = 0;
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
      xor^=arr[i];
    }
    
    for(int i=0;i<n;i++){
      System.out.print((xor^arr[i]) + " ");
    }
  }
}
