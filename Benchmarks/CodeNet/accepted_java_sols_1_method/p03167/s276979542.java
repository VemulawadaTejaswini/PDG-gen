import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		long p=1000000007;
		
		int n=s.nextInt();
		int m=s.nextInt();
		
		char[][] arr=new char[n][m];
		
		for(int i=0;i<n;i++)
		{
			String str=s.next();
			
			for(int j=0;j<str.length();j++)
			{
				arr[i][j]=str.charAt(j);
			}
		}
		
		long[][] dp=new long[n+1][m+1];
		
		dp[0][0]=1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]!='#')
				{
					dp[i+1][j]=(dp[i+1][j]%p+dp[i][j]%p)%p;
					dp[i][j+1]=(dp[i][j+1]%p+dp[i][j]%p)%p;
				}
			}
		}
		
		System.out.println(dp[n-1][m-1]);
		
	}
	
}