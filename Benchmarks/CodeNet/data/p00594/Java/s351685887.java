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
			int a[]=new int[1000000];
			int ans=0;
			boolean judge=false;
			for(int i=0;i<n;i++)
			{
				int x=in.nextInt();
				a[x]++;
				if(a[x]>n/2)
				{
					ans=x;
					judge=true;
				}
			}
			System.out.println(judge ? ans:"NO COLOR");
		}
	}
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}