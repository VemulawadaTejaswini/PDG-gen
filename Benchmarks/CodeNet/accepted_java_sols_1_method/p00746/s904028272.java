import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int N=in.nextInt();
			if(N==0)
				return;

			int a[][]=new int[401][401];
			int maxh=1;
			int maxw=1;
			a[200][200]=1;
			for(int i=2;i<=N;i++)
			{
				int n=in.nextInt();
				int d=in.nextInt();

				for(int h=0;h<=400;h++)
					for(int w=0;w<=400;w++)
					{
						if(a[h][w]==n+1)
						{
							if(d==0)
								a[h][w-1]=i;
							if(d==1)
								a[h-1][w]=i;
							if(d==2)
								a[h][w+1]=i;
							if(d==3)
								a[h+1][w]=i;
						}
					}
			}
			for(int i=0;i<=400;i++)
			{
				int cnt=0;
				for(int j=0;j<=400;j++)
				{
					if(a[i][j]!=0)
					{
						cnt++;
						i++;
						j=-1;
						continue;
					}
				}
				maxh=Math.max(maxh, cnt);
				cnt=0;
			}
			for(int i=0;i<=400;i++)
			{
				int cnt=0;
				for(int j=0;j<=400;j++)
				{
					if(a[j][i]!=0)
					{
						cnt++;
						i++;
						j=-1;
						continue;
					}
				}
				maxw=Math.max(maxw, cnt);
				cnt=0;
			}
			System.out.println(maxw+" "+maxh);
		}
	}
}