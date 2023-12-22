/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args)throws IOException{
		//code
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[]s=br.readLine().split("\\s+");
		
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
		    int []ar=new int[n];
		    s=br.readLine().split("\\s+");
		    for(int i=0;i<n;i++){
		        ar[i]=Integer.parseInt(s[i]);
            }
            int dp[]=new int[n];
            Arrays.fill(dp,Integer.MAX_VALUE);
            dp[0]=0;
            for(int i=1;i<n;i++){
                for(int j=i-1;j>=0&&j>=i-k;j--){
                    dp[i]=Math.min(Math.abs(ar[i]-ar[j])+dp[j],dp[i]);
                }
            }
            System.out.print(dp[n-1]);
		
		    
	
		
	}
}
