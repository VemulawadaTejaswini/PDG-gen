import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[:\n]");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
		{
			int h = sc.nextInt();
			int m = sc.nextInt();
			int hAng = h * 30 + m / 2;
			int mAng = m * 6;
			int x = Math.abs(hAng - mAng);
			if (x <= 30 || 330 <= x)
			{
				System.out.println("alert");
			}
			else if (90 <= x && x <= 270)
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