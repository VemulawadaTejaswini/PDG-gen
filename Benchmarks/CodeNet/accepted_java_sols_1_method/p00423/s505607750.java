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
			int a = 0, b = 0;
			for (int i = 0; i < n; i++)
			{
				int aCard = sc.nextInt(),
					bCard = sc.nextInt();
				if (aCard > bCard)
				{
					a += aCard + bCard;
				}
				else if (bCard > aCard)
				{
					b += aCard + bCard;
				}
				else
				{
					a += aCard;
					b += bCard;
				}
			}
			System.out.printf("%d %d\n", a, b);
		}
	}
}