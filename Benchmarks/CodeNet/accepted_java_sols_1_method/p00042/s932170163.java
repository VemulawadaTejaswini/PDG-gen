import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int Ca=1;
		while(sc.hasNext())
		{
			int W = sc.nextInt();
			if(W==0)
				return;
			int n= sc.nextInt();
			int p[] = new int[n+1];
			int w[] = new int[n+1];
			for(int i=1; i<=n; i++)
			{
				String str[] = sc.next().split(",");
				p[i]= Integer.valueOf(str[0]);
				w[i]= Integer.valueOf(str[1]);
			}
			int opt[][] = new int[n+1][W+1];
			for(int i=0; i<=W; i++)
				opt[0][i]=0;
			int maxp = Integer.MIN_VALUE;
			int minw = Integer.MAX_VALUE;
			for(int i=1; i<=n;i++)
				for(int j=0; j<=W; j++)
				{
					if(j-w[i]>=0)
					{
						opt[i][j]=Math.max(opt[i-1][j], opt[i-1][j-w[i]]+p[i]);
						if(maxp<opt[i][j])
						{
							maxp=opt[i][j];
							minw=j;
						}
						else if(maxp==opt[i][j])
						{
							minw=Math.min(minw, j);
						}
					}
					else
						opt[i][j]=opt[i-1][j];
				}
			System.out.println("Case "+Ca+++":");
			System.out.println(maxp);
			System.out.println(minw);
		}
	}
}