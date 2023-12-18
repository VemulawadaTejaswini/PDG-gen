import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
  private static class Task {
    void solve(FastScanner in, PrintWriter out) {
      while (true) {
        int N = in.nextInt();
        if (N == 0) break;
        Double[][] xy = new Double[N][2];
        for (int i = 0; i < N; i++) {
          String s = in.next();
          String[] sxy = s.split(",");
          xy[i][0] = Double.parseDouble(sxy[0]);
          xy[i][1] = Double.parseDouble(sxy[1]);
        }
        out.println(N - ConvexHull.convexHull(xy).size());

      }
    }

  }

  static class ConvexHull {
    static <T extends Number> ArrayList<T[]> convexHull(T[][] xy) {
      int N = xy.length;
      if (N <= 1) {
        ArrayList<T[]> list = new ArrayList<>();
        Collections.addAll(list, xy);
        return list;
      }
      Arrays.sort(xy, new Comparator<T[]>() {
        @Override
        public int compare(T[] a, T[] b) {
          if (!a[0].equals(b[0])) return Double.compare(a[0].doubleValue(), b[0].doubleValue());
          return Double.compare(a[1].doubleValue(), b[1].doubleValue());
        }
      });

      int[] qs = new int[N + 1];//?§????????????????
      int k = 0;//?????????????????°
      for (int i = 0; i < N; i++) {
        if (k >= 1 && xy[qs[k - 1]][0].equals(xy[i][0]) && xy[qs[k - 1]][1].equals(xy[i][1])) continue;
        while (k > 1 && ccw(xy[qs[k - 2]], xy[qs[k - 1]], xy[i]) >= 0) k--;
        qs[k++] = i;
      }

      int inf = k + 1;
      for (int i = N - 2; i >= 0; i--) {
        if (xy[qs[k - 1]][0] == xy[i][0] && xy[qs[k - 1]][1] == xy[i][1]) continue;
        while (k >= inf && ccw(xy[qs[k - 2]], xy[qs[k - 1]], xy[i]) >= 0) k--;
        qs[k++] = i;
      }

      ArrayList<T[]> ret = new ArrayList<>(k - 1);
      for (int i = 0; i < k - 1; i++) ret.add(xy[qs[i]]);
      return ret;
    }

    static <T extends Number> double ccw(T[] a, T[] b, T[] t) {
      return (t[0].doubleValue() - a[0].doubleValue()) * (b[1].doubleValue() - a[1].doubleValue()) - (b[0].doubleValue() - a[0].doubleValue()) * (t[1].doubleValue() - a[1].doubleValue());
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