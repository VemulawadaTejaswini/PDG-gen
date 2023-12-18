
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		
		int[][] a = new int[n][m];
		int[] b = new int[m];
		int[] c = new int[n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j] = stdIn.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			b[i] = stdIn.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			c[i] = 0;
			for(int j=0;j<m;j++)
			{
				c[i] += a[i][j] * b[j];
			}
			System.out.println(c[i]);
		}
	}
}