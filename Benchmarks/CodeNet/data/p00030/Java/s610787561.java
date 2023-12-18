import java.util.Scanner;

class Main
{
	static int count = 0;
	static int m = 0;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			int n = sc.nextInt();
			m = sc.nextInt();
			if (n == 0 && m == 0) break;

			count = 0;
			sum(n, 0, 0);
			System.out.println(count);
		}
	}
	private static void sum(int n, int sum, int start)
	{
		if (n == 0)
		{
			if (sum == m)
			{
				count++;
			}
		}
		else
		{
			for (int i = start; i < 10; i++)
				sum(n - 1, sum + i, i + 1);
		}
	}
}