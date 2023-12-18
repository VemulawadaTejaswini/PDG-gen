import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			for(int i = 0; n > i; i++)
			{
				double x1 = sc.nextInt();
				double y1 = sc.nextInt();
				double x2 = sc.nextInt();
				double y2 = sc.nextInt();
				double x3 = sc.nextInt();
				double y3 = sc.nextInt();
					double A1 = 2 * (x2 - x1);
					double B1 = 2 * (y2 - y1);
					double C1 = x1*x1 - x2*x2 + y1*y1 - y2*y2;
					double A2 = 2 * (x3 - x1);
					double B2 = 2 * (y3 - y1);
					double C2 = x1*x1 - x3*x3 + y1*y1 - y3*y3;
						double px = (B1*C2 - B2*C1)/(A1*B2 - A2*B1);
						double py = (C1*A2 - C2*A1)/(A1*B2 - A2*B1);
						double r = Math.sqrt((px-x1)*(px-x1)+(py-y1)*(py-y1));
					System.out.printf("%.3f %.3f %.3f\n", px, py, r);
			}
	}
}