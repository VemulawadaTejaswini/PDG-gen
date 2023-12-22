//package atcoder.beginnercontest.r176;

import java.util.Scanner;

/**
 * @author pribic (Priyank Doshi)
 * @since 29/08/20
 */
public class Main {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      long ans = 0;
      int lastVal = -1;
      for(int i = 0; i < n; i++) {
        if(lastVal == -1) {
          lastVal = sc.nextInt();
        } else {
          int curVal = sc.nextInt();
          if(curVal < lastVal) {
            ans += lastVal - curVal;
          }
          lastVal = Math.max(lastVal, curVal);
        }
      }
      
      System.out.println(ans);
    }
  }
}