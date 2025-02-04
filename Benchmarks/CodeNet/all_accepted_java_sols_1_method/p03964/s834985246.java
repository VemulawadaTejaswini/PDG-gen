import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] t = new long[N];
    long[] a = new long[N];
    for(int i = 0; i < N; i++) {
      t[i] = sc.nextLong();
      a[i] = sc.nextLong(); 
    }
    // i回目の投票時が(t[i]k,a[i]k)としたときのkの最小値
    long[] dp = new long[N];
    dp[0] = 1;
    for(int i = 1; i < N; i++) {
      long k1 = t[i - 1] * dp[i - 1] / t[i];
      long k2 = a[i - 1] * dp[i - 1] / a[i];
      if(((t[i - 1] * dp[i - 1]) % t[i]) != 0) k1++;
      if(((a[i - 1] * dp[i - 1]) % a[i]) != 0) k2++;
      dp[i] = Math.max(k1, k2);
    }
    System.out.println(dp[N - 1] * (t[N - 1] + a[N - 1]));
  }
}