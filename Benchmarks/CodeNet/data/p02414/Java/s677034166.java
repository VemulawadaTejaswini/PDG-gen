import java.util.Scanner;
public class Main
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int l = input.nextInt();
		int[][] s = new int[111][111];
		int[][] a = new int[111][111];
		int[][] b = new int[111][111];
		for(int i = 0; i < n; i++)
			for(int k = 0; k < m; k++)
				a[i][k] = input.nextInt();
		for(int i = 0; i < m; i++)
			for(int k = 0; k < l; k++)
				b[i][k] = input.nextInt();
		for (int i = 0; i < n; i++)
			for (int k = 0; k < l; k++)
				for(int j = 0; j < m; j++)
					s[i][k] += a[i][j] * b[j][k];
		for(int i = 0; i < n; i++)
			for(int k = 0; k < l; k++)
			{
				if(k == l-1)
					System.out.println(s[i][k]);
				else
					System.out.print(s[i][k] + " ");
			}
	}
}