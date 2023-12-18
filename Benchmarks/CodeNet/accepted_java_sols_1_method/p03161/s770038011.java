import java.util.*;
import java.io.*;
class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp[]=br.readLine().split(" ");
		int n = Integer.parseInt(inp[0]);
		int k = Integer.parseInt(inp[1]);
		String in[]=br.readLine().split(" ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(in[i]);
		int dp[]=new int[n];
		Arrays.fill(dp,1000000005);	
		dp[0]=0;	
		for(int i=0;i<n;i++){
			for(int j=1;j<=k;j++){
				if(i+j <n)
					dp[i+j]=Math.min(dp[i+j],dp[i]+Math.abs(arr[i]-arr[i+j]));
			}	

		}
		System.out.println(dp[n-1]);
	}
}