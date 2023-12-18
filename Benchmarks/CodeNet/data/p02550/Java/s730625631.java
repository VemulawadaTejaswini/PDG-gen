import java.util.*;

@SuppressWarnings("unused")
public class Main {

  private static void solve() {
    long n = nl();
    long x = nl();
    int m = ni();

    Set<Long> set = new HashSet<>();
    long[] a = new long[m];
    a[0] = x;
    set.add(x);

    int from = -1;
    long y = x;
    for (int i = 1; i < m; i++) {
      y = y * y % m;
      if (!set.contains(y)) {
        a[i] = y;
        set.add(y);
      } else {
        a = Arrays.copyOf(a, i);
        for (from = 0; a[from] != y; from++)
          ;
        break;
      }
    }

    long ret = 0;
    for (int i = 0; i < Math.min(from, n); i++) {
      ret += a[i];
    }
    if (n <= from) {
      System.out.println(ret);
    }

    n -= from;

    int k = a.length - from;
    long[] b = new long[k];
    long sum = 0;
    for (int i = 0; i < k; i++) {
      b[i] = a[i + from];
      sum += b[i];
    }

    ret += n / k * sum;

    for (int i = 0; i < n % k; i++) {
      ret += b[i];
    }
    System.out.println(ret);
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
