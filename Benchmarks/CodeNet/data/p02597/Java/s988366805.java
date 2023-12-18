import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        int n = in.ni();
        char[] s = in.ns().toCharArray();
        int[] Wl = new int[n];
        int[] Rr = new int[n];
        Wl[0] = (s[0]=='W')?1:0;
        for (int i = 1; i < n; i++) {
            Wl[i] = Wl[i-1];
            if(s[i]=='W') Wl[i] += 1;
        }
        Rr[n-1] = (s[n-1]=='R')?1:0;
        for (int i = n-2; i >= 0; i--) {
            Rr[i] = Rr[i+1];
            if(s[i]=='R') Rr[i] += 1;
        }
        int ans = Math.min(Wl[n-1], Rr[0]);
        for (int i = 0; i < n-1; i++) {
            ans = Math.min(ans, Math.max(Wl[i], Rr[i + 1]));
        }
        out.println(ans);
    }

    public static void main(String[] args){
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        solve(in, out);
        out.close();
    }
    public static class InputReader{
        private BufferedReader br;
        private StringTokenizer st;
        public InputReader(InputStream is){
            br = new BufferedReader(new InputStreamReader(is));
            st = null;
        }
        public String ns(){
            if(st == null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (Exception e){
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }
        public int ni(){
            return Integer.parseInt(ns());
        }
        public long nl(){
            return Long.parseLong(ns());
        }
        public double nd(){
            return Double.parseDouble(ns());
        }
        public char nc(){
            return ns().toCharArray()[0];
        }
        public int[] ni(int n){
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = ni();
            }
            return a;
        }
        public long[] nl(int n){
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nl();
            }
            return a;
        }
        public double[] nd(int n){
            double[] a = new double[n];
            for (int i = 0; i < n; i++) {
                a[i] = nd();
            }
            return a;
        }
    }
}