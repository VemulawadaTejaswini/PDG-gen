import java.util.Scanner;
public class Main
{
	static int H,W;
	static int b[][];
	static int ans;
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			W=in.nextInt();
			H=in.nextInt();
			if((W|H)==0)
				return;
			b=new int[H][W];
			for(int i=0;i<H;i++)
				for(int j=0;j<W;j++)
					b[i][j]=in.nextInt();
			ans=0;
			for(int i=0;i<H;i++)
				for(int j=0;j<W;j++)
				{
					if(b[i][j]==1)
					{
						solve(i,j);
						ans++;
					}
				}
			System.out.println(ans);
		}
	}
	public static void solve(int h, int w)
	{
		b[h][w]=0;
		for(int dh=-1;dh<=1;dh++)
			for(int dw=-1;dw<=1;dw++)
			{
				int nh=h+dh;
				int nw=w+dw;
				if(nh>=0&&nh<H&&nw>=0&&nw<W&&b[nh][nw]==1)
				{
					solve(nh,nw);
				}
			}
		return;
	}
}