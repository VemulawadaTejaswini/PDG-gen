import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;
import java.math.*;

public class Main
{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try{
                str = br.readLine();
            } catch (Exception e){
                e.printStackTrace();
            }
            return str;
        }
    }
    static int modPower(int x, int y, int mod){
        int res = 1;
        x %= mod;
        if(x==0) return 0;
        while(y>0){
            if(y%2==1){
                res = (res*x)%mod;
            }
            y = y>>1;
            x = (x*x)%mod;
        }
        return res;
    }
    public static int[] readArray(int n){
        FastReader in = new FastReader();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = in.nextInt();
        return a;
    }
    static class pair<T1,T2>{
        T1 first;
        T2 second;
        pair(T1 first, T2 second){
            this.first = first;
            this.second = second;
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        FastReader in = new FastReader();
        int n = in.nextInt(), q = in.nextInt();
        int[] l = new int[q], r = new int[q], d = new int[q];
        StringBuffer s = new StringBuffer();
        for(int i = 0; i < n; i++) s.append("1");
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        for(int i = 0; i < q; i++){
            l[i] = in.nextInt() - 1;
            r[i] = in.nextInt();
            d[i] = in.nextInt();
            for(int j = l[i]; j < r[i]; j++) s.setCharAt(j, (char)(d[i] + '0'));
            //s.replace(l[i], r[i], Integer.toString(d[i]));
            System.out.println((new BigInteger(s.toString())).mod(new BigInteger("998244353")));
        }
    }
}
