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
    int H = sc.nextInt();
    int N = sc.nextInt();
    int sum = 0;
    for(int i = 0 ;i<N; i++){
      int k  = sc.nextInt();
      sum += k;
    }
    if(H <= sum){
      System.out.println("Yes"); 
    }
    else{
      System.out.println("No"); 
    }
  }
}
