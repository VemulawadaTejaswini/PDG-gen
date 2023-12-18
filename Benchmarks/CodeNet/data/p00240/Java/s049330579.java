import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			double y=in.nextInt();
			double max=-1;
			int ans=-1;
			for(int i=0;i<n;i++)
			{
				int  b=in.nextInt();
				double r=in.nextInt();
				double t=in.nextInt();
				double tmp=0;
				if(t==1)
					tmp=1+y*(r/100);
				else if(t==2)
					tmp=Math.pow(1+(r/100), y);
				if(max<tmp)
				{
					max=tmp;
					ans=b;
				}	
			}
			System.out.println(ans);
		}
	}

}