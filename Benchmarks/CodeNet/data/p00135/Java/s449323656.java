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
			int hAng = h * 30;
			int mAng = m * 6;
			int x = Math.abs(hAng - mAng);
			if (180 < x)
			{
				x = 360 - x;
			}
			if (x <= 30)
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