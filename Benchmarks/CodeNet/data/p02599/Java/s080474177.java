import java.util.Arrays;

public class Main {

  private static void solve() {
    int n = ni();
    int q = ni();
    int[] a = na(n);
    int[][] qs = ntable(q, 2);

    moTemplate(qs, n, q, a);
  }

  public static void moTemplate(int[][] qs, int n, int Q, int[] a) {
    long[] pack = sqrtSort(qs, n);
    int L = 0, R = -1;

    int[] cnt = new int[n + 1];
    int ans = 0;

    long[] rets = new long[Q];
    for (long pa : pack) {
      int ind = (int) (pa & (1 << 25) - 1);
      int ql = qs[ind][0] - 1, qr = qs[ind][1] - 1;
      while (R < qr) {
        R++;
        cnt[a[R]]++;
        if (cnt[a[R]] == 1) {
          ans++;
        }
      }
      while (L > ql) {
        L--;
        cnt[a[L]]++;
        if (cnt[a[L]] == 1) {
          ans++;
        }
      }
      while (R > qr) {
        cnt[a[R]]--;
        if (cnt[a[R]] == 0) {
          ans--;
        }
        R--;
      }
      while (L < ql) {
        cnt[a[L]]--;
        if (cnt[a[L]] == 0) {
          ans--;
        }
        L++;
      }
      rets[ind] = ans;
    }

    for (long ret : rets) {
      out.println(ret);
    }
  }

  public static long[] sqrtSort(int[][] qs, int n) {
    int m = qs.length;
    long[] pack = new long[m];
    int S = (int) Math.sqrt(n);
    for (int i = 0; i < m; i++) {
      pack[i] = (long) qs[i][0] / S << 50 | (long) ((qs[i][0] / S & 1) == 0 ? qs[i][1] : (1 << 25) - 1 - qs[i][1]) << 25
          | i;
    }
    pack = radixSort(pack);
    return pack;
  }

  public static int[] radixSort(int[] f) {
    return radixSort(f, f.length);
  }

  public static int[] radixSort(int[] f, int n) {
    int[] to = new int[n];
    {
      int[] b = new int[65537];
      for (int i = 0; i < n; i++)
        b[1 + (f[i] & 0xffff)]++;
      for (int i = 1; i <= 65536; i++)
        b[i] += b[i - 1];
      for (int i = 0; i < n; i++)
        to[b[f[i] & 0xffff]++] = f[i];
      int[] d = f;
      f = to;
      to = d;
    }
    {
      int[] b = new int[65537];
      for (int i = 0; i < n; i++)
        b[1 + (f[i] >>> 16)]++;
      for (int i = 1; i <= 65536; i++)
        b[i] += b[i - 1];
      for (int i = 0; i < n; i++)
        to[b[f[i] >>> 16]++] = f[i];
      int[] d = f;
      f = to;
      to = d;
    }
    return f;
  }

  public static long[] radixSort(long[] f) {
    return radixSort(f, f.length);
  }

  public static long[] radixSort(long[] f, int n) {
    long[] to = new long[n];
    {
      int[] b = new int[65537];
      for (int i = 0; i < n; i++)
        b[1 + (int) (f[i] & 0xffff)]++;
      for (int i = 1; i <= 65536; i++)
        b[i] += b[i - 1];
      for (int i = 0; i < n; i++)
        to[b[(int) (f[i] & 0xffff)]++] = f[i];
      long[] d = f;
      f = to;
      to = d;
    }
    {
      int[] b = new int[65537];
      for (int i = 0; i < n; i++)
        b[1 + (int) (f[i] >>> 16 & 0xffff)]++;
      for (int i = 1; i <= 65536; i++)
        b[i] += b[i - 1];
      for (int i = 0; i < n; i++)
        to[b[(int) (f[i] >>> 16 & 0xffff)]++] = f[i];
      long[] d = f;
      f = to;
      to = d;
    }
    {
      int[] b = new int[65537];
      for (int i = 0; i < n; i++)
        b[1 + (int) (f[i] >>> 32 & 0xffff)]++;
      for (int i = 1; i <= 65536; i++)
        b[i] += b[i - 1];
      for (int i = 0; i < n; i++)
        to[b[(int) (f[i] >>> 32 & 0xffff)]++] = f[i];
      long[] d = f;
      f = to;
      to = d;
    }
    {
      int[] b = new int[65537];
      for (int i = 0; i < n; i++)
        b[1 + (int) (f[i] >>> 48 & 0xffff)]++;
      for (int i = 1; i <= 65536; i++)
        b[i] += b[i - 1];
      for (int i = 0; i < n; i++)
        to[b[(int) (f[i] >>> 48 & 0xffff)]++] = f[i];
      long[] d = f;
      f = to;
      to = d;
    }
    return f;
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
