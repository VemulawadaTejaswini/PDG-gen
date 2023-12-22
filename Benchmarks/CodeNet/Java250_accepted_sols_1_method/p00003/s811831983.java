import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for(int i =0; i<n; i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();

			if(a*a==b*b+c*c)
				System.out.println("YES");
			else if(b*b==a*a+c*c)
				System.out.println("YES");
			else if(c*c==a*a+b*b)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}