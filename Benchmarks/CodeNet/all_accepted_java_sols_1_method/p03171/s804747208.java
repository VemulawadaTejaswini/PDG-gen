import java.util.*;


import java.io.*;
 
 
 
public class Main 
{   
	
	static long MOD=(long) (1e9+7);
	public static void main(String[] args) throws IOException 
	{ 
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer s=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(s.nextToken());
		 s=new StringTokenizer(br.readLine());
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(s.nextToken());
		}
		long[][] dp = new long[n][n];
       

		for(int L = n-1; L >= 0; --L) {
			for(int R = L; R < n; ++R) {
				if(R==L) dp[L][R] = arr[L];
				else dp[L][R] = Math.max(arr[L] - dp[L+1][R], arr[R] - dp[L][R-1]);
			}
		}
		
		

        pw.println(dp[0][n-1]);
		
		pw.close();
		
	}
	
	
	
	
	
}