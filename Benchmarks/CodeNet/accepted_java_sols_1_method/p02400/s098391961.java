import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		double r = scanner.nextDouble();
		double pi = 3.14159265359;
		System.out.printf("%1$.6f %2$.6f", pi*r*r, 2*r*pi);
	}
}