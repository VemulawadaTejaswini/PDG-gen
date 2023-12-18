// Born Sinner
// old but im not that old
// fuck all you hoes get a grip
import java.util.*;
import java.lang.*;
import java.io.*;

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
    static class pair<T1, T2>{
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
        String n = in.next();

        long s = 0;
        for(int i = 0; i < n.length(); i++){
            long x = (n.charAt(i) - '0');
            s += x;
        }
        System.out.println((s%9 == 0)?"Yes":"No");
    }
}
