
public class Main {

  private static void solve() {
    int n = ni();
    int[][] p = ntable(n, 2);

    int left, right;
    {
      int ng = 0;
      int ok = (int) 1e9 + 10;
      // k以下が n/2個以上あるか
      while (ok - ng > 1) {
        int k = (ok + ng) / 2;
        int[] cnt = cnt(k, p);

        if (cnt[0] + cnt[1] >= (n + 1) / 2) {
          ok = k;
        } else {
          ng = k;
        }
      }
      left = ok;
    }

    {
      int ng = (int) 1e9 + 10;
      int ok = 0;
      // k以上が n/2個以上あるか
      while (ng - ok > 1) {
        int k = (ok + ng) / 2;
        int[] cnt = cnt(k, p);

        if (cnt[1] + cnt[2] >= (n + 1) / 2) {
          ok = k;
        } else {
          ng = k;
        }
      }
      right = ok;
    }

    if (n % 2 == 1) {
      System.out.println(right - left + 1);
    } else {
      int leftMax = Integer.MIN_VALUE;
      int rightMin = Integer.MAX_VALUE;

      for (int[] q : p) {
        if (q[0] <= left && left <= q[1])
          leftMax = Math.max(leftMax, q[1]);
        if (q[0] <= right && right <= q[1])
          rightMin = Math.min(rightMin, q[0]);
      }

      int min = rightMin + left;
      int max = leftMax + right;

      System.out.println(max - min + 1);
    }
  }

  private static int[] cnt(int k, int[][] p) {
    int[] ret = new int[3];
    for (int[] q : p) {
      if (q[1] < k) {
        ret[0]++;
      } else if (q[0] > k) {
        ret[2]++;
      } else {
        ret[1]++;
      }
    }
    return ret;
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
