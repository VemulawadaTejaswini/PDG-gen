import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C_KnapsackQueriesOnATree solver = new C_KnapsackQueriesOnATree();
        solver.solve(1, in, out);
        out.close();
    }

    static class C_KnapsackQueriesOnATree {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] value = new int[n];
            int[] weight = new int[n];
            for (int i = 0; i < n; i++) {
                value[i] = in.nextInt();
                weight[i] = in.nextInt();
            }

            List<Query>[] queries = new List[n];
            for (int i = 0; i < n; i++) {
                queries[i] = new ArrayList<>();
            }
            int numQueries = in.nextInt();
            for (int i = 0; i < numQueries; i++) {
                int v = in.nextInt() - 1;
                int L = in.nextInt();
                queries[v].add(new Query(i, 0L, L));
            }

            long[] ans = new long[numQueries];
            for (int i = n - 1; i >= 0; i--) {
                for (Query q : queries[i]) {
                    ans[q.id] = Math.max(ans[q.id], q.value);
                    if (q.weight >= weight[i]) {
                        ans[q.id] = Math.max(ans[q.id], q.value + value[i]);
                    }
                    if (i == 0) {
                        continue;
                    }
                    int p = (i - 1) / 2;
                    queries[p].add(q);
                    if (q.weight >= weight[i]) {
                        queries[p].add(new Query(q.id, q.value + value[i], q.weight - weight[i]));
                    }
                }
            }
            for (int i = 0; i < numQueries; i++) {
                out.println(ans[i]);
            }
        }

        class Query {
            int id;
            long value;
            int weight;

            public Query(int id, long value, int weight) {
                this.id = id;
                this.value = value;
                this.weight = weight;
            }

        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

