import java.io.*; 
import java.util.*;
import java.util.Map.Entry;

public class Main {



	public static void main(String[] args) throws IOException {
		BufferedReader  jk =  new BufferedReader(new InputStreamReader( System.in))  ; 
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)) ; 
		StringTokenizer ana = new StringTokenizer(jk.readLine()) ;
		int  n =Integer.parseInt(ana.nextToken()) ; 
		int siz = Integer.parseInt(ana.nextToken())  ;
		int v[]= new int[n] ; long w []=new long[n] ; 
		for(int i=0 ; i<n ;i++)
		{
			ana = new StringTokenizer(jk.readLine()) ;
			w[i] = Long.parseLong(ana.nextToken()) ; 
			v[i]= Integer.parseInt(ana.nextToken())  ;
		}
		long dp[][]= new long[n][(n*1000)+1]  ;
		long big = (long) (Math.pow(10, 9)+4) ; 
		for(int i=0 ;i<n ;i++)
		{
			for(int j=0 ; j<=n*1000 ;j++) dp[i][j]=big ; 
		}

		dp[0][0]=0 ; dp[0][v[0]]= w[0]; 
		for(int i=1 ; i<n ;i++)
		{
			for(int ve=0 ;ve<=n*1000 ;ve++ )
			{
				long y = dp[i-1][ve] ; 
				if(y!=big)
				{
					dp[i][ve]= Long.min(dp[i][ve], dp[i-1][ve]) ;
					if(dp[i-1][ve]+w[i]<=siz) dp[i][ve+v[i]] = Long.min(dp[i][ve+v[i]], dp[i-1][ve]+w[i]) ; 
				}
			}
		}
		long res = 0 ;
		for(int j=1000*n ; j>=0 ;j--)
		{
			if(dp[n-1][j]!=big)
			{
				res = j ;  break ; 
			}
		}
		out.println(res);

		out.flush(); 
	}

}


