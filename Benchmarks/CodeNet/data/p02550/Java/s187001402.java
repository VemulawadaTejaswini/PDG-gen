import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    ESequenceSum solver = new ESequenceSum();
    solver.solve(1, in, out);
    out.close();
  }

  static class ESequenceSum {

    public void solve(int testNumber, InputReader in, PrintWriter out) {
      long n = in.nextLong();
      int x = in.nextInt();
      long m = in.nextLong();

      long[] c = new long[(int) m + 1];
      int[] last = new int[2 * (int) m + 1];
      Arrays.fill(c, -1);
      int cc = 0;
      int tip = 0;
      int lastValue = 0;
      List<Integer> va = new ArrayList<>();
      for (int j = x; cc <= n; j = (int) ((j * (long) j) % m)) {
        if (c[j] != -1) {
          lastValue = j;
          break;
        }
        c[j] = 1;
        tip = j;
        last[j] = cc;
        va.add(j);
        ++cc;
      }
      if (cc <= n) {
        long length = cc - last[lastValue];
        long left = n - cc;
        long repeat = left / length;
        n -= repeat * (long) length;
        for (int i = last[lastValue]; i < cc; ++i) {
          c[va.get(i)] += repeat;
        }
        for (int j = (int) ((tip * (long) tip) % m); cc < n; j = (int) ((j * (long) j) % m)) {
          Checks.verify(c[j] != -1);
          c[j]++;
          ++cc;
        }
      }
      long ans = 0;
      for (int i = 0; i < m; ++i) {
        if (c[i] == -1) {
          continue;
        }
        ans += c[i] * (long) i;
      }
      out.println(ans);
    }

  }

  static class InputReader {

    private InputStream stream;
    private static final int DEFAULT_BUFFER_SIZE = 1 << 16;
    private static final int EOF = -1;
    private byte[] buf = new byte[DEFAULT_BUFFER_SIZE];
    private int curChar;
    private int numChars;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public int read() {
      if (this.numChars == EOF) {
        throw new UnknownError();
      } else {
        if (this.curChar >= this.numChars) {
          this.curChar = 0;

          try {
            this.numChars = this.stream.read(this.buf);
          } catch (IOException ex) {
            throw new InputMismatchException();
          }

          if (this.numChars <= 0) {
            return EOF;
          }
        }

        return this.buf[this.curChar++];
      }
    }

    public int nextInt() {
      int c;
      for (c = this.read(); isSpaceChar(c); c = this.read()) {
      }

      byte sgn = 1;
      if (c == 45) {
        sgn = -1;
        c = this.read();
      }

      int res = 0;

      while (c >= 48 && c <= 57) {
        res *= 10;
        res += c - 48;
        c = this.read();
        if (isSpaceChar(c)) {
          return res * sgn;
        }
      }

      throw new InputMismatchException();
    }

    public long nextLong() {
      int c;
      for (c = this.read(); isSpaceChar(c); c = this.read()) {
      }

      byte sgn = 1;
      if (c == 45) {
        sgn = -1;
        c = this.read();
      }

      long res = 0;

      while (c >= 48 && c <= 57) {
        res *= 10L;
        res += c - 48;
        c = this.read();
        if (isSpaceChar(c)) {
          return res * sgn;
        }
      }
      throw new InputMismatchException();
    }

    public static boolean isSpaceChar(int c) {
      return c == 32 || c == 10 || c == 13 || c == 9 || c == EOF;
    }

  }

  static final class Checks {

    public static void verify(boolean condition, String message) {
      if (!condition) {
        throw new RuntimeException(message);
      }
    }

    public static void verify(boolean condition) {
      verify(condition, "Condition not met");
    }

  }
}

