import java.util.Scanner;

public class Circle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		double pi = Math.PI;
		System.out.printf("%f %f", pi * r * r, 2 * pi * r);
	}
}