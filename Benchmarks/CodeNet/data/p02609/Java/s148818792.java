import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
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

  private static int powmod(int a, int n, int mod) {
    if (n == 0) return 1;
    int half = powmod(a, n / 2, mod) % mod;
    if (n % 2 == 0) return (half * half) % mod;
    return (a * ((half * half) % mod)) % mod;
  }

  private static int mod(String bin, int mod) {
    int val = 0;
    for (int i = bin.length() - 1; i >= 0; i--) {
      if (bin.charAt(i) == '0') continue;
      int n = bin.length() - 1 - i;
      val += powmod(2, n, mod);
      val %= mod;
    }
    return val;
  }

  private static int getF(String bin, int mod, Map<String, Integer> f) {
    if (f.containsKey(bin)) return f.get(bin);
    if (mod == 0) {
      f.put(bin, 0);
      return f.get(bin);
    }
    int m = mod(bin, mod);
    String mbin = Integer.toString(m, 2);
    int count = 0;
    for (int i = 0; i < mbin.length(); i++) {
      if (mbin.charAt(i) == '1') count++;
    }
    f.put(bin, 1 + getF(mbin, count, f));
    return f.get(bin);
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    String x = sc.next();
    int ones = 0;
    for (int i = 0; i < n; i++) {
      if (x.charAt(i) == '1') ones++;
    }
    Map<String, Integer> f = new HashMap<>();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      if (sb.length() > 0) sb.append("\n");
      String xi;
      int m;
      if (x.charAt(i) == '0') {
        m = ones + 1;
        xi = x.substring(0, i) + '1' + x.substring(i + 1);
      } else {
        m = ones - 1;
        xi = x.substring(0, i) + '0' + x.substring(i + 1);
      }
      int count = getF(xi, m, f);
      sb.append(count);
    }
    System.out.println(sb.toString());
  }
}