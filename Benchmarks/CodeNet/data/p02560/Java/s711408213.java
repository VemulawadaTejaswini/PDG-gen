import java.util.*;

public class Main {

  private static void solve() {
    int t = ni();

    for (int i = 0; i < t; i++) {
      long n = ni();
      long m = nl();
      long a = nl();
      long b = nl();
      out.println(sumFloorFraction(a, m, b, n));
    }

  }

  public static long gcd(long a, long b) {
    while (b > 0) {
      long c = a;
      a = b;
      b = c % b;
    }
    return a;
  }

  public static long sumFloorFraction(long a, long b, long c, long n) {
    if (b == 0)
      throw new ArithmeticException();
    if (n == 0)
      return 0L;

    if (b < 0) {
      b = -b;
      a = -a;
      c = -c;
    }
    if (a % b == 0) {
      return a / b * (n * (n - 1) / 2) + (c >= 0 ? c / b : (c - b + 1) / b) * n;
    }

    // gcd(a,b)=1
    long g = gcd(Math.abs(a), Math.abs(b));
    a /= g;
    b /= g;
    if (c < 0 && c % g != 0) {
      c = c / g - 1;
    } else {
      c /= g;
    }

    long z = invl(a % b + b, b) * (b - c) % b;
    return sumFloorFraction(a, b, n - z + b) - sumFloorFraction(a, b, -z + b) + (a * (z - b) + c) / b * n;
  }

  public static long invl(long a, long mod)
	{
		long b = mod;
		long p = 1, q = 0;
		while(b > 0){
			long c = a / b;
			long d;
			d = a; a = b; b = d % b;
			d = p; p = q; q = d - c * q;
		}
		return p < 0 ? p + mod : p;
	}

  public static long sumFloorFraction(long a, long b, long n) {
    if (b == 0)
      throw new ArithmeticException();
    if (a == 0 || n == 0)
      return 0L;
    long sign = 1;
    if (a < 0) {
      a = -a;
      sign = -sign;
    }
    if (b < 0) {
      b = -b;
      sign = -sign;
    }

    // gcd(a,b)=1
    // long g = Num.gcd(a, b);
    // a /= g; b /= g;
    long minus = sign >= 0 ? 0 : n - (n + b - 1) / b;
    long S = 0;

    while (a != 0 && n != 0) {
      if (a >= b) {
        S += a / b * (n * (n - 1) / 2);
        a %= b;
        if (a == 0)
          break;
      }
      if (n >= b) {
        S += (n / b) * (n / b - 1) / 2 * a * b + (a - 1) * (b - 1) / 2 * (n / b) + (n / b) * a * (n % b); // under_block
                                                                                                          // +
                                                                                                          // diagonal_block
                                                                                                          // +
                                                                                                          // last_under_block
        n %= b;
        if (n == 0)
          break;
      }

      // TODO
      S += (b - 1) * (a - 1) / 2 - (b - n) * (a * (n - 1) / b); // all-rectangle
      n = a - a * (n - 1) / b;
      long d = a;
      a = b;
      b = d;
      S = -S; // flipped from then on
    }
    return Math.abs(S) * sign - minus;
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
