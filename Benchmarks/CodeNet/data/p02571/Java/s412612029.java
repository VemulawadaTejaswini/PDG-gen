import java.util.Arrays;

class FFT {
  public static double[][] doFFT(double[] srcRe, double[] srcIm) {
    int n = srcRe.length;
    if (Integer.bitCount(n) != 1)
      return null;
    int[] rev = reverseBitOrder(n);

    double[] dstRe = new double[n];
    double[] dstIm = new double[n];

    for (int i = 0; i < n; i++) {
      dstRe[i] = srcRe[rev[i]];
      dstIm[i] = srcIm[rev[i]];
    }

    for (int s = 1; s <= n; s <<= 1) {
      int nt = s >>> 1;
      int bs = nt;

      double wRe = 1.0;
      double wIm = 0.0;
      double uRe = Math.cos(Math.PI / bs);
      double uIm = -Math.sin(Math.PI / bs);

      for (int t = 0; t < nt; t++) {
        for (int j = t; j < n; j += s) {
          int jp = j + bs;
          double re = dstRe[jp] * wRe - dstIm[jp] * wIm;
          double im = dstRe[jp] * wIm + dstIm[jp] * wRe;
          dstRe[jp] = dstRe[j] - re;
          dstIm[jp] = dstIm[j] - im;
          dstRe[j] += re;
          dstIm[j] += im;
        }
        double nwRe = wRe * uRe - wIm * uIm;
        double nwIm = wRe * uIm + wIm * uRe;
        wRe = nwRe;
        wIm = nwIm;
      }
    }
    return new double[][] { dstRe, dstIm };
  }

  protected static int[] reverseBitOrder(int n) {
    int[] ret = new int[n];
    ret[0] = 0;
    for (int i = 1, h = n >> 1; i < n; i <<= 1, h >>>= 1) {
      for (int j = 0; j < i; j++) {
        ret[j + i] = ret[j] + h;
      }
    }
    return ret;
  }

  public static int[] convolute(int[] a, int[] b) {
    int m = Integer.highestOneBit(a.length | b.length) << 2;
    prepareFFT(m);
    double[][] fa = doFFFT(a, m);
    double[][] fb = doFFFT(b, m);
    double[][] fced = new double[2][m];
    for (int i = 0; i < m; i++) {
      fced[0][i] = (fa[0][i] * fb[0][i] - fa[1][i] * fb[1][i]) / m;
      fced[1][i] = (fa[0][i] * fb[1][i] + fa[1][i] * fb[0][i]) / -m;
    }
    double[][] ced = doFFFT(fced[0], fced[1]);
    int[] ret = new int[m];
    for (int i = 0; i < m; i++) {
      ret[i] = (int) Math.round(ced[0][i]);
    }
    return ret;
  }

  static int[] rev;
  static double[] coss;

  public static void prepareFFT(int n) {
    rev = reverseBitOrder(n);
    coss = new double[n + 1];
    for (int i = 0; i <= n >>> 1; i++) {
      coss[n - i] = coss[i] = Math.cos(Math.PI * i / (n >>> 1));
    }
  }

  public static double[][] doFFFT(int[] srcRe, int n) {
    int m = srcRe.length;
    double[] dstRe = new double[n];
    double[] dstIm = new double[n];

    for (int i = 0; i < n; i++) {
      if (rev[i] < m) {
        dstRe[i] = srcRe[rev[i]];
      }
    }

    for (int s = 1; s <= n; s <<= 1) {
      int nt = s >>> 1;
      int bs = nt;

      for (int t = 0; t < nt; t++) {
        double wRe = coss[t * (n / s)];
        double wIm = coss[(n >>> 2) + t * (n / s)];
        for (int j = t; j < n; j += s) {
          int jp = j + bs;
          double re = dstRe[jp] * wRe - dstIm[jp] * wIm;
          double im = dstRe[jp] * wIm + dstIm[jp] * wRe;
          dstRe[jp] = dstRe[j] - re;
          dstIm[jp] = dstIm[j] - im;
          dstRe[j] += re;
          dstIm[j] += im;
        }
      }
    }
    return new double[][] { dstRe, dstIm };
  }

  public static double[][] doFFFT(double[] srcRe, double[] srcIm) {
    int n = srcRe.length;
    double[] dstRe = new double[n];
    double[] dstIm = new double[n];

    for (int i = 0; i < n; i++) {
      dstRe[i] = srcRe[rev[i]];
      dstIm[i] = srcIm[rev[i]];
    }

    for (int s = 2; s <= n; s <<= 1) {
      int nt = s >>> 1;
      int bs = nt;

      for (int t = 0; t < nt; t++) {
        double wRe = coss[t * (n / s)];
        double wIm = coss[(n >>> 2) + t * (n / s)];
        for (int j = t; j < n; j += s) {
          int jp = j + bs;
          double re = dstRe[jp] * wRe - dstIm[jp] * wIm;
          double im = dstRe[jp] * wIm + dstIm[jp] * wRe;
          dstRe[jp] = dstRe[j] - re;
          dstIm[jp] = dstIm[j] - im;
          dstRe[j] += re;
          dstIm[j] += im;
        }
      }
    }
    return new double[][] { dstRe, dstIm };
  }
}

public class Main {

  private static void solve() {
    char[] s = ns();
    char[] t = ns();

    int n = s.length;
    int m = t.length;
    int[][] a = new int[26][n];
    int[][] b = new int[26][m];

    for (int c = 0; c < 26; c++) {
      for (int i = 0; i < n; i++) {
        a[c][i] = s[i] - 'a' == c ? 1 : 0;
      }
    }

    for (int c = 0; c < 26; c++) {
      for (int i = 0; i < m; i++) {
        b[c][m - i - 1] = t[i] - 'a' == c ? 1 : 0;
      }
    }
    int k = Integer.highestOneBit(n | m) << 2;
    int[] ret = new int[k];
    for (int c = 0; c < 26; c++) {
      int[] f = FFT.convolute(a[c], b[c]);
      for (int i = 0; i < k; i++) {
        ret[i] += f[i];
      }
    }

    int ans = Integer.MAX_VALUE;
    for (int i = 0; i <= n - m; i++) {
      ans = Math.min(ans, m - ret[i + m - 1]);
    }

    System.out.println(ans);
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
