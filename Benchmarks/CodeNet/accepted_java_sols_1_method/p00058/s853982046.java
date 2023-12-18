import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			double[] x = new double[4];
			double[] y = new double[4];
			for(int i = 0; i < 4; ++i)
			{
				x[i] = stdIn.nextDouble();
				y[i] = stdIn.nextDouble();
			}
			if(Math.sqrt((x[1] - x[0]) * (x[3] - x[2]) + (y[1] - y[0]) * (y[3] - y[2])) < 1e-12)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}