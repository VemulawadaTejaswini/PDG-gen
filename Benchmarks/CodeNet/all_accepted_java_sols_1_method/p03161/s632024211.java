import java.io.*;
import java.util.*;

public class Main
{

	static int[] dp,a;
	static int n,k;

		
	public static void main(String[] args)throws IOException{

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String[] s=br.readLine().split(" ");
			n=Integer.parseInt(s[0]);k=Integer.parseInt(s[1]);
			dp=new int[n];a=new int[n];
			s=br.readLine().split(" ");

			for(int i=0;i<n;i++)
				a[i]=Integer.parseInt(s[i]);

			Arrays.fill(dp,2000000000);
			dp[0]=0;
			dp[1]=Math.abs(a[0]-a[1]);

			for(int i=2;i<n;i++)
			{
				for(int j=1;j<=k && (i-j)>=0;j++)
				{
					dp[i]=Math.min(dp[i],Math.abs(a[i]-a[i-j])+dp[i-j]);
				}
			}
			
			System.out.println(dp[n-1]);
			

	}
	
}





