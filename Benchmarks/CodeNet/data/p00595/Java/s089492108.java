import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			int a = sc.nextInt(),
				b = sc.nextInt(),
				x = Math.max(a, b),
				y = Math.min(a, b);
			while (y != 0)
			{
				x = x % y;
				int tmp = x;
				x = y;
				y = tmp;
			}
			System.out.printf("%d\n", x);
		}
	}
}