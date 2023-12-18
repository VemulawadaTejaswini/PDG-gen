import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0)
		{
			int m=in.nextInt();
			int a[]=new int[m];
			int u=0;
			int mu=0;
			int d=0;
			int md=0;
			for(int i=0;i<m;i++)
			{
				a[i]=in.nextInt();
			}
			for(int i=0;i<m-1;i++)
			{
				u=a[i+1]-a[i];
				d=a[i+1]-a[i];
				mu=Math.max(u, mu);
				md=Math.min(d, md);
			}
			System.out.println(mu+" "+-md);
		}
	}
}