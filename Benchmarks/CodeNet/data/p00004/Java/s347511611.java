import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext())
			{
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				double c = sc.nextDouble();
				double d = sc.nextDouble();
				double e = sc.nextDouble();
				double f = sc.nextDouble();
					double y = (c*d-f*a)/(b*d-e*a);
					double x = (c*e-b*f)/(e*a-b*d);
						if(x==0)x=0.000;
						if(y==0)y=0.000;
				System.out.printf("%.3f %.3f\n", x, y);
			}
		} catch(Exception ex)
		{
			System.exit(0);
		}
	}
}