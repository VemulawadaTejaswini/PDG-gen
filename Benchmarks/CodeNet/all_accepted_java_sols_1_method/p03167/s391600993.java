import java.io.*;
import java.util.*;

public class Main {

		
	
	public static void main(String[] args) throws Exception{
		BufferedReader  jk =  new BufferedReader(new InputStreamReader( System.in))  ; 
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)) ; 
		StringTokenizer ana = new StringTokenizer(jk.readLine()) ;
		int n =Integer.parseInt(ana.nextToken()) ; 
		int m = Integer.parseInt(ana.nextToken()) ;
		boolean mat[][]= new boolean[n][m] ; 
	    for(int i=0 ; i<n ;i++)
	    {
	    	String s= jk.readLine() ; 
	    	for(int j=0 ; j<m ;j++)
	    	{
	    		if(s.charAt(j)=='.') mat[i][j]=true ;
	    	}
	    }
	    long dp[][]= new long[n][m] ; 
	    dp[0][0] = 1 ;
	    long big = (long) (Math.pow(10, 9)+7) ; 
	    for(int i=1 ;i<n ;i++)
	    {
	    	if(mat[i][0])
	    	{
	    		if(dp[i-1][0]==1) dp[i][0]=1 ; 
	    	}
	    	
	    }
	    for(int j=1 ;j<m ;j++)
	    {
	    	if(mat[0][j])
	    	{
	    		if(dp[0][j-1]==1) dp[0][j]=1 ;
	    	}
	    }
	    for(int i=1 ;i<n ;i++)
	    {
	    	for(int j=1 ; j<m ;j++)
	    	{
	    		if(mat[i][j])
	    		{
	    			long y = dp[i-1][j]+dp[i][j-1] ; 
		    		if(y>=big)  y%=big ;
		    		dp[i][j]= y ; 
	    		}
	    		else dp[i][j]=0 ; 
	    		
	    	}
	    }
	    out.println(dp[n-1][m-1]);

		



		out.flush();
	}
}

