import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        int N, M;
        Map<Integer, Integer> nextHome = new HashMap<>();

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            M = in.nextInt();

            FloydWarshall flwsh = new FloydWarshall(N);

            for (int i = 0; i < M; ++i) {
                int u = in.nextInt();
                int v = in.nextInt();
                int w = in.nextInt();
                flwsh.addEdge(u, v, w);
            }

            flwsh.setDistances();

            if (flwsh.hasNegativeCycle()) {
                out.println("NEGATIVE CYCLE");
            } else {
                for (int i = 0; i < N; ++i) {
                    StringBuilder row = new StringBuilder();
                    for (int j = 0; j < N; ++j) {
                        int d = flwsh.getDistance(i, j);
                        row.append(d != Integer.MAX_VALUE ? Integer.toString(d) : "INF").append(' ');
                    }
                    out.println(row.toString().trim());
                }
            }
        }
    }

    static class FloydWarshall {
        private static int INF = Integer.MAX_VALUE;
        private int size;
        private int[][] d;

        public FloydWarshall(int n) {
            this.size = n;
            this.d = new int[n][n];
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j)
                    d[i][j] = i == j ? 0 : INF;
        }

        public void addEdge(int src, int dest, int weight) {
            d[src][dest] = weight;
        }

        public int getDistance(int src, int dest) {
            return d[src][dest];
        }

        public void setDistances() {
            for (int k = 0; k < size; ++k) {
                for (int i = 0; i < size; ++i) {
                    if (d[i][k] == INF) continue;
                    for (int j = 0; j < size; ++j) {
                        if (d[k][j] == INF) continue;
                        d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                    }
                }
            }
        }

        public boolean hasNegativeCycle() {
            for (int i = 0; i < size; ++i) {
                if (d[i][i] < 0) return true;
            }
            return false;
        }
    }

    static class InputReader {
        static int BUFSIZE = 32768;

        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), BUFSIZE);
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; ++i) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}
