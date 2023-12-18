import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final  Map<Pair,Long> dp = new HashMap<>();
    public static void main(String args[]) throws Exception {
        int n = Integer.parseInt(br.readLine());
        int[] v = new int[n+1];
        int[] w = new int[n+1];
        String[] tokens = null;
        for(int i=1;i<=n;i++){
            tokens = br.readLine().split(" ");
            v[i] = Integer.parseInt(tokens[0]);
            w[i] = Integer.parseInt(tokens[1]);
        }
        int q = Integer.parseInt(br.readLine());;
        while(q-->0){
            tokens = br.readLine().split(" ");
            int vertex = Integer.parseInt(tokens[0]);
            int l  = Integer.parseInt(tokens[1]);
            System.out.println(solve(v,w,vertex,l));
        }
    }

    private static long solve(int[] v,int[] w,int vertex,int l){
        Pair p = new Pair(vertex,l);
        if(dp.containsKey(p))
            return dp.get(p);
        if(vertex==0)
            return 0;
        long ans = solve(v,w,vertex/2,l);
        if(w[vertex]<=l)
            ans = Math.max(ans,solve(v,w,vertex/2,l-w[vertex])+v[vertex]);
        dp.put(p,ans);
        return ans;
    }


   private static class Pair{
        int vertex;
        int weight;

        public Pair(int vertex,int weight){
            this.vertex = vertex;
            this.weight = weight;
        }

        public int hashCode(){
            return Objects.hash(vertex,weight);
        }

        public boolean equals(Object obj){
            if(obj==null || !(obj instanceof Pair))
                return false;
            Pair pair = (Pair)obj;
            return pair.vertex == vertex && pair.weight == weight;
        }
   }
}