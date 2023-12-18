import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		for(int i=0; i<n; i++)
		{
			double[] x = new double[3];
			double[] y = new double[3];
			for(int j=0; j<3; j++)
			{
				x[j] = scanner.nextDouble();
				y[j] = scanner.nextDouble();
			}
			
			double a1 = 2*(x[1] - x[0]);
			double b1 = 2*(y[1] - y[0]);
			double c1 = (x[0]*x[0] - x[1]*x[1]) + (y[0]*y[0] - y[1]*y[1]);
			
			double a2 = 2*(x[2] - x[0]);
			double b2 = 2*(y[2] - y[0]);
			double c2 = (x[0]*x[0] - x[2]*x[2]) + (y[0]*y[0] - y[2]*y[2]);
			
			double px = (b1*c2 - b2*c1)/(a1*b2 - a2*b1);
			double py = (c1*a2 - c2*a1)/(a1*b2 - a2*b1);
			
			double r = Math.sqrt((px-x[0])*(px-x[0]) + (py-y[0])*(py-y[0]));
			
			System.out.printf("%1$.3f %2$.3f %3$.3f\n", px, py, r);
		}
	}
}