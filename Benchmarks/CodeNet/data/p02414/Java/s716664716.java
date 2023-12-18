
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		int l = stdIn.nextInt();
		
		int[][] a = new int[n][m];
		int[][] b = new int[m][l];
		int[][] c = new int[n][l];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j] = stdIn.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<l;j++)
			{
				b[i][j] = stdIn.nextInt();
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<l;j++)
			{
				c[i][j] =0;
				for(int k=0;k<m;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}