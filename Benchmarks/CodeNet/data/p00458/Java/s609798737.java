import java.util.Scanner;
public class Main
{
	static int W,H,cnt,ans;
	static int map[][];
	static int dx[]={1,0,-1,0};
	static int dy[]={0,1,0,-1};
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		for(;;)
		{
			ans=0;
			W=in.nextInt();
			H=in.nextInt();
			if((W|H)==0)
				return;
			map=new int[H][W];
			for(int i=0;i<H;i++)
				for(int j=0;j<W;j++)
					map[i][j]=in.nextInt();
	
			for(int i=0;i<H;i++)
				for(int j=0;j<W;j++)
				{
					if(map[i][j]==1)
						solve(i,j,cnt);
				}
			System.out.println(ans);
		}
	}
	static void solve(int h,int w,int cnt)
	{
		map[h][w]=0;
		for(int i=0;i<4;i++)
		{
			 int nh=dy[i]+h;
			 int nw=dx[i]+w;
			if(nh>=0&&nh<H&&nw>=0&&nw<W)
			{
				if(map[nh][nw]==1)
					solve(nh,nw,cnt+1);
			}
		}
		ans=Math.max(ans,cnt+1);
		map[h][w]=1;
		return;
	}
}