import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[,\n]");
		
		while (true)
		{
			double l[] = new double[10];
			double v1, v2;
			try
			{
				for (int i = 0; i < 10; i++)
					l[i] = sc.nextInt();
				v1 = sc.nextInt();
				v2 = sc.nextInt();
			}
			catch (Exception e)
			{
				break;
			}
			double x = total(l) * v1 / (v2 + v1);
			double subtotal = 0;
			for (int i = 0; i < l.length; i++)
			{
				subtotal += l[i];
				if (x <= subtotal)
				{
					System.out.println(i + 1);
					break;
				}
			}
		}
	}
	private static double total(double a[])
	{
		double ret = 0;
		for (int i = 0; i < a.length; i++)
		{
			ret += a[i];
		}
		return ret;
	}
}