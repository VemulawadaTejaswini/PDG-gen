import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			int N = sc.nextInt(), M = sc.nextInt();
			if (N==0 && M==0) break;
			
			int[] c1 = new int[N], c2 = new int[M];
			int sum1 = 0, sum2 = 0;
			for (int i = 0; i < N; i++)
				sum1 += c1[i] = sc.nextInt();
			for (int i = 0; i < M; i++)
				sum2 += c2[i] = sc.nextInt();
			
			int min = Integer.MAX_VALUE, minA = -1, minB = -1;
			for (int i = 0; i < N; i++)
			{
				int a = c1[i];
				for (int j = 0; j < M; j++)
				{
					int b = c2[j];
					if (sum1 - a + b == sum2 - b + a && a + b < min)
					{
						min = a + b;
						minA = a;
						minB = b;
					}
				}
			}
			if (minA == -1)
				System.out.printf("-1\n");
			else
				System.out.printf("%d %d\n", minA, minB);
		}
	}
}