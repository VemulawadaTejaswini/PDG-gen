import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		for(int i=0; i<n; i++)
		{
			double[] x = new double[2];
			double[] y = new double[2];
			double[] r = new double[2];
			
			for(int j=0; j<2; j++)
			{
				x[j] = scanner.nextDouble();
				y[j] = scanner.nextDouble();
				r[j] = scanner.nextDouble();
			}
			
			int result = 0;
			double d = Math.sqrt((x[1]-x[0])*(x[1]-x[0]) + (y[1]-y[0])*(y[1]-y[0]));
			if(d < r[0]-r[1])
			{
				result = 2;
			}
			else if(d < r[1]-r[0])
			{
				result = -2;
			}
			else if(d <= r[0]+r[1])
			{
				result = 1;
			}
			
			System.out.println(result);
		}
	}
}