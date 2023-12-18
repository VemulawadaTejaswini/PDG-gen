import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		double ang = Math.toRadians(scanner.nextInt());
		
		double c = Math.sqrt(a*a+b*b - 2*a*b*Math.cos(ang));
		double l = a+b+c;
		
		double h =  b * Math.sin(ang);
		
		double s = 0.5 * a* h;
		
		System.out.printf("%1$.8f %2$.8f %3$.8f", s, l, h);
	}
}