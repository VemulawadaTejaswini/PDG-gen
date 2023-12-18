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
 * @author shivam
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            HashMap<String, Integer> map = new HashMap<>();
            map.put("AC", 0);
            map.put("WA", 0);
            map.put("TLE", 0);
            map.put("RE", 0);
            for (int i = 0; i < n; i++) {
                String s = in.next();
                if (s.equals("AC")) map.put("AC", map.get("AC") + 1);
                if (s.equals("WA")) map.put("WA", map.get("WA") + 1);
                if (s.equals("TLE")) map.put("TLE", map.get("TLE") + 1);
                if (s.equals("RE")) map.put("RE", map.get("RE") + 1);
            }
            out.println("AC" + " " + "x" + " " + map.get("AC"));
            out.println("WA" + " " + "x" + " " + map.get("WA"));
            out.println("TLE" + " " + "x" + " " + map.get("TLE"));
            out.println("RE" + " " + "x" + " " + map.get("RE"));
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

