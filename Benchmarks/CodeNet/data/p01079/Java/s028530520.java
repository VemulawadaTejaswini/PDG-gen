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

public class Main {
  private static class Task {
    private final int MAX_BALL = 20000;

    class Edge {
      int to, cost;
      Edge(int to, int cost) {
        this.to = to;
        this.cost = cost;
      }
    }

    class State implements Comparable<State> {
      int cur, prev, ball;
      boolean curCaptured, prevCaptured;
      int time;
      State(int cur, int prev, int ball, boolean curCaptured, boolean prevCaptured, int time) {
        this.cur = cur;
        this.prev = prev;
        this.ball = ball;
        this.curCaptured = curCaptured;
        this.prevCaptured = prevCaptured;
        this.time = time;
      }
      @Override
      public int compareTo(State o) {
        return this.time - o.time;
      }

      @Override
      public String toString() {
        Formatter formatter = new Formatter();
        String s = "cur=%d, prev=%d, ball=%d, cur=%b, prev=%b, time=%d";
        formatter.format(s, cur, prev, ball, curCaptured, prevCaptured, time);
        return formatter.toString();
      }
    }

    void solve(FastScanner in, PrintWriter out) {
      int N = in.nextInt();
      int M = in.nextInt();
      int R = in.nextInt();
      int[] B = in.nextIntArray(N);

      ArrayList<Edge>[] graph = new ArrayList[N];
      for (int i = 0; i < N; i++) {
        graph[i] = new ArrayList<>();
      }

      for (int i = 0; i < M; i++) {
        int a = in.nextInt() - 1;
        int b = in.nextInt() - 1;
        int c = in.nextInt();

        graph[a].add(new Edge(b, c));
        graph[b].add(new Edge(a, c));
      }

      int[][][][][] dist = new int[N][N][MAX_BALL][2][2];
      for (int[][][][] x : dist)
        for (int[][][] y : x) for (int[][] z : y) for (int[] w : z) Arrays.fill(w, Integer.MAX_VALUE / 2);
      dist[0][0][0][0][0] = 0;
      PriorityQueue<State> queue = new PriorityQueue<>();
      queue.add(new State(0, 0, 0, false, false, 0));
      while (!queue.isEmpty()) {
        State s = queue.poll();
        for (Edge edge : graph[s.cur]) {
          int ball = s.ball;
          boolean prevCaptured = s.curCaptured;
          boolean curCaptured = false;
          if (edge.to != s.prev || !s.prevCaptured) {
            ball += B[edge.to];
            curCaptured = true;
          }
          int time = s.time + edge.cost;
          if (time > R) continue;
          if (dist[edge.to][s.cur][ball][curCaptured ? 1 : 0][prevCaptured ? 1 : 0] > time) {
            dist[edge.to][s.cur][ball][curCaptured ? 1 : 0][prevCaptured ? 1 : 0] = time;
            queue.add(new State(edge.to, s.cur, ball, curCaptured, prevCaptured, time));
          }
          int wait = Math.max(0, 15 - edge.cost * 2);
          time += wait;
          if (dist[edge.to][s.cur][ball][curCaptured ? 1 : 0][0] > time) {
            dist[edge.to][s.cur][ball][curCaptured ? 1 : 0][0] = time;
            queue.add(new State(edge.to, s.cur, ball, curCaptured, false, time));
          }
          if (!curCaptured) continue;
          time -= wait;
          time += 15;
          ball += B[edge.to];
          if (dist[edge.to][edge.to][ball][1][0] > time) {
            dist[edge.to][edge.to][ball][1][0] = time;
            queue.add(new State(edge.to, edge.to, ball, true, false, time));
          }
        }
      }

      int max = 0;
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          for (int k = 0; k < MAX_BALL; k++) {
            for (int l = 0; l < 2; l++) {
              for (int m = 0; m < 2; m++) {
                if (dist[N - 1][j][k][l][m] <= R) max = Math.max(max, k);
              }
            }
          }
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