import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[,\n]");
		
		while (true)
		{
			double xa, ya, xb, yb, xc, yc, xd, yd;
			try
			{
				xa = sc.nextDouble();
				ya = sc.nextDouble();
				xb = sc.nextDouble();
				yb = sc.nextDouble();
				xc = sc.nextDouble();
				yc = sc.nextDouble();
				xd = sc.nextDouble();
				yd = sc.nextDouble();
			}
			catch (Exception e)
			{
				break;
			}
			if (distance2(xa, ya, xb, yb) + distance2(xa, ya, xd, yd) < distance2(xb, yb, xd, yd)
				|| distance2(xb, yb, xc, yc) + distance2(xb, yb, xa, ya) < distance2(xc, yc, xa, ya)
				|| distance2(xc, yc, xd, yd) + distance2(xc, yc, xb, yb) < distance2(xd, yd, xb, yb)
				|| distance2(xd, yd, xa, ya) + distance2(xd, yd, xc, yc) < distance2(xa, ya, xc, yc)
			) {
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
		}
	}
	private static double distance2(double x1, double y1, double x2, double y2)
	{
		return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
	}
}