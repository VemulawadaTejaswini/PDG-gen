import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n, r, p, c;
		int card[] = new int[51];
		int nextCard[] = new int[51];
		while (true)
		{
			n = sc.nextInt();
			r = sc.nextInt();
			if (n == 0 && r == 0)
			{
				break;
			}
			for (int i = 1; i <= n; i++)
			{
				card[i] = n-i+1;
				nextCard[i] = n - i + 1;
			}
			for (int i = 0; i < r; i++)
			{
				p = sc.nextInt();
				c = sc.nextInt();
				for (int j = 1; j <= c; j++)
				{
					nextCard[j] = card[p - 1 + j];
				}
				for (int j = 1; j < p; j++)
				{
					nextCard[c + j] = card[j];
				}
				for (int j = 1; j <= n; j++)
				{
					card[j] = nextCard[j];
				}
				// for (int j = 1; j <= n; j++)
				// {
				// 	System.out.print(card[j] + " ");
				// }
				// System.out.println();
			}
			System.out.println(card[1]);
		}
		sc.close();
	}
}
