
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solution solver = new Solution();
        solver.solve(1, in, out);
        out.close();
    }

    static class Solution {
        public void solve(int testNumber, InputReader in, PrintWriter out) {

            int total = in.nextInt();
            String[] keys = {"AC", "WA", "TLE", "RE"};

            Map<String, Integer> hm = new HashMap<String, Integer>();
            for (int n = 0; n < total; n++) {
                String s = in.next();
                if (hm.containsKey(s)) {
                    hm.put(s,  hm.get(s) + 1) ;
                }
                else {
                    hm.put(s, 1);
                }

            }
            for (String k : keys) {
                if (hm.containsKey(k)) {
                    System.out.println(k + " x " + hm.get(k));
                }
                else {
                    System.out.println(k + " x " + 0);
                }

            }

        }
    }

    static class InputReader {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
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

        public String nextLine() {
            String inputLine = "";
            try {
                inputLine = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return inputLine;
        }
    }
}



