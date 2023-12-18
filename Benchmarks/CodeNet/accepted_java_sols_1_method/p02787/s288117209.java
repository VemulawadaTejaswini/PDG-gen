import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    int[] dp = new int[h + 1];
    dp[0] = 0;
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    for (int i = 1; i < h + 1; i++) {
      int magic_point = 0;
      for(int j = 0; j < n; j++) {
        if(i - a[j] < 0) {
          magic_point = b[j];
        } else {
          magic_point = b[j] + dp[i -a[j]];
        }
        if(magic_point < dp[i] || dp[i] == 0) {
          dp[i] = magic_point;
        }
      }
    }
    System.out.println(dp[h]);
  }
}