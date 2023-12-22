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
 * @author dyominov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AAtCoderBeginnerContest999 solver = new AAtCoderBeginnerContest999();
        solver.solve(1, in, out);
        out.close();
    }

    static class AAtCoderBeginnerContest999 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            char[] arr = in.next().toCharArray();
            char[] res = new char[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '1') {
                    res[i] = '9';
                } else if (arr[i] == '9') {
                    res[i] = '1';
                } else {
                    res[i] = arr[i];
                }
            }
            for (char c : res) {
                out.print(c);
            }
        }

    }

    static class InputReader implements AutoCloseable {
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

        public void close() {
        }

    }
}

