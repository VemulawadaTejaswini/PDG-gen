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

      int n = in.nextInt();
      int[] a = in.mapInt(n);

      int[] colors = new int[9];
      for (int rate : a) {
          int rank = rate >= 3200 ? 8 : rate / 400;
          colors[rank]++;
      }

      int count = 0;
      for (int i = 0; i < 8; i++) {
        count += colors[i] > 0 ? 1 : 0;
      }

      int max = count + colors[8];
      int min = count != 0 ? count : 1;
      out.println(min + " " + max);
    }
    catch(IOException e) {
      System.err.println(e);
    }
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

    public String nextLine() throws IOException {
      return br.readLine();
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