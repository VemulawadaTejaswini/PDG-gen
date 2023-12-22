import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] h = new int[N];
    for (int i = 0; i < N; i++) {
      h[i] = sc.nextInt();
    }
    int[] dp = new int[N];
    for (int i = 0; i < N; i++) {
      dp[i] = Integer.MAX_VALUE;
    }
    dp[0] = 0;
    for (int i = 0; i < N - 1; i++) {
      dp[i+1] = Math.min(dp[i+1], dp[i] + Math.abs(h[i+1]-h[i]));
      if (i + 2 < N) {
        dp[i+2] = Math.min(dp[i+2], dp[i] + Math.abs(h[i+2]-h[i]));
      }
    }
    System.out.println(dp[N-1]);
  }
}