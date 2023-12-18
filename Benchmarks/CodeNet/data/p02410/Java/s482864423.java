import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int[][] A = new int[m+1][n+1];
		int b;
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				A[m][n] = in.nextInt();
			}
		}
		
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				System.out.println(A[i][j]);
			}
		}
		for (int j = 0; j < n; j++)
		{
			b = in.nextInt();
			for (int i = 0; i < m; i++)
			{
				A[i][j] *= b;
			}
		}
		for (int i = 0; i < m; i++)
		{   int a=0;
			for (int j = 0; j < n; j++)
			{
				a+=A[i][j];
				//System.out.println(A[i][j]);
			}
			//System.out.println(a);
		}

	}
}