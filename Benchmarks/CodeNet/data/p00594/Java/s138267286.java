import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int a[]=new int[1000000];
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				break;
			Arrays.fill(a,Integer.MAX_VALUE);
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			Arrays.sort(a);
			int cnt=1;
			int x=a[0];
			boolean judge=true;
			for(int i=1;i<n;i++)
			{
				if(x==a[i])
					cnt++;
				else 
				{
					if(cnt>n/2)
					{
						System.out.println(x);
						judge=false;
						break;
					}
					x=a[i];
					cnt=1;
				}
			}
			if(judge&cnt>n/2)
				System.out.println(x);
			else 
				System.out.println("NO COLOR");
		}
	}
}