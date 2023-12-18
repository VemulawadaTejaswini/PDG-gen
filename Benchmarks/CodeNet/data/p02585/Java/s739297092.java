import java.io.*;
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final FastReader s=new FastReader();
        int n = s.nextInt();
        int k = s.nextInt();

        int[] p = new int[n+1];
        for(int i=0;i<n;i++){
            p[i+1] = s.nextInt();
        }
        
        long[] c = new long[n+1];
        for(int i=0;i<n;i++){
            c[i+1] = s.nextLong();
        }
        
        long max = Integer.MIN_VALUE;
        long[] dp = new long[n+1];
        for(int i=1;i<=k;i++){
            long[] temp = new long[n+1];
            for(int j=1;j<=n;j++){                
                temp[j] = dp[p[j]] + c[p[j]];
                // System.out.println(j+" "+i+" "+dp[j][i]);
                max = Math.max(max, temp[j]);
            }
            dp = temp;
        }
        

        System.out.println(max);
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (final IOException  e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (final IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}