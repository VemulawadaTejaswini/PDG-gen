import java.io.*;
import java.util.*;

class Main {
  static final Scanner in = new Scanner(System.in);
  static int N, K;

  static int[] h;
  // static int dp[][];
  static int dp[];
  static final int MOD = 1000000007;
  static int[] pre;

  public static void main(String[] args) throws Exception {
    N = in.nextInt();
    K = in.nextInt();
    h = new int[N];
    dp = new int[N];

    // dp = new int[N + 1][K + 1];
    // pre = new int[N];

    int old_sum = 0;
    for (int i = 0; i < N; i++) {
      h[i] = in.nextInt();
      //   pre[i] = old_sum + a[i];
      //   old_sum = pre[i];
      // Arrays.fill(dp[i],-1);
    }
    Arrays.fill(dp, -1);

    F_topDown();
    System.out.println(dp[N - 1]);
  }

  // static int F(int i, int k) {
  //   // System.out.println("\tat i == " + i + " k = " + k);
  //   if (i < N && k > pre[i]) return 0;
  //   if (i < N && k == pre[i]) return 1;

  //   if (i == 1) {
  //     // System.out.println("\tat i == 0 k = "+k);
  //     if (k > a[0]) {
  //       // System.out.println("\treturning 0");5
  //       return 0;
  //     }
  //     // System.out.println("\treturning 1");
  //     return 1;
  //   }

  //   if (dp[i][k] != -1) return dp[i][k];

  //   int val = 0;
  //   for (int j = 0; j <= a[i - 1]; j++) {
  //     // System.out.println("\t\tat i == " + i + " k = " + k + " j = " + j);
  //     if (k < j) break;
  //     val += F(i - 1, k - j) % MOD;
  //     val %= MOD;
  //   }
  //   // System.out.println("\t\tat i == " + i + " k = " + k + " val = " + val);
  //   dp[i][k] = val % MOD;
  //   return dp[i][k];
  // }

  static void F_topDown() {
    dp[0] = 0;
    dp[1] = Math.abs(h[0] - h[1]);
    for (int i = 2; i < N; i++) {
      int cost = Integer.MAX_VALUE;
      for (int k = 1; k <= K; k++) {
        if (k > i) break;
        cost = Math.min(cost, dp[i - k] + Math.abs(h[i - k] - h[i]));
      }

      dp[i] = cost;
    }

    
  }
  // static int F_topDown(int i) {
  //   for (int i = 0; i < N; i++) {
  //     //..if we have only 1 stone
  //     if (i == 0) {
  //       dp[i] = 0;
  //       continue;
  //     }

  //     //..if we have 2 stones
  //     if (i == 1) {
  //       dp[i] = Math.abs(h[0] - h[1]);
  //       continue;
  //     }

  //     //..if frog jumps from previous stone
  //     int cost1 = F(i - 1) + Math.abs(h[i - 1] - h[i]);

  //     //..if frog jumps from two stones back
  //     int cost2 = F(i - 2) + Math.abs(h[i - 2] - h[i]);

  //     //..store it before returning
  //     dp[i] = Math.min(cost1, cost2);
  //   }
  //   //..if value is already been calculated return directly
  //   if (dp[i] != -1) return dp[i];

  //   //..if frog jumps from previous stone
  //   int cost1 = F(i - 1) + Math.abs(h[i - 1] - h[i]);

  //   //..if frog jumps from two stones back
  //   int cost2 = F(i - 2) + Math.abs(h[i - 2] - h[i]);

  //   //..store it before returning
  //   dp[i] = Math.min(cost1, cost2);
  //   return dp[i];
  // }
}
