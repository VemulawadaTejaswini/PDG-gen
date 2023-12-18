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
			int x = n / 2;
			int y = n / 2 + 1;
			int map[][] = new int[n][n];
			for (int i = 1; i <= n * n; i++)
			{
				while (map[y][x] != 0)
				{
					x -= 1;
					if (x < 0)
					{
						x = n - 1;
					}
					y = (y + 1) % n;
				}
				map[y][x] = i;
				x = (x + 1) % n;
				y = (y + 1) % n;
			}
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					System.out.printf("%4d", map[i][j]);
				}
				System.out.println();
			}
		}
	}
}