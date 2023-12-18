import java.io.*;

public class Main {
	static long[] dp;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    long[] arr = new long[n];
	    dp = new long[n];
	    String[] str = br.readLine().split(" ");
	    for(int i=0; i<n; i++) {
	    	arr[i] = Long.parseLong(str[i]);
	    	dp[i] = -1;
	    }
	    for(int i=0; i<n; i++) {
	    	if(i==0) dp[i] = 0;
	    	else if(i==1) dp[i] = Math.abs(arr[1]-arr[0]);
	    	else dp[i] = Math.min(dp[i-1]+Math.abs(arr[i]-arr[i-1]), dp[i-2]+Math.abs(arr[i]-arr[i-2]));
	    }
	    System.out.println(dp[n-1]);
	}
}
