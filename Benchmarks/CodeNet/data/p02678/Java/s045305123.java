import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Vishal Burman
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDoubleDots solver = new DDoubleDots();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDoubleDots {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            Graph graph = new Graph(n + 1);
            for (int i = 0; i < m; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                graph.addEdge(a, b);
            }
            int v[] = new int[n + 1];
            Arrays.fill(v, -1);
            Queue<Integer> q = new LinkedList<>();
            q.add(1);
            while (!q.isEmpty()) {
                int x = q.peek();
                q.poll();
                ArrayList<Integer> sample = graph.adj.get(x);
                for (int j = 0; j < sample.size(); j++) {
                    if (v[sample.get(j)] == -1) {
                        q.add(sample.get(j));
                        v[sample.get(j)] = x;
                    }
                }
            }
            for (int i = 2; i < v.length; i++) {
                if (v[i] == -1) {
                    out.println("No");
                    return;
                }
            }
            out.println("Yes");
            for (int i = 2; i < v.length; i++) {
                out.println(v[i]);
            }
        }

    }

    static class Graph {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        public Graph(int n) {
            for (int i = 0; i < n; i++)
                adj.add(new ArrayList<Integer>());
        }

        public void addEdge(int u, int v) {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

