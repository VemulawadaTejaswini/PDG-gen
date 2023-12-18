import java.awt.*;
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
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    int h = sc.nextInt();
    int m = sc.nextInt();
    double mTheta = 360.0 * ((double) m / 60.0);
    double hTheta = 360.0 * ((double) h / 12.0) + 30.0 * ((double) m / 60.0);
    double[] hp = new double[2];
    hp[0] = a * Math.cos(Math.toRadians(hTheta));
    hp[1] = a * Math.sin(Math.toRadians(hTheta));
    double[] mp = new double[2];
    mp[0] = b * Math.cos(Math.toRadians(mTheta));
    mp[1] = b * Math.sin(Math.toRadians(mTheta));
    double ans = Math.hypot(hp[0] - mp[0], hp[1] - mp[1]);
    System.out.println(ans);
  }
}