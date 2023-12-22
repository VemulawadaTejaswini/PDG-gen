import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			int n = sc.nextInt();
			if (n == 0)
			{
				break;
			}

			int max = 0, min = 0;
			int sum = 0;
			for (int i = 0; i < n; i++)
			{
				int input = sc.nextInt();
				if (i == 0)
				{
					max = min = input;
				}
				else
				{
					if (input < min)
					{
						min = input;
					}
					if (input > max)
					{
						max = input;
					}
				}

				sum += input;
			}

			int ave = (int) ((sum - max - min) / (n - 2));
			System.out.println(ave);
		}
	}
}

