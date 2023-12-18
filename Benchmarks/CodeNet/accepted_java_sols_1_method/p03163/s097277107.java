import java.util.*;
public class Main{


public static void main (String []args)
{
	Scanner scan=new Scanner(System.in);
	//long t=scan.nextLong();
	//long ways[]=new long[1000000000];
	//ways[1]=1;
	//ways[i]=ways[i-1]*2;
	
	//while(t-->0){
         int n=scan.nextInt();
         int weight=scan.nextInt();
         int w[]=new int[n];
         long v[]=new long[n];
         // int c[]=new int[n];
        // int dp[]=new int[n];
        for(int i=0;i<n;i++)
       {  w[i]=scan.nextInt();
          v[i]=scan.nextLong();
         // c[i]=scan.nextInt();
       }
       
	long dp[][]=new long[n][weight+1];
	for(int j=1;j<=weight;j++)
		{  
			if(j<w[0])
			dp[0][j]=0;
			else 
			dp[0][j]=v[0];
			}
        
	for(int i=1;i<n;i++)
	{
		for(int j=1;j<=weight;j++)
		{  
			if(j<w[i])
			dp[i][j]=dp[i-1][j];
			else 
			dp[i][j]=Math.max(dp[i-1][j-w[i]]+v[i],dp[i-1][j]);
			}
		}
	
	
         
         System.out.println(dp[n-1][weight]);
//}//
}
}
