import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Math.*;

public class Main {
  public static void main(String[] args) {
    new Main().solve();
  }

  private void solve() {
    try(InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out)) {

      long a = in.nextLong();
      long b = in.nextLong();
      long c = in.nextLong();
      long d = in.nextLong();

      final long lcm = c * d / gcd(c ,d);

      a--;
      long x = (b / c) - (a / c);
      long y = (b / d) - (a / d);
      long z = (b / lcm) - (a / lcm);

      final long ans = (b - a) - x - y + z;
      out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  // def gcd(a:Long, b:Long):Long = {
  //   if(b == 0) a
  //   else gcd(b, a%b)
  // }

  long gcd(long a, long b) {
    if(b == 0) return a;
    return gcd(b, a % b);
  }

  int atoi(String s) { return Integer.parseInt(s); }
  long atol(String s) { return Long.parseLong(s); }

  static class InputReader implements AutoCloseable {
    public BufferedReader br;
    public StringTokenizer st;

    public InputReader(InputStream stream) {
      br = new BufferedReader(new InputStreamReader(stream), 32768);
      st = null;
    }
    public String next() {
      if (st == null || !st.hasMoreTokens()) {
        try { st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          throw new UncheckedIOException(e);
        }
      }
      return st.nextToken();
    }
    public int nextInt() { return Integer.parseInt(next()); }
    public long nextLong() { return Long.parseLong(next()); }
    int[] mapInt(int len) {
      int[] ret = new int[len];
      for (int i = 0; i < len; i++) ret[i] = Integer.parseInt(next());
      return ret;
    }
    long[] mapLong(int len) {
      long[] ret = new long[len];
      for (int i = 0; i < len; i++) ret[i] = Long.parseLong(next());
      return ret;
    }
    @Override public void close() throws IOException { br.close(); }
  }
}