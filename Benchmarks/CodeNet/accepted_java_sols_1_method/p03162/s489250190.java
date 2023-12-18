import java.io.*;
import java.util.*;

public class Main
{

	static int[] a,b,c;
	static int n,k;

		
	public static void main(String[] args)throws IOException{

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String[] s;
			n=Integer.parseInt(br.readLine());
			a=new int[n];b=new int[n];c=new int[n];

			int[][] dp=new int[n][3];
			

			for(int i=0;i<n;i++)
			{
				s=br.readLine().split(" ");
				a[i]=Integer.parseInt(s[0]);
				b[i]=Integer.parseInt(s[1]);
				c[i]=Integer.parseInt(s[2]);
			}

			dp[0][0]=a[0];
			dp[0][1]=b[0];
			dp[0][2]=c[0];

			for(int i=1;i<n;i++)
			{
				dp[i][0]=a[i]+Math.max(dp[i-1][1],dp[i-1][2]);
				dp[i][1]=b[i]+Math.max(dp[i-1][2],dp[i-1][0]);
				dp[i][2]=c[i]+Math.max(dp[i-1][1],dp[i-1][0]);
			}
			System.out.println(Math.max(Math.max(dp[n-1][0],dp[n-1][1]),dp[n-1][2]));
			

	}
	
}





