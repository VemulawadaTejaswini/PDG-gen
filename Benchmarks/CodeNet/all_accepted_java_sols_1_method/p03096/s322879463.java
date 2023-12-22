import java.util.*;
import java.io.*;
import static java.lang.System.in;

public class Main {
    static int n,m;
    static long mod = 1000000000+7;
    // static ArrayList<Integer>[] graph,tree;
    public static void main(String[] args)throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        Scanner sc = new Scanner(System.in);
        //String[] buf = reader.readLine().split(" ");
        n = sc.nextInt();
        int maxn = 200000+5;
        ArrayList<Integer>[] rec = new ArrayList[maxn+1];
        for(int i=0;i<=maxn;i++) rec[i] = new ArrayList<>();
        int[] idx = new int[maxn+1];
        int[] c = new int[n];
        for(int i=0;i<n;i++){
            c[i] = sc.nextInt();
            rec[c[i]].add(i);
        }
        long[] dp = new long[n];
        dp[0] = 1;
        idx[c[0]]++;
        for(int i=1;i<n;i++){
            int cur = c[i];
            if(idx[cur]==0){
                dp[i] = dp[i-1];
            }else{
                int former = rec[cur].get(idx[cur]-1);
                if(former==i-1){
                    dp[i] = dp[i-1];
                } else{
                    if(former==0) dp[i] = (dp[i-1]+1)%mod;
                    else{
                        dp[i] = (dp[i-1]+dp[former])%mod;
                    }
                }
            }
            idx[cur]++;
        }
        System.out.println(dp[n-1]);
    }
}