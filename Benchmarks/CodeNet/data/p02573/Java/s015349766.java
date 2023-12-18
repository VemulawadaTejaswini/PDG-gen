import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Problem solver = new Problem();
        solver.solve(0, in, out);
        out.close();
    }

    static class Problem {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt(), M = in.nextInt();
            Map<Integer, Set<Integer>> map = new HashMap<>();

            for(int i = 0; i < M; i++) {
                int u = in.nextInt(), v = in.nextInt();
                if((map.containsKey(u) && map.get(u).contains(v))
                        || (map.containsKey(v) && map.get(v).contains(u)))
                    continue;
                else if(map.containsKey(u)) map.get(u).add(v);
                else if(map.containsKey(v)) map.get(v).add(u);
                map.computeIfAbsent(u, k -> new HashSet<>()).add(v);
                map.computeIfAbsent(v, k -> new HashSet<>()).add(u);
            }

            int res = 0;
            for(Set<Integer> set : map.values()) {
                res = Math.max(res, set.size() + 1);
            }

            out.println(res);
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

