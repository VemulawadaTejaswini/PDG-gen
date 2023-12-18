import java.util.*;


import java.io.*;



public class Main 
{   
	
	//static int dp[][];
	public static void main(String[] args) throws IOException 
	{ 
		 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer s=new StringTokenizer(br.readLine());
		
		int n=Integer.parseInt(s.nextToken());
		int k=Integer.parseInt(s.nextToken());
		
		int dp[][]=new int[n+1][k+1];
		
		int ar[]=new int[n+1];
		s=new StringTokenizer(br.readLine());
		
		for(int i=1;i<=n;i++) {
			ar[i]=Integer.parseInt(s.nextToken());
			
		}
		
			for(int j=0;j<=k;++j) dp[1][j] = (j > ar[1])?0:1;
		for(int i=2;i<=n;i++) {
			
			for(int j=0;j<=k;j++) {
				if(j==0)
					dp[i][j]=dp[i-1][j];
				else {
					dp[i][j]=(dp[i][j-1]+dp[i-1][j])%1000000007;
					if(j-1-ar[i] >= 0) dp[i][j] = (dp[i][j] - dp[i-1][j-1-ar[i]] + 1000000007)%1000000007;
			}}
		}
		

//		for(int i=0;i<=n;i++) {
//			for(int j=0;j<=k;j++)
//				pw.print(dp[i][j]+" ");
//			pw.println();
//		}
		
		pw.print(dp[n][k]);
		
		
				pw.close();
	
	}
	
	
}