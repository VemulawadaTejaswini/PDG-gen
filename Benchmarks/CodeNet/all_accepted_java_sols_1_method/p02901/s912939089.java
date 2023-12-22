import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[] cost = new int[M];
    int[] keys = new int[M];
    for (int i = 0; i < M; i++) {
      cost[i] = scanner.nextInt();
      int b = scanner.nextInt();
      for (int j = 0; j < b; j++) keys[i] |= 1 << scanner.nextInt() - 1;
    }

    int INF = 1000_000_000;
    int[] dp = new int[1 << N];
    Arrays.fill(dp, INF);
    dp[0] = 0;
    for (int i = 0; i < 1 << N; i++)
      if (dp[i] < INF)
        for (int j = 0; j < M; j++)
          dp[i | keys[j]] = Math.min(dp[i | keys[j]], dp[i] + cost[j]);
    if (dp[(1 << N) - 1] >= INF) System.out.println(-1);
    else System.out.println(dp[(1 << N) - 1]);
  }
}
