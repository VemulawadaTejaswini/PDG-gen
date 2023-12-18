import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n, r;
		int p, c;
		while (true)
		{
			n = sc.nextInt();
			r = sc.nextInt();

			if (n == 0 && r == 0)
			{
				break;
			}

			int[] pile = new int[n];
			for (int i = 0; i < n; i++)
			{
				pile[i] = n - i;
			}

			for (int i = 0; i < r; i++)
			{
				p = sc.nextInt();
				c = sc.nextInt();

				if (p == 1)
				{
					continue;
				}
				else
				{
					int[] move = new int[c];
					for (int j = 0; j < c; j++)
					{
						move[j] = pile[p - 1 + j];
					}

					for (int j = 0; j < p - 1; j++)
					{
						pile[p + c - 2 - j] = pile[p - 2 - j];
					}

					for (int j = 0; j < c; j++)
					{
						pile[c - 1 - j] = move[c - 1 - j];
					}
				}
			}

			System.out.println(pile[0]);
		}
	}
}

