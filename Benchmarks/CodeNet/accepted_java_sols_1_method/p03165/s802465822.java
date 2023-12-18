import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char f[]=(br.readLine()).toCharArray();
		char s[]=(br.readLine()).toCharArray();
		int n=f.length,m=s.length;
		int dp[][]=new int[f.length+1][s.length+1];
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(f[i-1]==s[j-1])
					dp[i][j]=dp[i-1][j-1]+1;
				else
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			}
		}
		
		String ans="";
		int ip=n,jp=m;
		int ctr=0;
		while(ip>0&&jp>0)
		{
			if(f[ip-1]==s[jp-1])
			{
				ans+=f[ip-1];
				ip--;
				jp--;
				ctr++;
			}
			else if(dp[ip-1][jp]>dp[ip][jp-1])
				ip--;
			else
				jp--;
			
			if(ctr==dp[n][m])
				break;
		}
		char ans1[]=ans.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=ans.length()-1;i>=0;i--)
			sb.append(ans1[i]);
		System.out.println(sb);
	}
}