import java.util.Scanner;
import java.text.DecimalFormat;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			int n = sc.nextInt();
			
			if (n == 0) break;
			
			int num[][] = new int[n+1][n+1];
			for (int i = 0; i < n; i++)
			{
				int j;
				int lineTotal = 0;
				for (j = 0; j < n; j++)
				{
					num[i][j] = sc.nextInt();
					lineTotal += num[i][j];
				}
				num[i][j] = lineTotal;
			}
			for (int i = 0; i <= n; i++)
			{
				int colTotal = 0;
				for (int j = 0; j < n; j++)
				{
					colTotal += num[j][i];
				}
				num[n][i] = colTotal;
			}		

			for (int i = 0; i <= n; i++)
			{
				for (int j = 0; j <= n; j++)
				{
					System.out.printf("%5d", num[i][j]);
				}
				System.out.println();
			}
		}
	}
}