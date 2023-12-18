import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[ ,\n]+");
		double S = 0.0;
		double x0 = sc.nextDouble(), y0 = sc.nextDouble();
		double xp = sc.nextDouble(), yp = sc.nextDouble();
		while (sc.hasNext())
		{
			double x = sc.nextDouble(), y = sc.nextDouble();
			double a = d(x0,y0,xp,yp),
				   b = d(xp,yp,x,y),
				   c = d(x,y,x0,y0);
			double z = (a + b + c) / 2.0;
			S += Math.sqrt(z * (z - a) * (z - b) * (z - c));
			
			xp = x;
			yp = y;
		}
		System.out.println(S);
	}
	private static double d(double xa, double ya, double xb, double yb)
	{
		return Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb));
	}
}