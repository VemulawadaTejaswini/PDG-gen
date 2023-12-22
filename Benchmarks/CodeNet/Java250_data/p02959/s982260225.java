import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                st = new StringTokenizer(br.readLine());
            } catch (Exception e){e.printStackTrace();}
        }

        public String next() {
            if (st.hasMoreTokens()) return st.nextToken();
            try {st = new StringTokenizer(br.readLine());}
            catch (Exception e) {e.printStackTrace();}
            return st.nextToken();
        }

        public int nextInt() {return Integer.parseInt(next());}

        public long nextLong() {return Long.parseLong(next());}

        public double nextDouble() {return Double.parseDouble(next());}

        public String nextLine() {
            String line = "";
            if(st.hasMoreTokens()) line = st.nextToken();
            else try {return br.readLine();}catch(IOException e){e.printStackTrace();}
            while(st.hasMoreTokens()) line += " "+st.nextToken();
            return line;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        long[] a = new long[n+1];
        for(int i=0;i<=n;i++) a[i] = sc.nextLong();
        long[] b = new long[n];
        for(int i=0;i<n;i++) b[i] = sc.nextLong();

        long ans = 0;

        for(int i=0;i<n;i++) {
            long take = Math.min(a[i], b[i]);
            b[i] -= take;
            long take2 = Math.min(a[i+1], b[i]);
            a[i+1] -= take2;
            ans += take + take2;
        }

        pw.println(ans);
        pw.close();
    }
}
