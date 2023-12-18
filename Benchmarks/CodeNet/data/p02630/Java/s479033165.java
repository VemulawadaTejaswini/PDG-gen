
import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * @author Tran Anh Tai
 * @template for CP codes
 */
public class Main{
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
        static int MOD = 998244353;
        public void solve(InputReader in, PrintWriter out){
            int n = in.nextInt();
            int a[] =new int[n];
            long cnt[] = new long[100001];
            long total = 0;
            for (int i=  0; i < n; i++){
                a[i] = in.nextInt();
                cnt[a[i]]++;
                total+= a[i];
            }
            int q = in.nextInt();
            for (int i = 0; i < q; i++){
                int b = in.nextInt();
                int c = in.nextInt();
                cnt[c] += cnt[b];
                total  += (cnt[b]) * (c - b);
                cnt[b] = 0;
                out.println(total);
            }
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