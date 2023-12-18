import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		
		for(int i=0; i<n; i++)
		{
			x[i] = scanner.nextInt();
		}
		for(int i=0; i<n; i++)
		{
			y[i] = scanner.nextInt();
		}
		
		double d1 = 0;
		for(int i=0; i<n; i++)
		{
			d1 += Math.abs(x[i] - y[i]);
		}
		System.out.printf("%1$.6f\n", d1);
		
		double d2 = 0;
		for(int i=0; i<n; i++)
		{
			d2 += (x[i] - y[i]) * (x[i] - y[i]);
		}
		System.out.printf("%1$.6f\n", Math.sqrt(d2));
		
		double d3 = 0;
		for(int i=0; i<n; i++)
		{
			d3 += Math.abs((x[i] - y[i]) * (x[i] - y[i]) * (x[i] - y[i]));
		}
		System.out.printf("%1$.6f\n", Math.cbrt(d3));
		
		double dp = 0;
		for(int i=0; i<n; i++)
		{
			double d = Math.abs(x[i] - y[i]);
			if(dp < d )
			{
				dp = d;
			}
		}
		System.out.printf("%1$.6f\n", dp);
	}
}