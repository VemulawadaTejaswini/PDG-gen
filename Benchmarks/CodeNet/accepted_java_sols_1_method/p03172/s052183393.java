

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int arr [] = new int[n];
		int dp[] = new int[k+1];
		for( int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		int mod= (int)1e9 + 7;
		dp[0] =1;
		int dpPrev[] = new int[k+1];
		int sum=0;
		for(int i=1;i<=n;i++) {
			 sum+= arr[i-1];
			 Arrays.fill(dpPrev,0);
			 dpPrev[0]=1;
			 for(int j=1;j<=k;j++)
				 dpPrev[j]=(dpPrev[j-1]%mod + (int)dp[j]%mod)% mod;
			for(int j=1;j<=k; j++) {
			           if(arr[i-1]-j>=0)	
			             dp[j]= dpPrev[j]%mod;
			           else {
			        	   dp[j]=(dpPrev[j] - dpPrev[j-arr[i-1]-1] + mod)%mod;
			           }
			           
			           
			   }
		}
		
		System.out.println(dp[k]);
	}

}
