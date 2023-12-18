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
 *
 * @author lucasr
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FBraveCHAIN solver = new FBraveCHAIN();
        solver.solve(1, in, out);
        out.close();
    }

    static class FBraveCHAIN {
        static int N;
        static int[][] table;
        static int[] first;
        static int[] second;
        static int[] third;
        static int[][] vals;
        static int[][] fulls;

        public void solve(int testNumber, MyScanner sc, PrintWriter out) {
            N = sc.nextInt();
            table = new int[N + 1][N + 1];
            for (int i = 0; i < N + 1; i++) {
                Arrays.fill(table[i], -1);
            }
            first = new int[N];
            Arrays.fill(first, -1);
            second = new int[N];
            Arrays.fill(second, -1);
            third = new int[N];
            Arrays.fill(third, -1);
            vals = new int[N + 1][];
            for (int i = 0; i <= N; i++) {
                int tot = 3;
                if (i == 0) tot = 2;
                else if (i == N) tot = 1;
                vals[i] = new int[tot];
                for (int j = 0; j < tot; j++) {
                    int vv = sc.nextInt() - 1;
                    vals[i][j] = vv;
                    if (first[vv] == -1) {
                        first[vv] = i;
                    } else if (second[vv] == -1) {
                        second[vv] = i;
                    } else {
                        third[vv] = i;
                    }
                }
            }

            fulls = new int[N + 1][N + 2];
            for (int i = 0; i < N + 1; i++) {
                for (int j = i + 1; j < N + 2; j++) {
                    fulls[i][j] = fulls[i][j - 1] + full(j - 1);
                }
            }
            out.println(calc(N, N));
        }

        static int full(int index) {
            if (0 < index && index < N) {
                if (vals[index][0] == vals[index][1] && vals[index][1] == vals[index][2]) return 1;
            }
            return 0;
        }

        static int calc(int usedFrom, int upTo) {
            if (usedFrom >= upTo) usedFrom = N;
            int ret = table[usedFrom][upTo];
            if (ret != -1) return ret;
            ret = 0;
            if (upTo > 0) {
                ret = calc(usedFrom, upTo - 1);
                for (int i = 0; i < vals[upTo].length; i++) {
                    int cur = vals[upTo][i];
                    if (third[cur] == upTo) {
                        int[] tmp = new int[3];
                        int leftNeed = 0;
                        if (first[cur] < upTo) tmp[leftNeed++] = first[cur];
                        if (second[cur] < upTo) tmp[leftNeed++] = second[cur];
                        if (usedFrom < upTo) tmp[leftNeed++] = usedFrom;
                        if (leftNeed <= 2) {
                            Arrays.sort(tmp, 0, leftNeed);
                            if (leftNeed == 2) {
                                int next = tmp[1];
                                ret = Math.max(ret, fulls[next + 1][upTo] + 1 + calc(tmp[0], next));
                            } else if (leftNeed == 1) {
                                ret = Math.max(ret, 1 + calc(tmp[0], upTo - 1));
                            } else {
                                ret = Math.max(ret, 1 + calc(N, upTo - 1));
                            }
                        }
                    }
                }
            }
            return table[usedFrom][upTo] = ret;
        }

    }

    static class MyScanner {
        private BufferedReader br;
        private StringTokenizer tokenizer;

        public MyScanner(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(br.readLine());
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
}

