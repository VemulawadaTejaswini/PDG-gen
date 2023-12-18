import java.math.BigInteger;
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

  static int[][] ofs = {
      {1, 0},
      {0, 1}
  };

  void run() {
    for (; ; ) {
      int w = ni();
      int h = ni();
      if (w == 0) {
        break;
      }
      BigInteger[][] dp = new BigInteger[h][w];
      char[][] field = new char[h][w];
      for (int i = 0; i < h; ++i) {
        String str = sc.next();
        for (int j = 0; j < w; ++j) {
          field[i][j] = str.charAt(j);
          dp[i][j] = BigInteger.ZERO;
        }
      }
      BigInteger ans = BigInteger.ZERO;
      for (int y = 0; y < h; ++y) {
        for (int x = 0; x < w; ++x) {
          if ('0' <= field[y][x] && field[y][x] <= '9') {
            dp[y][x] = dp[y][x].multiply(BigInteger.TEN).add(BigInteger.valueOf(field[y][x] - '0'));

            if (dp[y][x].compareTo(ans) > 0) {
              ans = dp[y][x];
            }
            for (int i = 0; i < 2; ++i) {
              int nx = ofs[i][0] + x;
              int ny = ofs[i][1] + y;
              if (nx >= w || ny >= h) {
                continue;
              }
              if (dp[ny][nx].compareTo(dp[y][x]) < 0) {
                dp[ny][nx] = dp[y][x];
              }
            }
          }
        }
      }
      System.out.println(ans.toString());
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}