import java.math.BigDecimal;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		sc.close();
		long d = (long)(b *1000);
		long c = a*d;
		;
		c = c /100;
		System.out.println(new BigDecimal(a).multiply(new BigDecimal(d)).divideToIntegralValue(new BigDecimal("1000")));
	}
}