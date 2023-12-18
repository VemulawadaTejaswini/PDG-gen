import java.math.BigDecimal;
import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext(); )
		{
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int n = scanner.nextInt();
			
			int sum = 0;
			BigDecimal a0 = new BigDecimal(String.valueOf(a));
			BigDecimal b0 = new BigDecimal(String.valueOf(b));
			double c = a0.divide(b0, n+1, BigDecimal.ROUND_HALF_UP).doubleValue() * 10;
			for(int i=0; i<n; i++, c*=10)
			{
				sum += (int)c%10;
			}
			
			System.out.println(sum);
		}
	}
}