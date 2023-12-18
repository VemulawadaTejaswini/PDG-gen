import java.util.Scanner;
import java.util.Arrays;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			int n = sc.nextInt();
			if (n == 0) break;
			
			int results[] = new int[100];
			int last = 0;;
			
			for (int i = 0; i * 200 <= n; i++)
			{
				for (int j = 0; i * 200 + j * 300 <= n; j++)
				{
					for (int k = 0; i * 200 + j * 300 + k * 500 <= n; k++)
					{
						if (i * 200 + j * 300 + k * 500 == n)
						{
							int a  = (int) (380 * (i - (i % 5)) * 0.8 + 380 * (i % 5));
							int b  = (int) (550 * (j - (j % 4)) * 0.85 + 550 * (j % 4));
							int c  = (int) (850 * (k - (k % 3)) * 0.88 + 850 * (k % 3));
							results[last] = a + b + c;
							last++;
						}
					}
				}
			}
			Arrays.sort(results, 0, last);
			System.out.println(results[0]);
		}
	}
}