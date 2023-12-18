import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[:\n]");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
		{
			double h = sc.nextInt();
			double m = sc.nextInt();
			double hAng = h * 30.0 + 30.0 * m / 60.0;
			double mAng = m * 6.0;
			double x = Math.abs(hAng - mAng);
			if (x <= 30 || 330 <= x)
			{
				System.out.println("alert");
			}
			else if (90 <= x && x <= 180)
			{
				System.out.println("safe");
			}
			else
			{
				System.out.println("warning");
			}
		}
	}
}