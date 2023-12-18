import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			int h=in.nextInt();
			if((n|h)==0)
				return;
			boolean xy[][]=new boolean[n+1][n+1];
			boolean xz[][]=new boolean[n+1][n+1];
			boolean yz[][]=new boolean[n+1][n+1];
			int cnt=n*n*n;
			for(int i=0;i<h;i++)
			{
				String st=in.next();
				int a=in.nextInt();
				int b=in.nextInt();
				if(st.equals("xy"))
				{
					for(int z=1;z<=n;z++)
						if(!(xz[a][z]||yz[b][z]))
							cnt--;
					xy[a][b]=true;
				}
				else if(st.equals("xz"))
				{
					for(int y=1;y<=n;y++)
						if(!(xy[a][y]||yz[y][b]))
							cnt--;
					xz[a][b]=true;
				}
				else 
				{
					for(int x=1;x<=n;x++)
						if(!(xy[x][a]||xz[x][b]))
							cnt--;
					yz[a][b]=true;
				}
			}
			System.out.println(cnt);
		}
	}
}