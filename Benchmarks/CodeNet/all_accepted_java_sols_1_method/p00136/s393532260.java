import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int step[] = new int[6];
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
		{
			double h = sc.nextDouble();
			if (h < 165.0)
				step[0]++;
			else if (h < 170.0)
				step[1]++;
			else if (h < 175.0)
				step[2]++;
			else if (h < 180.0)
				step[3]++;
			else if (h < 185.0)
				step[4]++;
			else
				step[5]++;
		}
		for (int i = 0; i < 6; i++)
		{
			System.out.printf("%d:", i+1);
			for (int j = 0; j < step[i]; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}