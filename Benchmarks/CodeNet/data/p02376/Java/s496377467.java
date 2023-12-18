import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.Queue;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        GRL6A solver = new GRL6A();
        solver.solve(1, in, out);
        out.close();
    }

    static class GRL6A {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints(), m = in.ints();
            Dinic dinic = new Dinic(n);
            for (int i = 0; i < m; i++) {
                int x = in.ints(), y = in.ints(), cap = in.ints();
                dinic.addEdge(x, y, cap);
            }
            out.ans(dinic.run(0, n - 1)).ln();
        }

    }

    static class Dinic {
        private final int n;
        private final List<List<Dinic.Edge>> edges;
        private final int[] itr;
        private final int[] level;

        public Dinic(int n) {
            this.n = n;
            this.edges = new ArrayList<>(n);
            for (int i = 0; i < n; i++) this.edges.add(new ArrayList<>());
            this.itr = new int[n];
            this.level = new int[n];
        }

        public void addEdge(int from, int to, long cap) {
            Dinic.Edge natural = new Dinic.Edge(to, cap), reverse = new Dinic.Edge(from, 0);
            natural.rev = reverse;
            reverse.rev = natural;
            edges.get(from).add(natural);
            edges.get(to).add(reverse);
        }

        private void bfs(int s) {
            Arrays.fill(level, -1);
            Queue<Integer> q = new ArrayDeque<>();
            level[s] = 0;
            q.offer(s);
            while (!q.isEmpty()) {
                int from = q.poll();
                for (Dinic.Edge edge : edges.get(from)) {
                    if (edge.cap > 0 && level[edge.to] < 0) {
                        level[edge.to] = level[from] + 1;
                        q.offer(edge.to);
                    }
                }
            }
        }

        private long dfs(int from, int to, long flow) {
            if (from == to) return flow;
            for (int i = itr[from]; i < edges.get(from).size(); i++) {
                Dinic.Edge edge = edges.get(from).get(i);
                if (edge.cap > 0 && level[from] < level[edge.to]) {
                    long d = dfs(edge.to, to, Math.min(flow, edge.cap));
                    if (d > 0) {
                        edge.cap -= d;
                        edge.rev.cap += d;
                        return d;
                    }
                }
            }
            return 0;
        }

        public long run(int from, int to) {
            long res = 0, f;
            bfs(from);
            while (level[to] >= 0) {
                Arrays.fill(itr, 0);
                while (0 < (f = dfs(from, to, Long.MAX_VALUE))) res += f;
                bfs(from);
            }
            return res;
        }

        private static class Edge {
            int to;
            long cap;
            Dinic.Edge rev;

            Edge(int to, long cap) {
                this.to = to;
                this.cap = cap;
            }

        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }
}


