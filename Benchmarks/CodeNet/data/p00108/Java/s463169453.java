import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int a[]=new int[n];
			int fake[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			boolean b[]=new boolean[n];
			int ans=0;
			Arrays.fill(b, true);
			for(;;)
			{
				for(int i=0;i<n;i++)
					fake[i]=a[i];
				for(int i=0;i<n;i++)
				{
					if(b[i])
					{
						int c=a[i];
						int cnt=0;
						for(int j=0;j<n;j++)
						{
							if(c==a[j]&&b[j])
								cnt++;
						}
						for(int j=0;j<n;j++)
						{
							if(c==a[j]&&b[j])
							{
								b[j]=false;
								a[j]=cnt;
							}
						}
					}
				}
				Arrays.fill(b, true);
				int judge=0;
				for(int i=0;i<n;i++)
				{
					if(a[i]==fake[i])
						judge=1;
					else
					{
						judge=0;
						break;
					}
				}
				if(judge==1)
					break;
				ans++;
			}
			System.out.println(ans);
			for(int i=0;i<n;i++)
			{
				if(i==n-1)
					System.out.println(a[i]);
				else
					System.out.print(a[i]+" ");
			}
			System.out.println();

		}
	}
}