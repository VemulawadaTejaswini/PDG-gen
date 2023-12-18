import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.IntBinaryOperator;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.BitSet;
import java.io.BufferedReader;
import java.util.Queue;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DWizardInMaze solver = new DWizardInMaze();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWizardInMaze {
        int h;
        int w;
        int n;
        BitSet grid;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            h = in.nextInt();
            w = in.nextInt();
            n = h * w;
            int start = c(in.nextInt() - 1, in.nextInt() - 1);
            int end = c(in.nextInt() - 1, in.nextInt() - 1);

            grid = new BitSet();
            for (int i = 0, index = 0; i < h; i++) {
                char[] row = in.next().toCharArray();
                for (char c : row) {
                    if (c == '#')
                        grid.set(index);
                    index++;
                }
            }

            UnionFind uf = new UnionFind(n);

            IntBinaryOperator tryMerge = (u, v) -> {
                if (grid.get(u) || grid.get(v))
                    return 0;
                uf.union(u, v);
                return 0;
            };

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int c = c(i, j);
                    if (i - 1 >= 0)
                        tryMerge.applyAsInt(c, c - w);
                    if (i + 1 < h)
                        tryMerge.applyAsInt(c, c + w);
                    if (j - 1 >= 0)
                        tryMerge.applyAsInt(c, c - 1);
                    if (j + 1 < w)
                        tryMerge.applyAsInt(c, c + 1);
                }
            }

            HashSet<Integer>[] adj = new HashSet[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new HashSet<>();
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int u = c(i, j);
                    if (grid.get(u))
                        continue;
                    for (int x = i - 2; x <= i + 2; x++) {
                        if (x < 0 || x >= h)
                            continue;
                        for (int y = j - 2; y <= j + 2; y++) {
                            if (y < 0 || y >= w)
                                continue;
                            int v = c(x, y);
                            if (grid.get(v))
                                continue;

                            adj[uf.rep(u)].add(uf.rep(v));
                            adj[uf.rep(v)].add(uf.rep(u));
                        }
                    }
                }
            }
            int[] distance = Graphs.distanceViaBFS(adj, uf.rep(start));

            out.println(distance[uf.rep(end)]);
        }

        private int c(int i, int j) {
            return w * i + j;
        }

    }

    static class UnionFind {
        private final int[] __rep;
        private final int[] __size;

        public UnionFind(int n) {
            __rep = new int[n];
            __size = new int[n];
            for (int i = 0; i < n; i++) {
                __rep[i] = i;
                __size[i] = 1;
            }
        }

        public int rep(int x) {
            if (__rep[x] == x) {
                return x;
            }

            int r = rep(__rep[x]);
            __rep[x] = r;
            return r;
        }

        public int size(int x) {
            return __size[rep(x)];
        }

        public boolean union(int x, int y) {
            x = rep(x);
            y = rep(y);

            if (x == y) {
                return false;
            }

            if (size(x) < size(y)) {
                int t = x;
                x = y;
                y = t;
            }

            // now size(x) >= size(y)

            __rep[y] = x;
            __size[x] += __size[y];
            return true;
        }

    }

    static class InputReader {
        public final BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class Graphs {
        public static int[] distanceViaBFS(Iterable<Integer>[] adj, int start) {
            final int n = adj.length;
            int[] distance = new int[n];
            Arrays.fill(distance, -1);
            Queue<Integer> q = new ArrayDeque<>();
            q.add(start);
            distance[start] = 0;

            while (!q.isEmpty()) {
                int cur = q.poll();
                for (int next : adj[cur]) {
                    if (distance[next] != -1)
                        continue;

                    q.add(next);
                    distance[next] = distance[cur] + 1;
                }
            }

            return distance;
        }

    }
}

