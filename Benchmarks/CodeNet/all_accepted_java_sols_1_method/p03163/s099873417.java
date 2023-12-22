import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int W = sc.nextInt();
    int[] w = new int[N];
    int[] v = new int[N];
    for (int i = 0; i < N; i++) {
      w[i] = sc.nextInt();
      v[i] = sc.nextInt();
    }
    sc.close();

    long[] dp = new long[W + 1];
    for (int i = 0; i < N; i++)
      for (int j = W; w[i] <= j; j--)
        dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);

    long ans = 0;
    for (long val : dp) ans = Math.max(ans, val);
    System.out.println(ans);
  }
}