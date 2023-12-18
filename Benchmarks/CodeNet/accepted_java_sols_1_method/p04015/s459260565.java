import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeMap;






public class Main {
	  static int MOD=1000000007;
	  static long p[][]=new long[405][405];
	  static long sum[][]=new long[405][405];
	  static long dp[][]=new long[61][25005];
	  static long a[]=new long[405];
	  static long b[]=new long[405];
      public static void main(String[] args) {
    	  Scanner in=new Scanner( new BufferedReader(new InputStreamReader(System.in)))	;
          int n=in.nextInt(),m=in.nextInt();
         
          for(int i=0;i<=60;i++)
          {
        	 dp[i]=new long[25005];
          }
          for(int i=1;i<=n;i++)
          {
        	  a[i]=in.nextInt();
          }
          int v=m*n;
          
      
          dp[0][0]=1;
          for(int i=1;i<=n;i++)
          {
        	 
        	for(int j=i;j>=0;j--)
        	{
        		
        		for(int k=v;k>=a[i];k--)
        			{
        			//System.out.println(j+" "+i+" "+(k-a[i]));
        			if(j==0) continue;
        			dp[j][k]+=dp[j-1][k-(int)(a[i])];
        			
        			}
        	}
          }
          long ans=0;
          for(int i=1;i<=n;i++)
          {
        	  ans+=dp[i][m*i];
          }
          System.out.print(ans);
    	  return;
      }
}
