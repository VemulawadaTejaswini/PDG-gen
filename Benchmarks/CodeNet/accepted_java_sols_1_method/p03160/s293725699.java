import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] h = new long[n];
    for(int i = 0; i < n; i++) {
      h[i] = sc.nextLong();
    }
    long[] dp = new long[n];
    for(int i = 1; i < n; i++) {
      dp[i] = Long.MAX_VALUE;
    }
    for(int i = 1; i < n; i++) {
      if(i > 1) dp[i] = Math.min(dp[i], dp[i - 2] + Math.abs(h[i] - h[i - 2]));
      dp[i] = Math.min(dp[i], dp[i - 1] + Math.abs(h[i] - h[i - 1])); 
    }
    System.out.println(dp[n - 1]);
  }
}