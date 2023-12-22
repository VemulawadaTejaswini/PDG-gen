import java.util.Scanner;
import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, b, f, r, v;
		n = sc.nextInt();
		int kosha[][][] = new int[5][4][11];
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				for (int k = 0; k < 11; k++)
				{
					kosha[i][j][k] = 0;
				}
			}
		}
		for (int i = 0; i < n; i++)
		{
			b = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			v = sc.nextInt();
			kosha[b][f][r] += v;
		}
		for (int i = 1; i < 5; i++)
		{
			for (int j = 1; j < 4; j++)
			{
				for (int k = 1; k < 11; k++)
				{
					System.out.print(" " + kosha[i][j][k]);
				}
				System.out.println();
			}
			if(i < 4)
			{
				for (int k = 1; k < 21; k++)
				{
					System.out.print("#");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
