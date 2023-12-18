import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int a = sc.nextInt(),
				b = sc.nextInt(),
				x = Math.max(a, b),
				y = Math.min(a, b),
				count = 0;
			if (a == 0 && b == 0) break;
			while (y != 0)
			{
				x = x % y;
				int tmp = x;
				x = y;
				y = tmp;
				count++;
			}
			System.out.printf("%d %d\n", x, count);
		}
	}
}