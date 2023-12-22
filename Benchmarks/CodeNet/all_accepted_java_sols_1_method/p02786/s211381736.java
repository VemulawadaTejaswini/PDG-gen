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
    long H = sc.nextLong();
    long ans = 0;
    long k = 1;
    while(H >= 1){
      ans += k;
      k *= 2;
      H /= 2;
    }
    System.out.println(ans);
  }
}