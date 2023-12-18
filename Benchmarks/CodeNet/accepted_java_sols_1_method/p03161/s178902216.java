import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    long[] dp = new long[n];
    Arrays.fill(dp, Long.MAX_VALUE);

    int[] h = new int[n];
    for (int i = 0; i < n; i++) {
        h[i] = sc.nextInt();
    }

    dp[0] = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 1; j <= k; j++) {
            if (i+j < dp.length) {
                dp[i+j] = Math.min(dp[i+j], Math.abs(dp[i] + Math.abs(h[i] - h[i+j])));
            }
        }
    }

    System.out.println(dp[n-1]);
  }
}