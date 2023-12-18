import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] a = sc.nextIntArray(n);
    StringBuilder sb = new StringBuilder();
    while (k-- > 0) {
      sb.delete(0, sb.length());
      int[] b = new int[n];
      for (int i = 0; i < n; i++) {
        b[Math.max(0, i - a[i])]++;
        if (i + a[i] < n - 1) b[i + a[i] + 1]--;
      }
      int min = n;
      a[0] = b[0];
      for (int i = 1; i < n; i++) {
        a[i] = a[i - 1] + b[i];
        min = Math.min(min, a[i]);
      }
      if (min == n) break;
      if (min < 0) {
        for (int i = 0; i < n; i++) a[i] -= min;
      }
    }
    for (int i = 0; i < n; i++) {
      if (sb.length() > 0) sb.append(" ");
      sb.append(a[i]);
    }
    System.out.println(sb.toString());
  }
}