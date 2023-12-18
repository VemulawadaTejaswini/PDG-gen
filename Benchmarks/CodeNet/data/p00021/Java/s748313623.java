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
			
			double ax = x[1]-x[0];
			double ay = y[1]-y[0];
			double bx = x[3]-x[2];
			double by = y[3]-y[2];

			System.out.println((ax*by-ay*bx==0? "YES" : "NO"));
		}
	}
}