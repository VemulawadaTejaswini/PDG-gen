import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		for(; ; )
		{
			int n = scanner.nextInt();
			if(n == 0)
			{
				break;
			}
			
			int[][] a = new int[n][n];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<n; j++)
				{
					a[i][j] = scanner.nextInt();
				}
			}
			int[] sw = new int[n];
			int[] sh = new int[n];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<n; j++)
				{
					sw[i] += a[i][j];
					sh[i] += a[j][i];
					System.out.printf("%1$5d ", a[i][j]);
				}
				System.out.printf("%1$5d\n", sw[i]);
			}
			
			int sum = 0;
			for(int i=0; i<n; i++)
			{
				sum += sh[i];
				System.out.printf("%1$5d ", sh[i]);
			}
			System.out.printf("%1$5d\n", sum);
		}
	}
}