import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long c = sc.nextLong();
    long[] sum = new long[n + 1];
    long[] x = new long[n + 1];
    long[] v = new long[n + 1];
    long[] dp1 = new long[n + 1];
    long[] dp2 = new long[n + 1];
    for(int i = 1; i < n + 1; i++) {
      x[i] = sc.nextLong();
      v[i] = sc.nextLong();
      sum[i] = sum[i - 1] + v[i];
      dp1[i] = Math.max(dp1[i - 1], sum[i] - x[i]);
    }
    dp2[n] = Math.max(0, sum[n] - sum[n - 1] - (c - x[n])); 
    for(int i = n - 1; i >= 1; i--) {
      dp2[i] = Math.max(dp2[i + 1], sum[n] - sum[i - 1] - (c - x[i]));
    }
    long ans = Math.max(dp1[n], dp2[1]);
    for(int i = 1; i < n + 1; i++) {
      if(i < n) ans = Math.max(ans, sum[i] - 2 * x[i] + dp2[i + 1]);
      if(i > 1) ans = Math.max(ans, sum[n] - sum[i - 1] - 2 * (c - x[i]) + dp1[i - 1]);
    }
    System.out.println(ans);
  }
}