import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(;;)
		{
			double q = scanner.nextDouble();
			if(q == -1)
			{
				break;
			}
			
			double x = q / 2;
			for(;;)
			{
				x = x - (x*x*x-q)/(3*x*x);
				if(Math.abs(x*x*x - q) < 0.00001*q)
				{
					System.out.printf("%1$.6f\n", x);
					break;
				}
			}		
		}
	}
}