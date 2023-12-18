import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    final int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int[][] lr = new int[n][2];
    for (int i = 0; i < k; i++) {
      lr[i][0] = Integer.parseInt(sc.next());
      lr[i][1] = Integer.parseInt(sc.next());
    }
    int mod = 998244353;
    long[] dp = new long[n + 1];
    dp[1] = 1L;
    for (int i = 2; i <= n; i++) {
      dp[i] = 0L;
    }
    for (int i = 1; i < n; i++) {
      final int current = i;
      long base = dp[i];
      for (int j = 0; j < k; j++) {
        int[] lrk = lr[j];
        IntStream
          .rangeClosed(current + lrk[0], Math.min(n, current + lrk[1]))
          .filter(moved -> moved <= n)
          .forEach(moved -> {
              dp[moved] = (dp[moved] + base) % mod;
            }
          );
      }
    }
    pw.println(dp[n]);
  }
}
