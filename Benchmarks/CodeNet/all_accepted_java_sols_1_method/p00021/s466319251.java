import java.util.Scanner;

public class  Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0)
		{
			double ax=sc.nextDouble();
			double ay=sc.nextDouble();
			double bx=sc.nextDouble();
			double by=sc.nextDouble();
			double cx=sc.nextDouble();
			double cy=sc.nextDouble();
			double dx=sc.nextDouble();
			double dy=sc.nextDouble();

			if((ay-by)/(ax-bx) == (cy-dy)/(cx-dx))
				System.out.println("YES");
			else
				System.out.println("NO");
			n--;
		}

	}

}