import java.io.*;
import java.util.*;
 
public class Main {
    static final long MOD = 1000000007L;
    static final int INF = 50000000;
    static final int NINF = -50000000;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int N = sc.ni();
        long[] nums = new long[N];
        long sum = 0;
        for (int i = 0; i < N; i++) {
        	nums[i] = sc.nl();
        	sum += nums[i];
        }
        sum %= MOD;
        long ans = 0;
        for (int i = 0; i < N; i++) {
        	ans += nums[i]*(sum-nums[i]+MOD);
        	ans %= MOD;
        }
        pw.println((ans*500000004L)%MOD);
        pw.close();
    }
 
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public FastScanner() {
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
 
        int ni() {
            return Integer.parseInt(next());
        }
 
        long nl() {
            return Long.parseLong(next());
        }
 
        double nd() {
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