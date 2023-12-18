import java.io.*;
import java.util.*;

public class Main
{

	static int[] dp,a;
	static int n;

		
	public static void main(String[] args)throws IOException{

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			n=Integer.parseInt(br.readLine());
			dp=new int[n];a=new int[n];
			String[] s=br.readLine().split(" ");

			for(int i=0;i<n;i++)
				a[i]=Integer.parseInt(s[i]);

			dp[0]=0;
			dp[1]=Math.abs(a[0]-a[1]);

			for(int i=2;i<n;i++)
				dp[i]=Math.min(Math.abs(a[i]-a[i-1])+dp[i-1],Math.abs(a[i]-a[i-2])+dp[i-2]);
			
			System.out.println(dp[n-1]);

			

	}
	
}





