import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int count = 0;
			int n = sc.nextInt();
			if(n==0)
				System.exit(0);
			while(n>0)
			{
				int m=n;
				while(m%5==0)
				{
					count ++;;
					m=(m/5);
				}
				n--;
			}
			System.out.println(count);
		}
	}
}