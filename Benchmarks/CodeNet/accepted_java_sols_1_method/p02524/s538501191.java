import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int C = stdIn.nextInt();
		double square = 1 / 2.0 * a * b * Math.sin(Math.PI * C / 180);
		System.out.printf("%.8f\n", square);
		System.out.printf("%.8f\n", a + b + Math.sqrt(a * a + b * b  - 2 * a * b * Math.cos(Math.PI * C / 180)));
		System.out.printf("%.8f\n", 2 * square / a);
	}
}