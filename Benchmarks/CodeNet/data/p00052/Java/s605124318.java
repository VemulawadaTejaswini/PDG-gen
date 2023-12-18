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
			int five = 0;
			int two = 0;
			for (int i = 1; i <= n; i++)
			{
				two += factorization(i, 2);
				five += factorization(i, 5);
			}
			System.out.println(Math.min(five, two));
		}
	}
	private static int factorization(int n, int a)
	{
		int count = 0;
		while (n % a == 0)
		{
			count++;
			n /= a;
		}
		return count;
	}
}