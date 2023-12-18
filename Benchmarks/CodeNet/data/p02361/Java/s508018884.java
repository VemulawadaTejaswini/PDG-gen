import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.Closeable;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HBonsai
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ShortestPathDijkstra2 solver = new ShortestPathDijkstra2();
        solver.solve(1, in, out);
        out.close();
    }

    static class ShortestPathDijkstra2 {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int V = in.nextInt();
            int E = in.nextInt();
            int r = in.nextInt();
            final int INF = Integer.MAX_VALUE / 3;
            int[][] cost = new int[V][V];
            for (int[] ints : cost) Arrays.fill(ints, INF);
            for (int i = 0; i < E; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                cost[u][v] = in.nextInt();
            }
            int[] d = new int[V];
            boolean[] used = new boolean[V];
            Arrays.fill(d, INF);
            Arrays.fill(used, false);
            d[r] = 0;
            while (true) {
                int v = -1;
                for (int u = 0; u < V; u++) {
                    if (!used[u] && (v == -1 || d[u] < d[v])) v = u;
                }
                if (v == -1) break;
                used[v] = true;
                for (int u = 0; u < V; u++) {
                    d[u] = Math.min(d[u], d[v] + cost[v][u]);
                }
            }
            for (int i = 0; i < V; i++) {
                if (d[i] == INF) out.println("INF");
                else out.println(d[i]);
            }
        }

    }

    static class FastScanner implements Closeable {
        private final InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
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

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        public long nextLong() {
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

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public void close() {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}


