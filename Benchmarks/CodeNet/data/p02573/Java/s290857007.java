// Born Sinner
// old but im not that old
// fuck all you hoes get a grip
import java.util.*;
import java.lang.*;
import java.io.*;

public class codeforces
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
    static int bfs(Map<Integer,Set<Integer>> g, int u, boolean[] vis){
      if(vis[u]) return 0;
      Queue<Integer> q = new LinkedList<>();
      q.add(u);
      int c = 0;
      Set<Integer> s = new HashSet<>();
      while(!q.isEmpty()){
        int x = q.remove();
        vis[x] = true;
        s.add(x);
        if(g.containsKey(x)) for(int i : g.get(x)) {
          if(!vis[i]) {
            q.add(i);
          }
        }
      }
      return s.size();
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        FastReader in = new FastReader();
        int t = 1;
        //t = in.nextInt();
        while(t-->0){
            int n = in.nextInt(), m = in.nextInt();
            Map<Integer, Set<Integer>> g = new HashMap<>();
            for(int i = 0; i < m; i++) {
              int a = in.nextInt(), b = in.nextInt();
              if(!g.containsKey(a)) {
                g.put(a, new HashSet<>());
              }
              if(!g.containsKey(b)) {
                g.put(b, new HashSet<>());
              }
              g.get(a).add(b);
              g.get(b).add(a);
            }
            int ans = 0;
            boolean[] vis = new boolean[n+1];
            for(int i = 1; i <= n; i++){
              ans = Math.max(ans, bfs(g, i, vis));
            }
            System.out.println(ans);
        }
    }
}
