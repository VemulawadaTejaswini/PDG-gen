import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
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
    int h = sc.nextInt();
    int w = sc.nextInt();
    int m = sc.nextInt();
    int[][] rows = new int[h][2];
    int[][] cols = new int[w][2];
    for (int i = 0; i < h; i++) rows[i][0] = i;
    for (int i = 0; i < w; i++) cols[i][0] = i;
    Set<Integer> bombs = new HashSet<>();
    for (int i = 0; i < m; i++) {
      int hi = sc.nextInt() - 1;
      int wi = sc.nextInt() - 1;
      bombs.add(hi * w + wi);
      rows[hi][1]++;
      cols[wi][1]++;
    }
    Arrays.sort(rows, (int[] a, int[] b) -> b[1] - a[1]);
    Arrays.sort(cols, (int[] a, int[] b) -> b[1] - a[1]);
    int maxRows = rows[0][1];
    int maxCols = cols[0][1];
    int result = 0;
    for (int i = 0; i < h && rows[i][1] == maxRows; i++) {
      for (int j = 0; j < w && cols[j][1] == maxCols; j++) {
        if (bombs.contains(rows[i][0] * w + cols[j][0])) result = Math.max(result, maxRows + maxCols - 1);
        else result = Math.max(result, maxRows + maxCols);
      }
    }
    System.out.println(result);
  }
}