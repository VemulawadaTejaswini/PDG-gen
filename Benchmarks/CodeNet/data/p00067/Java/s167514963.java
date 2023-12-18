import java.util.Scanner;
public class Main
{
	static int base[][]=new int[12][12];
	static int ans;
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			
			String str;
			for(int i=0;i<12;i++)
			{
				str=in.next();
				for(int j=0;j<12;j++)
				{
					if(str.charAt(j)=='0')
						base[i][j]=0;
					else if(str.charAt(j)=='1')
						base[i][j]=1;
				}
			}
			ans=0;
			for(int i=0;i<12;i++)
				for(int j=0;j<12;j++)
				{
					if(base[i][j]==1)
					{
						solve(i,j);
						ans++;
					}
				}
			System.out.println(ans);
			
		}
	}
	public static void solve(int m, int n)
	{
		if((0<=m&&m<12)&&(0<=n&&n<12))
		{
			if(base[m][n]==0||base[m][n]==2)
				return ;
			else if(base[m][n]==1)
			{
				base[m][n]=2;
				if(m-1>=0&&base[m-1][n]==1)
					solve(m-1,n);
				if(m+1<12&&base[m+1][n]==1)
					solve(m+1,n);
				if(n-1>=0&&base[m][n-1]==1)
					solve(m,n-1);
				if(n+1<12&&base[m][n+1]==1)
					solve(m,n+1);
			}
		}
	}
}