import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		float r = scanner.nextFloat();
		double pi = Math.PI;
		System.out.printf("%1$.6f, %2$.6f", pi*r*r, 2*r*pi);
	}
}