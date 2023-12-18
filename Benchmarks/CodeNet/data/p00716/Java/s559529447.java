import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		while(m-->0)
		{
			double f=in.nextInt();
			int y=in.nextInt();
			int n=in.nextInt();
			double ans=0;
			double res=0;
			for(int i=0;i<n;i++)
			{
				int ma=in.nextInt();
				double r=in.nextDouble();
				double de=in.nextDouble();
				double A=f;
				int B;
				
				if(ma==0)
				{
					double risi=0;
					for(int j=0;j<y;j++)
					{
						B=(int)(A*r);
						risi+=B;
						A-=de;
					}
					 res=A+risi;
				}
				else if(ma==1)
				{
					for(int j=0;j<y;j++)
					{
						B=(int)(A*r);
						A+=B-de;
					}
					 res=A;
				}
				ans=Math.max(ans, res);
			}
			System.out.println((int)ans);
		}
	}
}