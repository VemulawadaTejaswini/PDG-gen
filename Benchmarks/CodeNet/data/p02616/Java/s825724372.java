import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

/**
 * @author Tran Anh Tai
 * @template for CP codes
 * What a trick prob!
 */
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
    // main solver
    static class Task{
        static int MOD = 1000000007;
        public void solve(InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++){
                a[i] = in.nextLong();
            }
            long result = 1;
            Arrays.sort(a);

            int end = n - 1;
            int beg = 0;
            while (k > 1){
                long x = a[end] * a[end - 1];
                long y = a[beg] * a[beg + 1];
                if (x > y){
                    result = ((result * x % MOD) % MOD + MOD) % MOD;
                    end -= 2;
                }
                else{
                    result = ((result * y % MOD) % MOD + MOD) % MOD;
                    beg += 2;
                }
                k -= 2;
            }
            if (k == 1){
                result = ((result * a[end]) % MOD + MOD) % MOD;
            }

            out.println(result);
        }
    }
    // fast input reader class;
    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextToken() {
            while (st == null || !st.hasMoreTokens()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (line == null) {
                    return null;
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextToken());
        }
        public long nextLong(){
            return Long.parseLong(nextToken());
        }
    }
}