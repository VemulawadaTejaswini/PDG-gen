import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastInput in = new FastInput();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        long[] arr = new long[n];
        long modulo = 1000 * 1000 * 1000 + 7;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
            sum += arr[i];
            sum %= modulo;
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            sum -= arr[i];
            if (sum < 0) sum += modulo;
            ans += arr[i] * sum;
            ans %= modulo;
        }
        out.println(ans);
        out.close();
    }

    static class FastInput {
        BufferedReader br;
        StringTokenizer st;

        public FastInput() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
