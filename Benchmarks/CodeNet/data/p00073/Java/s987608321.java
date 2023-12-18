import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			double x = sc.nextDouble();
			double h = sc.nextDouble();
			double l=0;
			if(x==0 && h==0)
				return;

			double s1 = x*x;
			l=Math.sqrt(((x/2)*(x/2))+(h*h));
			double s2 = (x*l/2)*4;
			double ans = s1+s2;
			System.out.printf("%.6f", ans);
			System.out.println();
		}


	}

}