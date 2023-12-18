import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		int dx[]={1,1,0,-1,};
		int dy[]={0,1,1,1};
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int a[][]=new int[n][n];
			int ans=0;
			for(int i=0;i<n;i++)
			{
				String s=in.next();
				for(int j=0;j<n;j++)
					a[i][j]=Integer.valueOf(s.charAt(j)-'0');
			}
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
				{
					
					for(int k=0;k<4;k++)
					{
						int cnt=0;
						int sy=i;
						int sx=j;
						while(0<=sx&&sx<n&&sy<n&&a[sy][sx]==1)
						{
							cnt++;
							sx+=dx[k];
							sy+=dy[k];
						}
						ans=Math.max(ans, cnt);
					}
				}
			System.out.println(ans);
		}
	}
}