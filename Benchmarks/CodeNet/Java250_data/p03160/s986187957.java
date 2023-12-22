import java.util.*;
import java.io.*;
class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String in[]=br.readLine().split(" ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(in[i]);
		int dp[]=new int[n];
		Arrays.fill(dp,1000000005);	
		dp[0]=0;	
		for(int i=0;i<n;i++){
			if(i+1 < n)
				dp[i+1] = Math.min(dp[i+1],dp[i]+Math.abs(arr[i]-arr[i+1]));
			if(i+2 < n)
				dp[i+2] = Math.min(dp[i+2],dp[i]+Math.abs(arr[i]-arr[i+2]));
		}
		System.out.println(dp[n-1]);
	}
}