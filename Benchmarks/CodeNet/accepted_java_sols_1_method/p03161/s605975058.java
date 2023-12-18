import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] h = new int[N];
    for (int i = 0; i < N; i++) {
      h[i] = sc.nextInt();
    }
    int[] dp = new int[N];
    for (int i = 0; i < N; i++) {
      dp[i] = Integer.MAX_VALUE;
    }
    dp[0] = 0;
    for (int i = 0; i < N-1; i++) {
      for (int k=1; i+k < N && k <=K; k++) {
        dp[i+k] = Math.min(dp[i+k], dp[i] + Math.abs(h[i+k]-h[i]));
      }
    }
    System.out.println(dp[N-1]);
  }
}