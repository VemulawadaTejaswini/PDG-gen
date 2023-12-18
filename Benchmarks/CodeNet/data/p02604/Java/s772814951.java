import java.util.Arrays;

public class Main {

  private static void solve() {
    int n = ni();

    int[][] x = new int[n][3];
    int[][] y = new int[n][3];
    int[] p = new int[n];
    for (int i = 0; i < n; i++) {
      x[i][0] = ni();
      x[i][1] = i;
      y[i][0] = ni();
      y[i][1] = i;
      p[i] = ni();
    }

    int m = 1;
    for (int i = 0; i < n; i++) {
      m *= 3;
    }

    Arrays.sort(x, (o1, o2) -> o1[0] - o2[0]);
    Arrays.sort(y, (o1, o2) -> o1[0] - o2[0]);

    int[] invx = new int[n];
    int[] invy = new int[n];
    for (int i = 0; i < n; i++) {
      invx[x[i][1]] = i;
      invy[y[i][1]] = i;
    }

    int[] min = new int[n];

    long[] ret = new long[n + 1];
    Arrays.fill(ret, Long.MAX_VALUE);

    for (int i = 0; i < m; i++) {
      int z = i;
      int num = 0;

      for (int j = 0; j < n; j++) {
        int s = z % 3;
        if (s == 1) {
          x[invx[j]][2] = 1;
          y[invy[j]][2] = 0;
          num++;
        } else if (s == 2) {
          x[invx[j]][2] = 0;
          y[invy[j]][2] = 1;
          num++;
        } else {
          x[invx[j]][2] = 0;
          y[invy[j]][2] = 0;
        }
        z /= 3;
        min[j] = Math.min(Math.abs(y[invy[j]][0]), Math.abs(x[invx[j]][0]));
      }

      {
        int lastX1 = Integer.MAX_VALUE / 2;
        int lastX2 = Integer.MAX_VALUE / 2;
        int lastY1 = Integer.MAX_VALUE / 2;
        int lastY2 = Integer.MAX_VALUE / 2;
        for (int j1 = 0, j2 = n - 1; j1 < n; j1++, j2--) {
          if (x[j1][2] == 1) {
            lastX1 = x[j1][0];
          }
          if (x[j2][2] == 1) {
            lastX2 = x[j2][0];
          }
          if (y[j1][2] == 1) {
            lastY1 = y[j1][0];
          }
          if (y[j2][2] == 1) {
            lastY2 = y[j2][0];
          }
          min[x[j1][1]] = Math.min(min[x[j1][1]], Math.abs(x[j1][0] - lastX1));
          min[x[j2][1]] = Math.min(min[x[j2][1]], Math.abs(x[j2][0] - lastX2));
          min[y[j1][1]] = Math.min(min[y[j1][1]], Math.abs(y[j1][0] - lastY1));
          min[y[j2][1]] = Math.min(min[y[j2][1]], Math.abs(y[j2][0] - lastY2));
        }
      }

      long now = 0;
      for (int j = 0; j < n; j++) {
        now += (long) min[j] * p[j];
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
