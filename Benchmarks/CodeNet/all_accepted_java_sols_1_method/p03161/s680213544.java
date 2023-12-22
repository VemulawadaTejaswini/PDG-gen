import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int h[]=new int[n+1];
        for(int i=1;i<=n;i++)
        h[i]=sc.nextInt();
      
       int dp[]=new int[n+1];
       dp[1]=0;
       for(int i=2;i<=n;i++)
       {
           dp[i]=1000000000;
          for(int j=i-1;j>=1 && (i-j)<=k;j--)
          {
              dp[i]=Math.min(dp[i],dp[j]+Math.abs(h[i]-h[j]));
          }
       }
        System.out.println(dp[n]);        
    }
}