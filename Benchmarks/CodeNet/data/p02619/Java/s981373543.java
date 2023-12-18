import java.io.*;
import java.util.*;

public class Main {
    public static final long mod = (long)1e9+7;
    public static final long INF = Long.MAX_VALUE/2;
    public static final int inf = Integer.MAX_VALUE/2;

    public static int d;
    public static int[] last;
    public static long[] c;
    public static long[][] s;

    static void solve(InputReader in, PrintWriter out){
        int d = in.ni();
        c = in.nl(26);
        last = new int[26];
        s = new long[d][26];
        for (int i = 0; i < d; i++) s[i] = in.nl(26);

        int[] answer  = in.ni(d);
        long score = 0;
        for (int i = 0; i < d; i++) {
            score = score(score, answer[i], i+1);
            out.println(score);
        }

    }
    static long score(long score, int t, int day){  // 1-indexedで受け取る
        last[t-1] = day;
        score += s[day-1][t-1];
        for (int i = 0; i < 26; i++) {
            score -= c[i]*(day-last[i]);
        }
        return  score;
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