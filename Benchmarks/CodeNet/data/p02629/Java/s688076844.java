
import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * @author Tran Anh Tai
 * @template for CP codes
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
        public void solve(InputReader in, PrintWriter out){
            long n = in.nextLong();
            int d = 1;
            long cur =26;
            long total = 26;
            while (total < n){
                cur *= 26;
                total += cur;
                d++;
            }
            n -= total / 26;
            String r = "";
            for (int i = 0; i < d; i++){
                int x = (int)(n % 26);
                n /= 26;
                r =  (char)(x +'a')+ r;
            }
            out.println(r);
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