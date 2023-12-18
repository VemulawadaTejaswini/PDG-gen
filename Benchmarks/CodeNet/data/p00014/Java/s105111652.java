import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);

		while(scan.hasNext())
		{
			int d = scan.nextInt();
			int ans=0;
			int div = 600/d;

			for(int i=1; i <div; i++)
			{
				ans += funk(d,i);

			}
			System.out.println(ans);
		}
	}

	public static int funk(int d,int i)
	{
		return d*((d*i)*(d*i));
	}

}