import java.awt.*;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),W=sc.nextInt();
        int w[]=new int[n+1];int v[]=new int[n+1];
        int sum=0;
        for (int i=1;i<=n;i++){
            w[i]=sc.nextInt();
            v[i]=sc.nextInt();
            sum+=v[i];
        }
        long dp[]=new long[sum+1];Arrays.fill(dp,(long)1e18);dp[0]=0;
        for (int i=1;i<=n;i++){
            for (int j=sum;j>=v[i];j--){
                dp[j]=Math.min(dp[j],dp[j-v[i]]+w[i]);
            }
        }
        int ans=0;
        for (int i=0;i<=sum;i++){
            if (dp[i]<=W)ans=Math.max(i,ans);
        }
        System.out.println(ans);
    }
}