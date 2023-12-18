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
			int num[] = new int[n];
			for (int i = 0; i < n; i++)
				num[i] = sc.nextInt();
			int x = sc.nextInt();
			int left = 0, right = n - 1, i = (left + right) / 2, count = 1;
			while (num[i] != x && right != left)
			{
				count++;
				if (num[i] < x)
				{
					left = i + 1;
					i = (left + right) / 2;
				}
				else if (num[i] > x)
				{
				
					right = i - 1;
					i = (left + right) / 2;
				}
			}
			System.out.println(count);
		}
	}
}