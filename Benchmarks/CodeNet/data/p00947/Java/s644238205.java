import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

/*
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            pass System Test!
*/

public class Main {
  private static class Task {
    void solve(FastScanner in, PrintWriter out) throws Exception {
      int[][] table = new int[10][10];
      for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
          table[i][j] = in.nextInt();
        }
      }

      int ans = 0;
      int[] hoge = new int[5];
      int[] check = new int[5];
      for (int i = 0; i < 10000; i++) {
        hoge[0] = i / 1000;
        hoge[1] = (i - hoge[0] * 1000) / 100;
        hoge[2] = (i - hoge[0] * 1000 - hoge[1] * 100) / 10;
        hoge[3] = i % 10;
        hoge[4] = table[table[table[table[0][hoge[0]]][hoge[1]]][hoge[2]]][hoge[3]];

        for (int j = 0; j < 5; j++) {
          check[j] = hoge[j];
        }

        boolean fail = false;
        outer:
        for (int j = 0; j < 5; j++) {
          for (int k = 0; k < 10; k++) {
            check[j] = k;
            boolean ok = true;
            for (int l = 0; l < 5; l++) {
              if (check[l] != hoge[l]) ok = false;
            }
            if (ok) continue;

            int e = table[table[table[table[0][check[0]]][check[1]]][check[2]]][check[3]];
            if (table[e][check[4]] == 0) {
              fail = true;
              break outer;
            }

          }
          check[j] = hoge[j];
        }
        if (fail) {
          ans++;
          continue;
        }

        for (int j = 0; j < 4; j++) {
          for (int k = 0; k < 5; k++) {
            check[k] = hoge[k];
          }
          check[j] = hoge[j + 1];
          check[j + 1] = hoge[j];

          boolean ok = true;
          for (int l = 0; l < 5; l++) {
            if (check[l] != hoge[l]) ok = false;
          }
          if (ok) continue;

          int e = table[table[table[table[0][check[0]]][check[1]]][check[2]]][check[3]];
          if (table[e][check[4]] == 0) {
            ans++;
            break;
          }
        }

      }

      out.println(ans);
    }
  }

  /**
   * ?????????????????????????????¬????????§??????
   */
  public static void main(String[] args) throws Exception {
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

    public int[] nextIntArray(int n) {
      int[] array = new int[n];
      for (int i = 0; i < n; i++) array[i] = nextInt();
      return array;
    }

    public long[] nextLongArray(int n) {
      long[] array = new long[n];
      for (int i = 0; i < n; i++) array[i] = nextLong();
      return array;
    }

    public String[] nextStringArray(int n) {
      String[] array = new String[n];
      for (int i = 0; i < n; i++) array[i] = next();
      return array;
    }

    public char[][] nextCharMap(int n) {
      char[][] array = new char[n][];
      for (int i = 0; i < n; i++) array[i] = next().toCharArray();
      return array;
    }

    public int[][] nextIntMap(int n, int m) {
      int[][] map = new int[n][];
      for (int i = 0; i < n; i++) {
        map[i] = nextIntArray(m);
      }
      return map;
    }
  }
}