import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++)
		{
			int temp = i;
			if (temp % 3 == 0)
			{
				System.out.print(" " + i);
				continue;
			}

			do
			{
				if (temp % 10 == 3)
				{
					System.out.print(" " + i);
					break;
				}
				else
				{
					temp /= 10;
				}
			} while (temp > 0);

		}

		System.out.println();
	}
}

