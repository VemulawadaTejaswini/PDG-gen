import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vikas.k
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int[] group = new int[9];

            int N = in.nextInt();

            for (int i = 1; i <= N; i++) {
                int a = in.nextInt() / 400;

                if (a >= 8) {
                    group[8]++;
                } else {
                    group[a]++;
                }
            }

            int min = 0;
            for (int i = 0; i <= 7; i++) {
                if (group[i] > 0) min++;
            }

            if (group[8] > 0) {
                min = Math.max(1, min);
            }

            for (int i = 0; i <= 7; i++) {
                if (group[i] == 0 && group[8] > 0) {
                    group[i]++;
                    group[8]--;
                }
            }

            int max = 0;
            for (int i = 0; i <= 7; i++) {
                if (group[i] > 0) max++;
            }

            max += group[8];

            out.print(min + " " + max);
        }

    }

    static class FastScanner {
        private BufferedReader bufferedReader;
        private StringTokenizer stringTokenizer;

        public FastScanner(InputStream inputStream) {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        }

        public String next() {
            if (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

