import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int[][][] house = new int[4][3][10];
		int b = 0;
		int f = 0;
		int r = 0;
		int v = 0;
		for(int i = 0;i < count;i++)
		{
			b = scan.nextInt();
			f = scan.nextInt();
			r = scan.nextInt();
			v = scan.nextInt();
			house[b - 1][f - 1][r - 1]+= v;
		}
		
		for(int i = 0;i < 4;i++)
		{
			for(int j = 0;j < 3;j++)
			{
				for(int k = 0;k < 10;k++)
				{
					System.out.print(" " + house[i][j][k]);
				}
				System.out.println("");
			}
			if(i != 3)
			{
				System.out.println("####################");
			}
		}
			
	}
}