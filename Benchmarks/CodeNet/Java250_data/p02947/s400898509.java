import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
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
        int N;
        long ans = 0;
        Map<String, Long> anagramCnt = new HashMap<>();

        void solve(InputReader in, PrintWriter out) {
            N = in.nextInt();
            for (int i = 0; i < N; ++i) {
                String s = in.next();
                NavigableMap<Character, Integer> charCnt = new TreeMap<>();
                for (char c : s.toCharArray()) {
                    int v = charCnt.containsKey(c) ? charCnt.get(c) : 0;
                    charCnt.put(c, v + 1);
                }
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<Character, Integer> e : charCnt.entrySet()) {
                    sb.append(e.getKey()).append(e.getValue());
                }
                String key = sb.toString();
                long v = anagramCnt.containsKey(key) ? anagramCnt.get(key) : 0;
                anagramCnt.put(key, v + 1);
            }
            for (long v : anagramCnt.values()) {
                ans += v*(v - 1) / 2;
            }
            out.println(ans);
        }

    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
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

        int[] nextIntArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int size) {
            long[] arr = new long[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}