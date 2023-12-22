import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

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

        void solve(InputReader in, PrintWriter out) {
            Set<Integer> correctSet = new HashSet<>();
            Map<Integer, Integer> penaltyMap = new HashMap<>();
            
            int N = in.nextInt();
            int M = in.nextInt();
            
            for (int i = 0; i < M; ++i) {
                int num = in.nextInt();
                String result = in.next();
                
                if ("AC".equals(result)) {
                    correctSet.add(num);
                } else if (!correctSet.contains(num)) {
                    int val = penaltyMap.containsKey(num) ? penaltyMap.get(num) : 0;
                    penaltyMap.put(num, val + 1);
                }
            }
            
            int correct = correctSet.size();
            int penalty = 0;
            
            for (int num : correctSet) {
                penalty += penaltyMap.containsKey(num) ? penaltyMap.get(num) : 0;
            }
            
            String ans = correct + " " + penalty;
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
