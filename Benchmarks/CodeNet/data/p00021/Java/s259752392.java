import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=0; i<n; i++)
		{
			double[] x = new double[4];
			double[] y = new double[4];
			
			for(int j=0; j<4; j++)
			{
				x[j] = scanner.nextDouble();
				y[j] = scanner.nextDouble();
			}
			
			double s0 = (x[1]-x[0] == 0) ? 0 : (y[1]-y[0])/(x[1]-x[0]);
			double s1 = (x[3]-x[2] == 0) ? 0 : (y[3]-y[2])/(x[3]-x[2]);

			System.out.println((s0==s1 ? "YES" : "NO"));
		}
	}
}