import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			double x1, y1, x2, y2, x3, y3, xp, yp;
			try
			{
				x1 = sc.nextDouble();
				y1 = sc.nextDouble();
				x2 = sc.nextDouble();
				y2 = sc.nextDouble();
				x3 = sc.nextDouble();
				y3 = sc.nextDouble();
				xp = sc.nextDouble();
				yp = sc.nextDouble();
			}
			catch (Exception e)
			{
				break;
			}
			
			if (!((f(x1, y1, x2, y2, x3) < y3 && f(x1, y1, x2, y2, xp) < yp)
				|| (f(x1, y1, x2, y2, x3) > y3 && f(x1, y1, x2, y2, xp) > yp)
			)) {
				System.out.println("NO");
				continue;
			}
			if (!((f(x2, y2, x3, y3, x1) < y1 && f(x2, y2, x3, y3, xp) < yp)
				|| (f(x2, y2, x3, y3, x1) > y1 && f(x2, y2, x3, y3, xp) > yp)
			)) {
				System.out.println("NO");
				continue;
			}
			if (!((f(x3, y3, x1, y1, x2) < y2 && f(x3, y3, x1, y1, xp) < yp)
				|| (f(x3, y3, x1, y1, x2) > y2 && f(x3, y3, x1, y1, xp) > yp)
			)) {
				System.out.println("NO");
				continue;
			}
			System.out.println("YES");
		}
	}
	private static double f(double x1, double y1, double x2, double y2, double x)
	{
		return (y1 - y2) / (x1 - x2) * (x - x1) + y1;
	}
}