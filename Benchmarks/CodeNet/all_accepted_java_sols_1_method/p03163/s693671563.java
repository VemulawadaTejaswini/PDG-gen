import java.util.*;

public class Main{ 

   public static void main(String args[]) {
	 
     Scanner s=new Scanner(System.in);
    
    	int n=s.nextInt();
    	int w=s.nextInt();
    	int arr[][]=new int[n+1][3];
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=2;j++) {
    		 arr[i][j]=s.nextInt();
    		}
    	}
    	long dp[][]=new long[n+1][w+1];
    	
    	
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=w;j++) {
    			dp[i][j]=dp[i-1][j];
    			if(j-arr[i][1]>=0)
    			dp[i][j]=Math.max(arr[i][2] + dp[i-1][j-arr[i][1]],dp[i][j]);
    		   
    		}
    	 }
    	System.out.println(dp[n][w]);
    	
    }

}