import java.util.Scanner;
public class Main
{
	static int base[][];
	static int ans;
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{

			String str;
			int H=in.nextInt(),W=in.nextInt();
			if((H|W)==0)
				return;
			base=new int[H][W];
			for(int i=0;i<H;i++)
			{
				str=in.next();
				for(int j=0;j<W;j++)
				{
					if(str.charAt(j)=='@')
						base[i][j]=1;
					else if(str.charAt(j)=='#')
						base[i][j]=2;
					else if(str.charAt(j)=='*')
						base[i][j]=3;

				}
			}
			ans=0;
			for(int i=0;i<H;i++)
				for(int j=0;j<W;j++)
				{
					if(base[i][j]==1)
					{
						solve1(i,j,H,W);
						ans++;
					}
					else if(base[i][j]==2)
					{
						solve2(i,j,H,W);
						ans++;
					}
					else if(base[i][j]==3)
					{
						solve3(i,j,H,W);
						ans++;
					}
				}
			System.out.println(ans);
		}
	}
	public static void solve1(int m, int n,int H,int W)
	{
		if(base[m][n]==1)
		{
			base[m][n]=0;
			if(m-1>=0&&base[m-1][n]==1)
				solve1(m-1,n,H,W);
			if(m+1<H&&base[m+1][n]==1)
				solve1(m+1,n,H,W);
			if(n-1>=0&&base[m][n-1]==1)
				solve1(m,n-1,H,W);
			if(n+1<W&&base[m][n+1]==1)
				solve1(m,n+1,H,W);
		}
	}
	public static void solve2(int m, int n,int H,int W)
	{
		if(base[m][n]==2)
		{
			base[m][n]=0;
			if(m-1>=0&&base[m-1][n]==2)
				solve2(m-1,n,H,W);
			if(m+1<H&&base[m+1][n]==2)
				solve2(m+1,n,H,W);
			if(n-1>=0&&base[m][n-1]==2)
				solve2(m,n-1,H,W);
			if(n+1<W&&base[m][n+1]==2)
				solve2(m,n+1,H,W);
		}
	}
	public static void solve3(int m, int n,int H,int W)
	{
		if(base[m][n]==3)
		{
			base[m][n]=0;
			if(m-1>=0&&base[m-1][n]==3)
				solve3(m-1,n,H,W);
			if(m+1<H&&base[m+1][n]==3)
				solve3(m+1,n,H,W);
			if(n-1>=0&&base[m][n-1]==3)
				solve3(m,n-1,H,W);
			if(n+1<W&&base[m][n+1]==3)
				solve3(m,n+1,H,W);
		}
	}
}