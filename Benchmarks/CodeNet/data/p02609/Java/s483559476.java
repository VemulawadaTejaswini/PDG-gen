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
        int t = 1;
        while(t-->0){
            int n = in.nextInt();
            String s = in.next();
            //int x = Integer.parseInt(s,2);
            for(int i = 0; i < n; i++){
                //System.out.println("run");
                char c = s.charAt(i);
                char ch = (c == '1')?('0'):('1');
                String x = "";
                if(i > 0){
                    x+=s.substring(0,i);
                }
                x += Character.toString(ch);
                if(i < n-1){
                    x+=s.substring(i+1);
                }
                int a = Integer.parseInt(x,2);
                int cnt = 0;
                while(a>0){
                    a = (a%Integer.bitCount(a));
                    cnt++;
                }
                System.out.println(cnt);
            }
        }
    }
}
