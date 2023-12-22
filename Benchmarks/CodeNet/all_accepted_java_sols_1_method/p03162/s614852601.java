import java.io.*;
import java.util.*;

import javax.print.attribute.HashAttributeSet;


public class Main {


	public static void main(String[] args) throws Exception{
		BufferedReader  jk =  new BufferedReader(new InputStreamReader( System.in))  ; 
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)) ; 
		StringTokenizer ana = new StringTokenizer(jk.readLine()) ;
		int n = Integer.parseInt(ana.nextToken()) ; 
		           
		int a[] = new int[n] ; 	int b[] = new int[n] ;  int c[] = new int[n] ;
	
		for(int i=0 ; i<n ;i++)
		{
			ana = new StringTokenizer(jk.readLine()) ;
			a[i] = Integer.parseInt(ana.nextToken()) ;  b[i] = Integer.parseInt(ana.nextToken()) ;  c[i] = Integer.parseInt(ana.nextToken()) ; 
		}
		int dp[][]= new int[n][3] ;
	    dp[0][0]= a[0] ; dp[0][1]=b[0] ; dp[0][2]=c[0] ; 
	    for(int i=1 ; i<n ;i++)
	    {
	    	dp[i][0] =Integer.max(dp[i-1][2], dp[i-1][1])+a[i] ; 
	    	dp[i][1] =Integer.max(dp[i-1][2], dp[i-1][0])+b[i] ; 
	    	dp[i][2] =Integer.max(dp[i-1][0], dp[i-1][1])+c[i] ; 
	    }
		
	    out.println(Integer.max(Integer.max(dp[n-1][0], dp[n-1][1]),dp[n-1][2]));















		out.flush();
	}
}

