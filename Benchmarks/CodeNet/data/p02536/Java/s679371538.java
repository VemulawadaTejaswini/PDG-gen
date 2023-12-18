// Born Sinner
// old but im not that old
// fuck all you hoes get a grip
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

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
    static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        FastReader in = new FastReader();
        int n = in.nextInt(), m = in.nextInt();
        Map<Integer, LinkedList<Integer>> g = new HashMap<>();
        for(int i = 0; i < m; i++){
            int x = in.nextInt(), y = in.nextInt();
            if(!g.containsKey(x)) g.put(x, new LinkedList<Integer>());
            if(!g.containsKey(y)) g.put(y, new LinkedList<Integer>());
            g.get(x).add(y);
            g.get(y).add(x);
        }
        boolean[] vis = new boolean[n+1];
        int ans = 0;
        for(int i = 1; i <= n; i++){
            if(vis[i]) continue;
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            vis[i] = true;
            while(!q.isEmpty()){
                int j = q.remove();
                vis[j] = true;
                if(!g.containsKey(j)) continue;
                for(int k : g.get(j)){
                    if(!vis[k]){
                        q.add(k);
                    }
                }
            }
            ans++;
        }
        System.out.println(ans-1);
    }
}
