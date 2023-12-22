import java.util.Scanner;
public class Main
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int[] s = new int[111];
		int[][] a = new int[111][111];
		int[] b = new int[111];
		for(int i = 0; i < n; i++)
			for(int k = 0; k < m; k++)
				a[i][k] = input.nextInt();
		for(int i = 0; i < m; i++)
			b[i] = input.nextInt();
		for (int i = 0; i < n; i++)
			for (int k = 0; k < m; k++)
			s[i] += a[i][k] * b[k];
		for(int i = 0; i < n; i++)
			System.out.println(s[i]);
	}
}