import java.util.Scanner;
public class Main
{
	static int base[][];
	static int ans;
	static int H,W;
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			String str;
			H=in.nextInt();
			W=in.nextInt();
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
			int one=base[0][0];
			int ju=0;
			for(int i=0;i<H;i++)
			{
				for(int j=0;j<W;j++)
				{
					if(one==base[i][j])
						ju=1;
					else
					{
						ju=0;
						break;
					}	
				}
				if(ju==0)
					break;
			}
			ans=0;
			if(ju==1)
				System.out.println(1);
			else
			{
				for(int i=0;i<H;i++)
					for(int j=0;j<W;j++)
					{
						if(base[i][j]==1)
						{
							solve1(i,j);
							ans++;
						}
						else if(base[i][j]==2)
						{
							solve2(i,j);
							ans++;
						}
						else if(base[i][j]==3)
						{
							solve3(i,j);
							ans++;
						}
					}
				System.out.println(ans);
			}
		}
	}
	public static void solve1(int m, int n)
	{
		if(base[m][n]==1)
		{
			base[m][n]=0;
			if(m-1>=0&&base[m-1][n]==1)
				solve1(m-1,n);
			if(m+1<H&&base[m+1][n]==1)
				solve1(m+1,n);
			if(n-1>=0&&base[m][n-1]==1)
				solve1(m,n-1);
			if(n+1<W&&base[m][n+1]==1)
				solve1(m,n+1);
		}
	}
	public static void solve2(int m, int n)
	{
		if(base[m][n]==2)
		{
			base[m][n]=0;
			if(m-1>=0&&base[m-1][n]==2)
				solve2(m-1,n);
			if(m+1<H&&base[m+1][n]==2)
				solve2(m+1,n);
			if(n-1>=0&&base[m][n-1]==2)
				solve2(m,n-1);
			if(n+1<W&&base[m][n+1]==2)
				solve2(m,n+1);
		}
	}
	public static void solve3(int m, int n)
	{
		if(base[m][n]==3)
		{
			base[m][n]=0;
			if(m-1>=0&&base[m-1][n]==3)
				solve3(m-1,n);
			if(m+1<H&&base[m+1][n]==3)
				solve3(m+1,n);
			if(n-1>=0&&base[m][n-1]==3)
				solve3(m,n-1);
			if(n+1<W&&base[m][n+1]==3)
				solve3(m,n+1);
		}
	}
}