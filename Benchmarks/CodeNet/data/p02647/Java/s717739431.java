import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    static void solve(InputReader in, PrintWriter out){
        /*int n = 200000;
        int[] a = new int[n];
        int[] light;
        int count = 0;
        while(true) {
            light = new int[n];
            for (int i = 0; i < n; i++) {
                if(i-a[i]>=0) light[i-a[i]]++;
                else light[0]++;
                if(i+a[i]+1<n) light[i+a[i]+1]--;
            }
            a[0] = light[0];
            for (int i = 1; i < n; i++) a[i] = a[i-1] + light[i];
            count++;
            if(a[0]==n) {
                break;
            }
        }
        out.println(count);  // 41*/
        int n = in.ni(), k = in.ni();
        int[] a = in.ni(n);
        int[] light = new int[n];
        StringBuilder sb = new StringBuilder();
        if(k < 45) {
            for (int j = 0; j < k; j++) {
                light = new int[n];
                for (int i = 0; i < n; i++) {
                    if(i-a[i]>=0) light[i-a[i]]++;
                    else light[0]++;
                    if(i+a[i]+1<n) light[i+a[i]+1]--;
                }
                a[0] = light[0];
                for (int i = 1; i < n; i++) a[i] = a[i-1] + light[i];
            }
        }
        for (int i = 0; i < n; i++) {
            sb.append(a[i]).append(' ');
        }
        out.println(sb.toString());
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