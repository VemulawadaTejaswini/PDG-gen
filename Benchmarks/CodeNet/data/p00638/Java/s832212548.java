import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int a[]=new int[n];
			int b[]=new int[n];

			for(int i=0; i<n;i++)
			{
				a[i]=in.nextInt();
				b[i]=in.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				int m=i;
				for(int j=i;j<n; j++)
				{
					if(a[j]<a[m])
						m=j;
				}
				int tmp =b[i];
				b[i] = b[m];
				b[m] = tmp;
				tmp =a[i];
				a[i]=a[m];
				a[m]=tmp;
			}
			boolean flag=true;
			int T=0;
			int W=0;
			for(int i=0;i <n;i++)
			{
				T+=a[i];
				W=b[i];
				if(T>W)
					flag=false;
			}
			if(flag)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}