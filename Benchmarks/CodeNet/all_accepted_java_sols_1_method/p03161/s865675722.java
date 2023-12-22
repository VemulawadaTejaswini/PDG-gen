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
         int k=scan.nextInt();
         int a[]=new int[n];
        // int dp[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=scan.nextInt();
       
	int dp[]=new int[n];
	for(int i=1;i<n;i++)
        dp[i]=Integer.MAX_VALUE;
	
	dp[0]=0;
	for(int i=0;i<n;i++)
	{  
		for(int j=i+1;j<n&&j<=i+k;j++)
		{
		dp[j]=Math.min(dp[j],dp[i]+Math.abs(a[j]-a[i]));
	     }
		}
         
         System.out.println(dp[n-1]);
//}//
}
}
