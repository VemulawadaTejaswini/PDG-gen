import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

@SuppressWarnings("unchecked")
public class Main {
  private static class Task {
    void solve(FastScanner in, PrintWriter out) {
      while (true) {
        int N = in.nextInt();
        if (N == 0) break;

        int INF = (int) 1e6;
        MinimumCostFlow flow = new MinimumCostFlow(366);
        for (int i = 0; i < N; i++) {
          int u = in.nextInt() - 1, v = in.nextInt() - 1, w = in.nextInt();
          flow.addEdge(u, v + 1, 1, INF * (v + 1 - u) - w);
        }
        for (int i = 0; i < 365; i++) {
          flow.addEdge(i, i + 1, 2, INF);
        }
        out.println(INF * 2 * 365 - flow.run(0, 365, 2));
      }
    }
  }

  static class MinimumCostFlow {
    class Edge {
      int to, rev;
      long cap, cost;
      Edge(int to, long cap, long cost, int rev) {
        this.to = to;
        this.cap = cap;
        this.cost = cost;
        this.rev = rev;
      }
    }

    private static final long INF = Long.MAX_VALUE / 2;
    private ArrayList<ArrayList<Edge>> G;
    private int V;
    long[] potential;
    long[] dist;
    int[] prevV, prevE;

    MinimumCostFlow(int V) {
      this.V = V;
      G = new ArrayList<>(V);
      for (int i = 0; i < V; i++) G.add(new ArrayList<Edge>());
      potential = new long[V];
      dist = new long[V];
      prevE = new int[V];
      prevV = new int[V];
    }

    void addEdge(int from, int to, long cap, long cost) {
      G.get(from).add(new Edge(to, cap, cost, G.get(to).size()));
      G.get(to).add(new Edge(from, 0, -cost, G.get(from).size() - 1));
    }

    long run(int s, int t, long flow) {
      long cost = 0;
      Arrays.fill(potential, 0);
      while (flow > 0) {
        PriorityQueue<long[]> queue = new PriorityQueue<>(new Comparator<long[]>() {
          @Override
          public int compare(long[] o1, long[] o2) {
            return Long.compare(o1[0], o2[0]);
          }
        });
        Arrays.fill(dist, INF);
        dist[s] = 0;
        queue.add(new long[]{0, s});
        while (!queue.isEmpty()) {
          long[] p = queue.poll();
          int v = (int) p[1];
          if (dist[v] < p[0]) continue;
          for (int i = 0; i < G.get(v).size(); i++) {
            Edge e = G.get(v).get(i);
            int u = e.to;
            if (e.cap > 0 && dist[u] > dist[v] + e.cost + potential[v] - potential[u]) {
              dist[u] = dist[v] + e.cost + potential[v] - potential[u];
              prevV[u] = v;
              prevE[u] = i;
              queue.add(new long[]{dist[u], u});
            }
          }
        }
        if (dist[t] == INF) return -1;
        for (int v = 0; v < V; v++) potential[v] += dist[v];

        long d = flow;
        for (int v = t; v != s; v = prevV[v]) d = Math.min(d, G.get(prevV[v]).get(prevE[v]).cap);
        flow -= d;
        cost += d * potential[t];
        for (int v = t; v != s; v = prevV[v]) {
          Edge e = G.get(prevV[v]).get(prevE[v]);
          e.cap -= d;
          G.get(v).get(e.rev).cap += d;
        }
      }
      return cost;
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

    public int[] nextIntArray(int n) {
      int[] array = new int[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextInt();
      }
      return array;
    }
  }
}