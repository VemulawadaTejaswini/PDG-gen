import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {
  private static class Task {
    void solve(FastScanner in, PrintWriter out) {
      while (true) {
        int N = in.nextInt();
        if (N == 0) break;
        double[][] xy = new double[N][2];
        for (int i = 0; i < N; i++) {
          String s = in.next();
          String[] sxy = s.split(",");
          xy[i][0] = Double.parseDouble(sxy[0]);
          xy[i][1] = Double.parseDouble(sxy[1]);
        }
        long[][] cxy = new long[N][2];
        for (int i = 0; i < N; i++) {
          cxy[i][0] = (long) (xy[i][0] * 1000000.0);
          cxy[i][1] = (long) (xy[i][1] * 1000000.0);
        }
        long[][] hoge = convexHull(cxy);
        out.println(N - hoge.length);

      }
    }

    long[][] convexHull(long[][] xy) {
      int N = xy.length;
      if (N <= 1) return xy;
      Arrays.sort(xy, new Comparator<long[]>() {
        @Override
        public int compare(long[] a, long[] b) {
          if (a[0] != b[0]) return Long.compare(a[0], b[0]);
          return Long.compare(a[1], b[1]);
        }
      });

      int[] qs = new int[N + 1];//?§????????????????
      int k = 0;//?????????????????°
      for (int i = 0; i < N; i++) {
        if (k >= 1 && xy[qs[k - 1]][0] == xy[i][0] && xy[qs[k - 1]][1] == xy[i][1]) continue;
        while (k > 1 && ccw(xy[qs[k - 2]], xy[qs[k - 1]], xy[i]) >= 0) k--;
        qs[k++] = i;
      }

      int inf = k + 1;
      for (int i = N - 2; i >= 0; i--) {
        if (xy[qs[k - 1]][0] == xy[i][0] && xy[qs[k - 1]][1] == xy[i][1]) continue;
        while (k >= inf && ccw(xy[qs[k - 2]], xy[qs[k - 1]], xy[i]) >= 0) k--;
        qs[k++] = i;
      }

      long[][] ret = new long[k - 1][];
      for (int i = 0; i < k - 1; i++) ret[i] = xy[qs[i]];
      return ret;
    }

    int ccw(long[] a, long[] b, long[] t) {
      return Long.signum((t[0] - a[0]) * (b[1] - a[1]) - (b[0] - a[0]) * (t[1] - a[1]));
    }

  }

  // Template
  public static void main(String[] args) {
    OutputStream outputStream = System.out;
    FastScanner in = new FastScanner();
    PrintWriter out = new PrintWriter(outputStream);
    Task solver = new Task();
    solver.solve(in, out);
    out.close();
  }
  private static class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int bufferLength = 0;

    private boolean hasNextByte() {
      if (ptr < bufferLength) {
        return true;
      } else {
        ptr = 0;
        try {
          bufferLength = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (bufferLength <= 0) {
          return false;
        }
      }
      return true;
    }

    private int readByte() {
      if (hasNextByte()) return buffer[ptr++];
      else return -1;
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    boolean hasNext() {
      skipUnprintable();
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) throw new NoSuchElementException();
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    long nextLong() {
      if (!hasNext()) throw new NoSuchElementException();
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if (b == '-') {
        minus = true;
        b = readByte();
      }
      if (b < '0' || '9' < b) {
        throw new NumberFormatException();
      }
      while (true) {
        if ('0' <= b && b <= '9') {
          n *= 10;
          n += b - '0';
        } else if (b == -1 || !isPrintableChar(b)) {
          return minus ? -n : n;
        } else {
          throw new NumberFormatException();
        }
        b = readByte();
      }
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    double[] nextDoubleArray(int n) {
      double[] array = new double[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextDouble();
      }
      return array;
    }

    double[][] nextDoubleMap(int n, int m) {
      double[][] map = new double[n][];
      for (int i = 0; i < n; i++) {
        map[i] = nextDoubleArray(m);
      }
      return map;
    }

    public int nextInt() {
      return (int) nextLong();
    }
  }
}