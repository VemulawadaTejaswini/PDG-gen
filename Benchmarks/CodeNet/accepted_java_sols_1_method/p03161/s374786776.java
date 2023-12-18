
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] h = new int[N+1];
    for(int i = 1; i <= N; i++) h[i] = sc.nextInt();
    int[] dp = new int[N+1];
    dp[1] = 0;
    dp[2] = Math.abs(h[2] - h[1]);
    for(int i = 2; i <= N; i++) {
      int min = Integer.MAX_VALUE;
      for(int k = 1; k <= K && i - k >= 1; k++) {
        min = Math.min(min, dp[i - k] + Math.abs(h[i] - h[i - k]));
      }
      dp[i] = min;
    }
    System.out.println(dp[N]);
  }
}

