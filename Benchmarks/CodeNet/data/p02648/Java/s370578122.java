import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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

    private static long solve(int[] v,int w[],int vertex,int l){
        List<Integer> vals = new ArrayList<>();
        List<Integer> wts = new ArrayList<>();
        int vert = vertex;
        while(vert>=1){
            vals.add(v[vert]);
            wts.add(w[vert]);
            vert>>=1;
        }
        long[][] dp = new long[vals.size()][l+1];
        init(dp);
        return knapsack(vals,wts,vals.size()-1,l,dp);
    }

    private static void init(long[][] dp){
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
    }

    private static long knapsack(List<Integer> vals,List<Integer> wts,int vertex,int l,long[][] dp){
        if(vertex<0)
            return 0;
        if(dp[vertex][l]!=-1)
            return dp[vertex][l];
        long ans = knapsack(vals,wts,vertex-1,l,dp);
        if(wts.get(vertex)<=l)
            ans = Math.max(ans,knapsack(vals,wts,vertex-1,l-wts.get(vertex),dp)+vals.get(vertex));
        dp[vertex][l] = ans;
        return ans;
    }



}