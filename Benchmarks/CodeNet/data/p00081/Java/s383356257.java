import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[\n, ]+");
		while (sc.hasNext())
		{
			double x1 = sc.nextDouble(),
					y1 = sc.nextDouble(),
					x2 = sc.nextDouble(),
					y2 = sc.nextDouble(),
					xq = sc.nextDouble(),
					yq = sc.nextDouble();
			double a, b;
			if (x1 == x2)
			{
				a = (x1 - xq) * 2 + xq;
				b = yq;
			}
			else if (y1 == y2)
			{
				a = xq;
				b = (y1 - yq) * 2 + yq;
			}
			else
			{
				a = ((xq * (x2 - x1) / (y2 - y1))
						- ((xq - 2 * x1) * (y2 - y1) * (x2 - x1))
						+ 2 * yq - 2 * y1)
						/ ((x2 - x1) / (y2 - y1) + (y2 - y1) / (x2 - x1));
				b = ((xq - a) * (x2 - x1)) / (y2 - y1) + yq;
			}
			System.out.printf("%f %f", a, b);
		}
	}
}