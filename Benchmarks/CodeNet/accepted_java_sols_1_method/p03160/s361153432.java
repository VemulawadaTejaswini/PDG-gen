import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextInt();
    int[] dp = new int[n];
    for (int i = 1; i < n; i++) {
      dp[i] = dp[i - 1] + Math.abs(a[i] - a[i - 1]);
      if (i > 1)
        dp[i] = Math.min(dp[i], dp[i - 2] + Math.abs(a[i] - a[i - 2]));
    }
    System.out.println(dp[n - 1]);
  }
}