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
			long total = 0;
			for (int i = 0; i < n; i++)
			{
				int b = sc.nextInt() + sc.nextInt() + sc.nextInt();
				int w = sc.nextInt();
				if (b <= 60 && w <= 2)
				{
					total += 600;
				}
				else if (b <= 80 && w <= 5)
				{
					total += 800;
				}
				else if (b <= 100 && w <= 10)
				{
					total += 1000;
				}
				else if (b <= 120 && w <= 15)
				{
					total += 1200;
				}
				else if (b <= 140 && w <= 20)
				{
					total += 1400;
				}
				else if (b <= 160 && w <= 25)
				{
					total += 1600;
				}
			}
			System.out.println(total);
		}
	}
}