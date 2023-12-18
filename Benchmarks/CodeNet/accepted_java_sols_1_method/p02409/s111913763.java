import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int[][][] build = new int[5][4][11];
		for (int i = 0; i < build.length; i++)
		{
			for (int j = 0; j < build[i].length; j++)
			{
				for (int j2 = 0; j2 < build[i][j].length; j2++)
				{
					build[i][j][j2] = 0;
				}
			}
		}

		int enterInput = in.nextInt();
		int enterBuild;
		int enterRow;
		int enterCol;
		int enterNum;

		for (int i = 0; i < enterInput; i++)
		{
			enterBuild = in.nextInt();
			enterRow = in.nextInt();
			enterCol = in.nextInt();
			enterNum = in.nextInt();

			build[enterBuild][enterRow][enterCol] += enterNum;
		}

		for (int i = 1; i < build.length; i++)
		{
			for (int j = 1; j < build[i].length; j++)
			{
				for (int k = 1; k < build[i][j].length; k++)
				{
					System.out.print(" " + build[i][j][k]);
				}
				System.out.println("");
			}
			if (i < build.length - 1)
				System.out.println("####################");
			
		}

	}
}