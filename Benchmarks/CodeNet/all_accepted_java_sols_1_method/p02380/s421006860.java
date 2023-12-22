import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double rad = Math.toRadians(c);
		System.out.println( a*b*Math.sin(rad)/2 );
		System.out.println( a + b + Math.sqrt(a*a + b*b -2*a*b*Math.cos(rad)) );
		System.out.println( b*Math.sin(rad) );
		input.close();
	}
}