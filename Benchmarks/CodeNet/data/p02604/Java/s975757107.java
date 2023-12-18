import java.util.Arrays;

public class Main {

  private static void solve() {
    int n = ni();

    int[][] p = new int[n][3];
    for (int i = 0; i < n; i++) {
      p[i][0] = ni();
      p[i][1] = ni();
      p[i][2] = ni();
    }

    int m = 1;
    for (int i = 0; i < n; i++) {
      m *= 3;
    }

    int[] minx = new int[n];
    int[] miny = new int[n];

    long[] ret = new long[n + 1];
    Arrays.fill(ret, Long.MAX_VALUE);

    int[][] nx = new int[n * 2][2];
    int[][] ny = new int[n * 2][2];

    for (int i = 0; i < m; i++) {
      int z = i;
      int num = 0;

      int px = 0;
      int py = 0;
      nx[0][0] = 0;
      nx[0][1] = -1;
      for (int j = 0; j < n; j++) {
        int s = z % 3;
        nx[px][0] = p[j][0];
        nx[px][1] = j;
        px++;
        ny[py][0] = p[j][1];
        ny[py][1] = j;
        py++;

        if (s == 1) {
          nx[px][0] = p[j][0];
          nx[px][1] = -1;
          px++;
          num++;
        } else if (s == 2) {
          ny[py][0] = p[j][1];
          ny[py][1] = -1;
          py++;
          num++;
        }
        z /= 3;
      }
      Arrays.sort(nx, 0, px, (o1, o2) -> o1[0] - o2[0]);
      Arrays.sort(ny, 0, py, (o1, o2) -> o1[0] - o2[0]);

      for (int j = 0; j < n; j++) {
        minx[j] = Math.abs(p[j][0]);
        miny[j] = Math.abs(p[j][1]);
      }

      {
        int last = Integer.MAX_VALUE / 2;
        for (int j = 0; j < px; j++) {
          if (nx[j][1] < 0) {
            last = nx[j][0];
          } else {
            minx[nx[j][1]] = Math.min(minx[nx[j][1]], Math.abs(nx[j][0] - last));
          }
        }
      }

      {
        int last = Integer.MAX_VALUE / 2;
        for (int j = px - 1; j >= 0; j--) {
          if (nx[j][1] < 0) {
            last = nx[j][0];
          } else {
            minx[nx[j][1]] = Math.min(minx[nx[j][1]], Math.abs(nx[j][0] - last));
          }
        }
      }

      {
        int last = Integer.MAX_VALUE / 2;
        for (int j = 0; j < py; j++) {
          if (ny[j][1] < 0) {
            last = ny[j][0];
          } else {
            miny[ny[j][1]] = Math.min(miny[ny[j][1]], Math.abs(ny[j][0] - last));
          }
        }
      }

      {
        int last = Integer.MAX_VALUE / 2;
        for (int j = py - 1; j >= 0; j--) {
          if (ny[j][1] < 0) {
            last = ny[j][0];
          } else {
            miny[ny[j][1]] = Math.min(miny[ny[j][1]], Math.abs(ny[j][0] - last));
          }
        }
      }

      long now = 0;
      for (int j = 0; j < n; j++) {
        now += (long) Math.min(minx[j], miny[j]) * p[j][2];
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
