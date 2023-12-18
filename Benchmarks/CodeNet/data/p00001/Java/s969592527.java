import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int top[] = new int[3];

		for (int i = 0; i < 10; i++)
		{
			int n = sc.nextInt();
			for (int j = 0; j < 3; j++)
			{
				if (Math.max(top[j], n) == n)
				{
					for (int k = 2; k > j; k--)
						top[k] = top[k-1];
					top[j] = n;
					break;
				}
			}
		}
		for (int i = 0; i < 3; i++)
		{
			System.out.println(Integer.toString(top[i]));
		}
	}
}