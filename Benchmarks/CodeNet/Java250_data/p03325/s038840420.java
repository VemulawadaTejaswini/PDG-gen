
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
  //      final FastScanner fs = new FastScanner("/Users/igorz/dev/google-prep/src/main/java/atcoder/abc100/input.txt");
        final FastScanner fs = new FastScanner();

        final int[] arr = fs.nextIntArray();

        int count = 0;

        for (int i : arr) {
            while (i % 2 == 0) {
                count++;
                i /= 2;
            }
        }
        System.out.println(count);
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
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
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int[] nextIntArray() {
            final int N = nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = nextInt();
            }
            return arr;
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
}
