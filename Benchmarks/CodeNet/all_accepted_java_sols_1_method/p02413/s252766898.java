import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int[][] array = new int[r + 1][c + 1];
		
		for(int i = 0;i < r;i++)
		{
			for(int j = 0;j < c;j++)
			{
				array[i][j] = scan.nextInt();
				array[r][j] += array[i][j];
				array[i][c] += array[i][j];
			}
			array[r][c] += array[i][c];
		}
		
		for(int i = 0;i <= r;i++)
		{
			for(int j = 0;j < c;j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println(array[i][c]);
		}
	}
}