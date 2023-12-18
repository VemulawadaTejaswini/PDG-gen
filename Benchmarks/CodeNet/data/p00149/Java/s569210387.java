import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int people[][] = new int[4][2];
		int a = 1;
		while (sc.hasNext())
		{
			double x = sc.nextDouble();
			a = (a + 1) % 2;
			if (x < 0.2)
			{
				people[3][a]++;
			}
			else if (x < 0.6)
			{
				people[2][a]++;
			}
			else if (x < 1.1)
			{
				people[1][a]++;
			}
			else
			{
				people[0][a]++;
			}
		}
		for (int i = 0; i < 4; i++)
		{
			System.out.printf("%d %d\n", people[i][0], people[i][1]);
		}
	}
}