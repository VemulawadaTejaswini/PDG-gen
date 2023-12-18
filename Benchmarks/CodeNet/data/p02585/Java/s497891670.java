/*
 * author: Anuj Sahai
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    private static class Solution {
        void solve() {
            final int n = or.nextInt();
            final long k = or.nextLong();
            long maxScore = 0;

            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = or.nextInt();
            }
            long[] c = new long[n];
            for (int i = 0; i < n; i++) {
                c[i] = or.nextLong();
            }

//            long[] scores = new long[n];
            long score;
            int square;
            for (int i = 1; i <= n; i++) {
                square = i - 1;
                score = 0;
                for (int j = 0; j < k; j++) {
                    square = p[square] - 1;
//                    if (square < i) {
//                        score += scores[square];
//                        break;
//                    }
                    score += c[square];
                }
//                pw.println((i - 1) + ", " + score);
//                scores[i - 1] = score;
                maxScore = Math.max(maxScore, score);
            }
            pw.println(maxScore);
        }

        final PrintWriter pw; // pw.println(...);
        final OpReader or; // or.next...();

        Solution() {
            pw = new PrintWriter(System.out);
            or = new OpReader();
        }

        void tearDown() {
            pw.close();
        }
    }

    private static class OpReader {
        final BufferedReader br;
        StringTokenizer st;

        public OpReader() {
            br = new BufferedReader(new InputStreamReader(System.in), 32 * 1024);
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
    }

    public static void main(String[] args) {
        final Solution solution = new Solution();
        solution.solve();
        solution.tearDown();
    }
}
