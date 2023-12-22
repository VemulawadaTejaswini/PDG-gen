import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double angle = Math.toRadians(scan.nextDouble());
		
		double height = b * Math.sin(angle);
		double area = a * height / 2;
		double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(angle));
		
		System.out.printf("%f\n%f\n%f\n", area, a + b + c, height);
	}
}