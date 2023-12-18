import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        int n;
        int[] value;
        int[] weight;
        int[] firstQuery;
        int[] queryNext;
        int[] queryL;
        long[] queryAns;
        long[] maskWeight;
        long[] maskValue;
        long[] best;
        Integer[] order;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            n = in.nextInt();
            value = new int[n];
            weight = new int[n];
            for (int i = 0; i < n; i++) {
                value[i] = in.nextInt();
                weight[i] = in.nextInt();
            }

//        long sum = 0;
//        for (int i = 0; i < 1<<18; i++) {
//            int d = 0;
//            int x = i;
//            while (x > 0) {
//                ++d;
//                x = (x - 1) / 2;
//            }
//            sum += 1L << d;
//        }
//        System.out.println(sum);

            firstQuery = new int[n];
            Arrays.fill(firstQuery, -1);

            int numQueries = in.nextInt();
            queryNext = new int[numQueries];
            queryL = new int[numQueries];
            queryAns = new long[numQueries];
            for (int q = 0; q < numQueries; q++) {
                int v = in.nextInt() - 1;
                queryNext[q] = firstQuery[v];
                firstQuery[v] = q;
                queryL[q] = in.nextInt();
            }
            maskWeight = new long[1 << 20];
            maskValue = new long[1 << 20];
            best = new long[1 << 20];
            order = new Integer[1 << 20];
            rec(0, 1);
            for (int i = 0; i < numQueries; i++) {
                out.println(queryAns[i]);
            }
        }

        private void rec(int v, int depth) {
            if (v >= n) {
                return;
            }
            for (int mask = 0; mask < (1 << (depth - 1)); mask++) {
                int m = mask | (1 << (depth - 1));
                maskWeight[m] = maskWeight[mask] + weight[v];
                maskValue[m] = maskValue[mask] + value[v];
            }

            for (int i = 0; i < 1 << depth; i++) {
                order[i] = i;
            }
            Arrays.sort(order, 0, 1 << depth, (x, y) -> Long.compare(maskWeight[x], maskWeight[y]));
            best[0] = 0;
            for (int i = 1; i < 1 << depth; i++) {
                best[i] = Math.max(best[i - 1], maskValue[order[i]]);
            }
            for (int q = firstQuery[v]; q >= 0; q = queryNext[q]) {
                int l = 0;
                int r = 1 << depth;
                while (r - l > 1) {
                    int m = (l + r) / 2;
                    if (maskWeight[order[m]] <= queryL[q]) {
                        l = m;
                    } else {
                        r = m;
                    }
                }
                queryAns[q] = best[l];
            }
            rec(2 * v + 1, depth + 1);
            rec(2 * v + 2, depth + 1);
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

