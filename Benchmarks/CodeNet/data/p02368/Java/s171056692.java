
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")
public class Main {
  private static class Task {
    void solve(FastScanner in, PrintWriter out) {
      int V = in.nextInt(), E = in.nextInt();
      ArrayList<Integer>[] g = new ArrayList[V];
      for (int i = 0; i < V; i++) g[i] = new ArrayList<Integer>();
      for (int i = 0; i < E; i++) {
        int s = in.nextInt(), t = in.nextInt();
        g[s].add(t);
      }

      int[] cmp = StronglyConnectedComponents.decomposite(g);
      int Q = in.nextInt();
      for (int i = 0; i < Q; i++) {
        int u = in.nextInt(), v = in.nextInt();
        if (cmp[u] == cmp[v]) out.println(1);
        else out.println(0);
      }
    }
  }

  static class StronglyConnectedComponents {
    public static int[] decomposite(ArrayList<Integer>[] G) {
      ArrayList<Integer> vs = new ArrayList<Integer>();
      int V = G.length;
      int[] cmp = new int[V];

      ArrayList<Integer>[] rG = new ArrayList[V];
      for (int i = 0; i < V; i++) rG[i] = new ArrayList<Integer>();
      for (int i = 0; i < V; i++) for (int v : G[i]) rG[v].add(i);
      boolean[] used = new boolean[V];

      ArrayDeque<Integer> stack = new ArrayDeque<>();
      boolean[] added = new boolean[V];
      for (int i = 0; i < V; i++)
        if (!used[i]) {
          stack.addFirst(i);
          while (!stack.isEmpty()) {
            int v = stack.peekFirst();
            used[v] = true;
            boolean pushed = false;
            for (int j = G[v].size() - 1; j >= 0; j--) {
              int u = G[v].get(j);
              if (!used[u]) {
                stack.addFirst(u);
                pushed = true;
              }
            }
            if (!pushed) {
              stack.pollFirst();
              if (!added[v]) {
                vs.add(v);
                added[v] = true;
              }
            }
          }
        }

      used = new boolean[V];
      int k = 0;
      Collections.reverse(vs);
      for (int i : vs)
        if (!used[i]) {
          stack.push(i);
          used[i] = true;
          cmp[i] = k;
          while (!stack.isEmpty()) {
            int v = stack.peek();
            boolean pushed = false;
            for (int u : rG[v])
              if (!used[u]) {
                used[u] = true;
                cmp[u] = k;
                stack.push(u);
                pushed = true;
              }
            if (!pushed) stack.pop();
          }
          k++;
        }
      return cmp;
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