import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Reader sc = new Reader();
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            int n = sc.nextInt();
            int[] a = new int[n];
            long sum = 0;
            for(int i=0 ; i<n ; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            int mod = 1_000_000_007;
            long ans = 0;
            for(int i=0 ; i<n ; i++) {
                sum -= a[i];
                ans += (a[i]*(sum%mod))%mod;
                ans %= mod;
            }

            pw.println(ans);

        }
        finally {
            pw.flush();
            pw.close();
        }
    }
    
    static class Reader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while(!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException io) {
                    io.printStackTrace();
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
    }
}
