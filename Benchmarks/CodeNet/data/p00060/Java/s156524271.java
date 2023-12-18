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
				c = sc.nextInt();
			int count = 0;
			for (int i = 1; i <= 10; i++)
			{
				if (i != a && i != b && i != c && a + b + i > 20)
				{
					count++;
				}
			}
			if (count >= 4)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
		}
	}
}