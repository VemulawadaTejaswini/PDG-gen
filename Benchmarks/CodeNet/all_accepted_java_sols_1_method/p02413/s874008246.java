import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int c = scanner.nextInt();
		int[][] a = new int[r+1][c+1];

		for(int i=0; i<r+1; i++)
		{
			for(int j=0; j<c+1; j++)
			{
				if(i==r || j==c)
				{
					a[i][j] = 0;
				}
				else {
					a[i][j] = scanner.nextInt();
				}
			}
		}
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				a[i][c] += a[i][j];
				a[r][j] += a[i][j];
			}
			a[r][c] += a[i][c];
		}
		
		
		for(int i=0; i<r+1; i++)
		{
			for(int j=0; j<c+1; j++)
			{
				System.out.print(a[i][j]+(j<c?" ":"\n"));
			}
		}
	}
}

