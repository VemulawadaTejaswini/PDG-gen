import java.util.Scanner;
public class Main
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner(System.in);
		int[][][] bd = new int[4][3][10];
		int n = input.nextInt();
		int a, b, c, d;
		for(int i = 0; i < n; i++)
		{
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
			d = input.nextInt();
			bd[a-1][b-1][c-1] += d;
		}
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				for(int k = 0; k < 10; k++)
				{
					System.out.print(" " + bd[i][j][k]);
				}
				System.out.println();
			}
			if(i < 3)
				System.out.println("####################");
		}
	}
}