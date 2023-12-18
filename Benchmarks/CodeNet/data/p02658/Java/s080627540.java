import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int n = reader.nextInt();
        BigInteger result = BigInteger.ONE;
        BigInteger max = BigInteger.valueOf(1000000000000000000L);
        for (int i = 0; i < n; i++) {
            long v = reader.nextLong();
            result = result.multiply(BigInteger.valueOf(v));
            if (result.compareTo(max) > 0) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(result);
    }

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble() { return Double.parseDouble(next()); }

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
