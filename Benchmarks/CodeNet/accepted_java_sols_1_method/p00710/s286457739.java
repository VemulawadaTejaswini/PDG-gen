import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			int n = sc.nextInt();
			int r = sc.nextInt();
			
			if (n == 0 && r == 0) break;
			
			int cards[] = new int[n];
			
			for (int i = 0; i < n; i++)
			{
				cards[i] = n - i;
			}
			int top = 0;
			for (int i = 0; i < r; i++)
			{
				int p = sc.nextInt();
				int c = sc.nextInt();
				int tmp[] = new int[c];
				for (int j = p - 1; j < p + c - 1; j++)
				{
					tmp[j - p + 1] = cards[j];
				}
				for (int j = p - 2; j >= 0; j--)
				{
					cards[j + c] = cards[j];
				}
				for (int j = 0; j < c; j++)
				{
					cards[j] = tmp[j];
				}
				top = tmp[0];
			}
			System.out.println(top);
		}
	}
}