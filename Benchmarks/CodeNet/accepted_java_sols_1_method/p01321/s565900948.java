import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int n = sc.nextInt();
			if(n == 0)break;
			int seiseki[][] = new int[n][5];
			int sum[] = new int[n];
			for(int i = 0; i < n; i++)
			{
				sum[i] = 0;
				for(int j = 0; j < 5; j++)
				{
					seiseki[i][j] = sc.nextInt();
					sum[i] += seiseki[i][j];
				}
			}
			Arrays.sort(sum);
			System.out.println(sum[n-1] + " " + sum[0]);
		}
	}
}