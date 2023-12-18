import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = sc.nextInt();
			if (n == 0) break;
			int most = 0;
			double d = Double.MAX_VALUE;
			for (int i = 0; i < n; i++)
			{
				int m = sc.nextInt();
				double h = sc.nextInt() / 100.0, w = sc.nextInt();
				if (d > Math.abs(w / (h * h) - 22.0))
				{
					d = Math.abs(w / (h * h) - 22.0);
					most = m;
				}
			}
			System.out.println(most);
		}
	}
}