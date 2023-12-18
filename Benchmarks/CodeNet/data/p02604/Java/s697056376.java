import java.util.Arrays;

public class Main {

  private static void solve() {
    int n = ni();

    long[][] p = new long[n][3];
    for (int i = 0; i < n; i++) {
      p[i][0] = nl();
      p[i][1] = nl();
      p[i][2] = nl();
    }

    int m = 1;
    for (int i = 0; i < n; i++) {
      m *= 3;
    }

    int[] x = new int[n];
    long[] orgMin = new long[n];
    for (int i = 0; i < n; i++) {
      orgMin[i] = Math.min(Math.abs(p[i][0]), Math.abs(p[i][1]));
    }
    long[] min = new long[n];

    long[] ret = new long[n + 1];
    Arrays.fill(ret, Long.MAX_VALUE);

    for (int i = 0; i < m; i++) {
      int z = i;
      int num = 0;
      for (int j = 0; j < n; j++) {
        x[j] = z % 3;
        if (x[j] > 0) {
          num++;
        }
        z /= 3;
      }

      System.arraycopy(orgMin, 0, min, 0, n);
      for (int j = 0; j < n; j++) {
        if (x[j] == 0)
          continue;
        if (x[j] == 1) {
          for (int k = 0; k < n; k++) {
            // vertical
            min[k] = Math.min(min[k], Math.abs(p[k][0] - p[j][0]));
          }
        } else if (x[j] == 2) {
          for (int k = 0; k < n; k++) {
            // horizental
            min[k] = Math.min(min[k], Math.abs(p[k][1] - p[j][1]));
          }
        }
      }
      long now = 0;
      for (int j = 0; j < n; j++) {
        now += min[j] * p[j][2];
      }
      ret[num] = Math.min(ret[num], now);
    }

    for (int i = 0; i <= n; i++) {
      System.out.println(ret[i]);
    }
  }

  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = args.length > 0 ? args[0] : null;
        if (debug != null) {
          try {
            is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
        reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);
        solve();
        out.flush();
        tr((System.currentTimeMillis() - start) + "ms");
      }
    }, "", 64000000).start();
  }

  private static java.io.InputStream is = System.in;
  private static java.io.PrintWriter out = new java.io.PrintWriter(System.out);
  private static java.util.StringTokenizer tokenizer = null;
  private static java.io.BufferedReader reader;

  public static String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }

  private static double nd() {
    return Double.parseDouble(next());
  }

  private static long nl() {
    return Long.parseLong(next());
  }

  private static int[] na(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = ni();
    return a;
  }

  private static char[] ns() {
    return next().toCharArray();
  }

  private static long[] nal(int n) {
    long[] a = new long[n];
    for (int i = 0; i < n; i++)
      a[i] = nl();
    return a;
  }

  private static int[][] ntable(int n, int m) {
    int[][] table = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[i][j] = ni();
      }
    }
    return table;
  }

  private static int[][] nlist(int n, int m) {
    int[][] table = new int[m][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[j][i] = ni();
      }
    }
    return table;
  }

  private static int ni() {
    return Integer.parseInt(next());
  }

  private static void tr(Object... o) {
    if (is != System.in)
      System.out.println(java.util.Arrays.deepToString(o));
  }
}
