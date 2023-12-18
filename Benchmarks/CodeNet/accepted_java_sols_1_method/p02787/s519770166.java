import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] t=br.readLine().split("\\ ");
        int H=Integer.parseInt(t[0]); int N=Integer.parseInt(t[1]);
        int[] dmg=new int[N];
        int[] cost=new int[N];
        for(int i=0;i<N;i++){
            t=br.readLine().split("\\ ");
            dmg[i]=Integer.parseInt(t[0]);
            cost[i]=Integer.parseInt(t[1]);
        }
        int[] dp=new int[H+1];
        Arrays.fill(dp,1555555555);
        dp[0]=0;
        for(int i=1;i<=H;i++){
            for(int j=0;j<N;j++){
                dp[i]=Math.min(dp[i],cost[j]+dp[Math.max(i-dmg[j],0)]);
            }
        }
        System.out.println(dp[H]);
    }
    
}
