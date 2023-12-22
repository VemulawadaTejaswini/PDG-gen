import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int dp[][]=new int[100][100];
		int p[][]=new int[100][100];
		int ans=0;
		int y=0;
		int ch=0;
		while(in.hasNext())
		{
			String st[]=in.next().split(",");
			ch=Math.max(ch, st.length);
			for(int i=0;i<st.length;i++)
				p[y][i]=Integer.valueOf(st[i]);
			y++;
		}
		dp[0][0]=p[0][0];	
		for(y=1;y<ch*2;y++)
		{
			for(int x=0;x<ch;x++)
			{
				if(y<ch)
				{
					if(x-1>=0)
						dp[y][x]=p[y][x]+Math.max(dp[y-1][x-1], dp[y-1][x]);
					else
						dp[y][x]=p[y][x]+dp[y-1][x];
				}
				else
				{
						dp[y][x]=p[y][x]+Math.max(dp[y-1][x], dp[y-1][x+1]);
				}
				ans=Math.max(ans, dp[y][x]);
			}
		}
		System.out.println(ans);
	}
}