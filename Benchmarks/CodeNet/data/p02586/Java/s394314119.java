import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  private static class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
      reader = new BufferedReader(new InputStreamReader(in));
      tokenizer = null;
    }

    public String next() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public String nextLine() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          return reader.readLine();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

      return tokenizer.nextToken("\n");
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = nextInt();
      return a;
    }

    public long[] nextLongArray(int n) {
      long[] a = new long[n];
      for (int i = 0; i < n; i++)
        a[i] = nextLong();
      return a;
    }
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    long[][] v = new long[r + 1][c + 1];
    for (int i = 0; i < k; i++) {
      int ri = sc.nextInt();
      int ci = sc.nextInt();
      long vi = sc.nextLong();
      v[ri][ci] = vi;
    }
    long[][][] dp = new long[r + 1][c + 1][4];
    for (int i = 1; i <= r; i++) {
      for (int j = 1; j <= c; j++) {
        dp[i][j][0] = dp[i - 1][j][0];
        dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j][1]);
        dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j][2]);
        dp[i][j][0] = Math.max(dp[i][j][0], dp[i - 1][j][3]);
        dp[i][j][0] = Math.max(dp[i][j][0], dp[i][j - 1][0]);
        dp[i][j][1] = dp[i][j - 1][1];
        dp[i][j][1] = Math.max(dp[i][j - 1][0] + v[i][j], dp[i][j][1]);
        dp[i][j][1] = Math.max(dp[i - 1][j][1] + v[i][j], dp[i][j][1]);
        dp[i][j][1] = Math.max(dp[i - 1][j][2] + v[i][j], dp[i][j][1]);
        dp[i][j][1] = Math.max(dp[i - 1][j][3] + v[i][j], dp[i][j][1]);
        dp[i][j][2] = Math.max(dp[i][j - 1][1] + v[i][j], dp[i][j - 1][2]);
        dp[i][j][3] = Math.max(dp[i][j - 1][2] + v[i][j], dp[i][j - 1][3]);
      }
    }
    long result = 0L;
    for (int i = 0; i <= 3; i++) result = Math.max(result, dp[r][c][i]);
    System.out.println(result);
  }
}