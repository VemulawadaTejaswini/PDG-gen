import java.util.*;
public class Main {
    public static void main(String args[]) {
     Scanner s=new Scanner(System.in);
    
    	int n=s.nextInt();
    	int w=s.nextInt();
    	int arr[][]=new int[n+1][3];
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=2;j++) {
    		 arr[i][j]=s.nextInt(); // w v
    		                        //1   2
    		}
    	}
    	int maxval=n*1000;
    	long dp[][]=new long[n+1][maxval+1];
    	
    	for(int i=0;i<=maxval;i++) {
    		dp[1][i]=Integer.MAX_VALUE;
    	}
    	
    	dp[1][0]=0;
    	dp[1][arr[1][2]]=arr[1][1];
    	
    	for(int i=2;i<=n;i++) {
    		for(int v=0;v<=maxval;v++) {
    			dp[i][v]=dp[i-1][v];
    			if(arr[i][2]>v) {
    				continue;
    			}
    			dp[i][v]=Math.min(arr[i][1] + dp[i-1][v-arr[i][2]],dp[i][v]);
    		   
    		}
    	 }
    	long ans=0;
    	for(int i=0;i<=maxval;i++) {
    		
    			if(dp[n][i]<=w) {
    				ans=i;
    			}
    		
    	}
    	System.out.println(ans);
    	
    }
}