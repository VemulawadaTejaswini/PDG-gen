import java.util.Arrays;
import java.util.Scanner;

public class Main {

  Scanner sc;

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    int[] LUT = new int[1000];
    for (int i = 1; i < 1000; ++i) {
      LUT[i] = i * (i + 1) * (i + 2) / 6;
    }
    int[] dp = new int[1000000 + 1];
    Arrays.fill(dp, 1 << 28);
    dp[0] = 0;
    for (int i = 1; i < 1000; ++i) {
      for (int j = 0; j <= 1000000; ++j) {
        int next = j + LUT[i];
        if (next > 1000000) {
          break;
        }
        dp[next] = Math.min(dp[next], dp[j] + 1);
      }
    }
    int[] ep = new int[1000000 + 1];
    Arrays.fill(ep, 1 << 28);
    ep[0] = 0;
    for (int i = 1; i < 1000; ++i) {
      if (LUT[i] % 2 == 0) {
        continue;
      }
      for (int j = 0; j <= 1000000; ++j) {
        int next = j + LUT[i];
        if (next > 1000000) {
          break;
        }
        ep[next] = Math.min(ep[next], ep[j] + 1);
      }
    }
    for (; ; ) {
      int n = ni();
      if (n == 0) {
        break;
      }

      System.out.println(dp[n] + " " + ep[n]);
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}