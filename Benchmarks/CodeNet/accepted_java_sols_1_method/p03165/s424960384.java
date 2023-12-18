import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	String st1=s.next();
	String st2=s.next();
	String ans="";
	int dp[][]=new int[st1.length()+1][st2.length()+1];
	for(int i=0;i<st2.length()+1;i++)
	dp[0][i]=0;
	for(int i=0;i<st1.length()+1;i++)
	dp[i][0]=0;
	for(int i=1;i<st1.length()+1;i++)
	{
	for(int j=1;j<st2.length()+1;j++)
	{
	 if(st1.charAt(i-1)==st2.charAt(j-1))
	   dp[i][j]=dp[i-1][j-1]+1;
	 else	
	  dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
	
	}
	
	}
	int i=st1.length();
	int j=st2.length();
	while(true)
	{
	if(i==0||j==0)
	break;
	if(dp[i][j]!=dp[i-1][j]&&dp[i][j]!=dp[i][j-1])
	{
	ans=st1.charAt(i-1)+ans;
	i--;
	j--;
	}
	else
	{
	if(dp[i][j]==dp[i-1][j])
	i--;
	else
	j--;
	}
	}
	//System.out.println(dp[st1.length()][st2.length()]);
	System.out.println(ans);
	}
}