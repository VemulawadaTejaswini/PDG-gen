import java.util.Scanner;

class Main 
{
	public static void main(String[] args)
	{
		int[][] x;	
		Scanner sc = new Scanner(System.in);
		int N, cnt = 1;

		while(true)
		{
			N = sc.nextInt();
			
			if(N == 0) 
			{
				break;
			}

			x = new int[N][2];

			for(int i = 0; i < N; i++)
			{
				for(int j = 0; j < 2; j++)
				{
					x[i][j] = sc.nextInt();
				}
			}

			System.out.println(cnt+" "+calc_area(x));
			cnt++;
		}

	}

	private static double calc_area(int[][] x)
	{
		int N = x.length;
		double s = 0.0;

		for(int i = 0; i < N; i++)
		{
			s += cross_product(x[i % N], x[(i + 1) % N]);
		}

		return 0.5 * Math.abs(s);
	}

	private static int cross_product(int[] a, int[] b)
	{
		return a[0] * b[1] - a[1] * b[0];
	}
}