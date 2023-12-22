import java.util.Arrays;
import java.util.Scanner;

class Main {

  private static long INF = Long.MAX_VALUE / 4;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.next());
    int W = Integer.parseInt(scanner.next());
    int[] weight = new int[N];
    int[] value = new int[N];
    for (int i = 0; i < N; i++) {
      weight[i] = Integer.parseInt(scanner.next());
      value[i] = Integer.parseInt(scanner.next());
    }
    scanner.close();
    long[][] dp = new long[110][100010];

    for (long[] ls : dp) {
      Arrays.fill(ls, -INF);
    }
    Arrays.fill(dp[0], 0);
    for (int i = 0; i < N; i++) {
      for (int sum_w = 0; sum_w <= W; sum_w++) {
        if (sum_w - weight[i] >= 0) {
          dp[i + 1][sum_w] = Math.max(dp[i + 1][sum_w], dp[i][sum_w - weight[i]] + value[i]);
        }
        dp[i + 1][sum_w] = Math.max(dp[i + 1][sum_w], dp[i][sum_w]);
      }
    }
    System.out.println(dp[N][W]);
  }

}
