import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
		{
			int x = sc.nextInt(),
				y = sc.nextInt(),
				w = sc.nextInt(),
				h = sc.nextInt();
			int m = sc.nextInt();
			int count = 0;
			for (int j = 0; j < m; j++)
			{
				int catX = sc.nextInt(),
					catY = sc.nextInt();
				if (catX < x || catY < y || x + w < catX || y + h < catY)
					continue;
				count++;
			}
			System.out.println(count);
		}
	}
}