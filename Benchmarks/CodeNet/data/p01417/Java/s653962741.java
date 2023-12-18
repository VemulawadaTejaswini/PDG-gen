
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt();
		double[][] cols = new double[N][3];
		for (int i = 0; i < N; i++)
		{
			double L=sc.nextDouble(),a=sc.nextDouble(),b=sc.nextDouble();
			cols[i][0] = L;
			cols[i][1] = a;
			cols[i][2] = b;
		}
		double maximum = 0;
		if (M > 1)
		{
			double[][] dists = new double[N][N];
			for (int i = 0; i < N; i++)
			{
				for (int j = 0; j < N; j++)
				{
					dists[i][j] = dists[j][i] = distance(cols[i], cols[j]);
				}
			}
			maximum = maxDist(dists, new boolean[N], 0, M, N);
		}
		System.out.printf("%.10f\n", maximum);
	}
	
	private static double maxDist(double[][] dists, boolean[] taken, int k, int m, int N)
	{
		if (m == 0)
		{
			double sd = 0;
			for (int i = 0; i < N; i++)
			{
				if (taken[i])
				{
					for (int j = i + 1; j < N; j++)
					{
						if (taken[j])
						{
							sd += dists[i][j];
						}
					}
				}
			}
			return sd;
		}
		else
		{
			if (k >= N)
			{
				return 0;
			}
			else
			{
				taken[k] = false;
				double d1 = maxDist(dists, taken, k + 1, m, N);
				taken[k] = true;
				double d2 = maxDist(dists, taken, k + 1, m - 1, N);
				taken[k] = false;
				return Math.max(d1, d2);
			}
		}
	}
	
	private static double distance(double[] c1, double[] c2)
	{
		double d = 0;
		for (int i = 0; i < 3; i++) d += Math.pow(c1[i] - c2[i], 2);
		return d;
	}
}