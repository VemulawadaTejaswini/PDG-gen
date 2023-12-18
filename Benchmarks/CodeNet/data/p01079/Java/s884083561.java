import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

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
@SuppressWarnings("unchecked")
public class Main {
  private static class Task {
    private final int MAX_BALL = 2001;

    class Edge {
      int to, cost;
      Edge(int to, int cost) {
        this.to = to;
        this.cost = cost;
      }
    }

    class State implements Comparable<State> {
      int cur, prev, ball, time;
      State(int cur, int prev, int ball, int time) {
        this.cur = cur;
        this.prev = prev;
        this.ball = ball;
        this.time = time;
      }
      @Override
      public int compareTo(State o) {
        return this.time - o.time;
      }
    }

    void solve(FastScanner in, PrintWriter out) {
      int N = in.nextInt();
      int M = in.nextInt();
      int R = in.nextInt();
      int[] B = in.nextIntArray(N);

      int[][] dist = new int[N][N];
      for (int[] d : dist) Arrays.fill(d, Integer.MAX_VALUE / 2);
      for (int i = 0; i < N; i++) dist[i][i] = 0;
      for (int i = 0; i < M; i++) {
        int a = in.nextInt() - 1;
        int b = in.nextInt() - 1;
        int c = in.nextInt();

        dist[a][b] = c;
        dist[b][a] = c;
      }

      for (int k = 0; k < N; k++) {
        for (int i = 0; i < N; i++) {
          for (int j = 0; j < N; j++) {
            dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
          }
        }
      }

      int[][][] dp = new int[MAX_BALL][N][N];
      for (int[][] d : dp) for (int[] c : d) Arrays.fill(c, Integer.MAX_VALUE / 2);
      dp[0][0][0] = 0;
//      PriorityQueue<State> queue = new PriorityQueue<>();
//      queue.add(new State(0, 0, 0, 0));
//      while (!queue.isEmpty()) {
//        State state = queue.poll();
//        for (int i = 0; i < N; i++) {
//          if (state.cur == i) {
//            int ball = state.ball + B[i];
//            int time = state.time + 15;
//            if (time <= R && dp[ball][i][i] > time) {
//              dp[ball][i][i] = time;
//              queue.add(new State(i, i, ball, time));
//            }
//          } else if (state.prev != i) {
//            int ball = state.ball + B[i];
//            int time = state.time + dist[state.cur][i];
//            int prev = dist[state.cur][i] < 8 ? state.cur : 0;
//            if (time <= R && dp[ball][i][prev] > time) {
//              dp[ball][i][prev] = time;
//              queue.add(new State(i, prev, ball, time));
//            }
//          }
//        }
//      }

      for (int ball = 0; ball < MAX_BALL; ball++) {
        for (int cur = 0; cur < N; cur++) {
          for (int prev = 0; prev < N; prev++) {
            if (dp[ball][cur][prev] > R) continue;
            for (int i = 0; i < N; i++) {
              if (i == prev) continue;
              if (i == cur) {
                int time = dp[ball][cur][prev] + 15;
                int b = ball + B[i];
                dp[b][i][cur] = Math.min(dp[b][i][cur], time);
              } else {
                int time = dp[ball][cur][prev] + dist[cur][i];
                int b = ball + B[i];
                dp[b][i][cur] = Math.min(dp[b][i][cur], time);
              }
            }
          }
        }
      }

      int max = 0;
      for (int i = 0; i < N; i++) {
        for (int ball = 0; ball < MAX_BALL; ball++) {
          if (dp[ball][N - 1][i] <= R) max = Math.max(max, ball);
        }
      }
      out.println(max);
    }
  }

  /**
   * ?????????????????????????????¬????????§??????
   */
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