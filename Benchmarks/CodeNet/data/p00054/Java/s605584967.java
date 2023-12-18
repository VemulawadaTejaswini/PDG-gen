import java.math.BigDecimal;
import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext(); )
		{
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			int n = scanner.nextInt();
			
			int sum = 0;
			BigDecimal div = new BigDecimal(String.valueOf(a/b));
			BigDecimal mult10 = new BigDecimal(String.valueOf(10));
			for(int i=0; i<n; i++)
			{
				double c = div.multiply(mult10).doubleValue();
				sum += (int)c%10;
				
				a *= 10;
				div = new BigDecimal(String.valueOf(a/b));
			}
			
			System.out.println(sum);
		}
	}
}