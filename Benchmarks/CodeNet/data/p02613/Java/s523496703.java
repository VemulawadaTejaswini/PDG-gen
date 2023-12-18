import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AnandOza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BJudgeStatusSummary solver = new BJudgeStatusSummary();
        solver.solve(1, in, out);
        out.close();
    }

    static class BJudgeStatusSummary {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            Counter<String> counter = new Counter<>();
            String[] LIST = {"AC", "WA", "TLE", "RE"};

            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                counter.incr(in.next());
            }

            for (String s : LIST) {
                out.println(s + " x " + counter.count.getOrDefault(s, 0));
            }
        }

    }

    static class Counter<T> {
        public HashMap<T, Integer> count = new HashMap<>();

        public void incr(T key) {
            count.merge(key, 1, Integer::sum);
        }

    }

    static class InputReader {
        public BufferedReader reader;
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
}

