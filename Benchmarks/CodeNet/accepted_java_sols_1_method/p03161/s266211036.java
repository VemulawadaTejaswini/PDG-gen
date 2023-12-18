import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=0,n=0,k=0;
        n=sc.nextInt();
        k=sc.nextInt();
        int a[]=new int[n];
        int dp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            dp[i]=1000000000;
        }
        
        dp[0]=0;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=k;j++)
            {
                if(i+j<n)
           dp[i+j]=Math.min(dp[i+j],(dp[i]+Math.abs(a[i+j]-a[i])));
        }
    }
     System.out.println(dp[n-1]);
}
}
