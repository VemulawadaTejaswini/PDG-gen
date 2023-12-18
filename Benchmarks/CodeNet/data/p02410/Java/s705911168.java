import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] A = new int[n][m];
		int[] b = new int[m];
		int[] ans = new int[n];
		
		for(int i = 0;i < n;i++)
		{
			for(int j = 0;j < m;j++)
			{
				A[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0;i < m;i++)
		{
			b[i] = scan.nextInt();
		}
		
		for(int i = 0;i < n;i++)
		{
			for(int j = 0;j < m;j++)
			{
				ans[i] += A[i][j] * b[j];
			}
		}
		
		for(int i = 0;i< n;i++)
		{
			System.out.println(ans[i]);
		}
	}
}