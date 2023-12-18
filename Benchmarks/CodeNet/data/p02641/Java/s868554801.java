import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int X = fs.nextInt();
        int N = fs.nextInt();

        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < N; ++i) {
            s.add(fs.nextInt());
        }


        int res = -1;
        int min = Integer.MAX_VALUE;
        for (int j = X - 102; j <= X + 102; ++j) {
            if (s.contains(j)) {
                continue;
            }
            else {
                if (Math.abs(X - j) < min) {
                    min = Math.min(min, Math.abs(X - j));
                    res = j;
                }
            }
        }

        System.out.println(res);
   }
}
