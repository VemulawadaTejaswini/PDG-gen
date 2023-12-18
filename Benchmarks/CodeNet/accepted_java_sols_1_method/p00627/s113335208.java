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
			for (int i = 0; i < n / 4; i++)
			{
				total += sc.nextLong();
			}
			System.out.println(total);
		}
	}
}