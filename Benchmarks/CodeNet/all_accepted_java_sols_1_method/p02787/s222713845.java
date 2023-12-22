import java.util.Scanner;
import java.util.Arrays;
public class Main {

	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n+1];
        long b[] = new long[n+1];
        for(int i=1;i<=n;i++) {
            a[i]=sc.nextInt();
            b[i]=sc.nextLong();
        }
        int max=(int)Math.pow(10,4);
        long dp[][] = new long[n+1][max+1];
        for(long row[]:dp)
        {
            Arrays.fill(row,Long.MAX_VALUE);
        }
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=0;
        }
        for(int i=1;i<=max;i++) dp[0][i]=Long.MAX_VALUE;
        long min=Long.MAX_VALUE;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=max;j++)
            {
                if(a[i]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else if(dp[i-1][j-a[i]]!=Long.MAX_VALUE && dp[i-1][j-a[i]]!=Long.MAX_VALUE)
                {
                    dp[i][j]=Math.min(dp[i-1][j-a[i]]+b[i],Math.min(dp[i-1][j],dp[i][j-a[i]]+b[i]));
                }
                else if(dp[i-1][j-a[i]]!=Long.MAX_VALUE)
                {
                    dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j-a[i]]+b[i]);
                }
                else if(dp[i][j-a[i]]!=Long.MAX_VALUE)
                {
                    dp[i][j]=Math.min(dp[i-1][j],dp[i][j-a[i]]+b[i]);
                }
                else dp[i][j]=dp[i-1][j];
                if(j>=h) min=Math.min(min,dp[i][j]);
                
                
            }
            
        }
        System.out.println(min);
	}
}