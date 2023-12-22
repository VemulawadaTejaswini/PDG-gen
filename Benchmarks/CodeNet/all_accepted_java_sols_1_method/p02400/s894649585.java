import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		double pi = Math.PI;
		double area = r * r * pi;
		double circum = 2 * r * pi;
		System.out.println(String.format("%.6f",area) + " " + String.format("%.6f",circum));
	}
}
