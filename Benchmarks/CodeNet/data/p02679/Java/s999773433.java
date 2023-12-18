
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] fish = new int[n][2];


		for(int i = 0; i < n; i++)
		{
			fish[i][0] = sc.nextInt();
			fish[i][1] = sc.nextInt();
		}

		int count = 0;
		for(int x = 0; x < n; x++)
		{
			for(int y = 0; y < n; y++)
			{
				if(0 == fish[x][0] * fish[y][0] + fish[x][1] * fish[y][1])
				{
					count++;
				}
			}
		}


		int all = (int) Math.pow(2, n);


		System.out.println(all - count);

		sc.close();
	}


}

