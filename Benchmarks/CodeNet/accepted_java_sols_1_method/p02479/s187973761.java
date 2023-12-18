import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Double r = sc.nextDouble();
		double pi = Math.PI;
		double area = pi * r * r;
		double length = 2 * pi * r;
		String after = String.format("%.6f %.6f", area, length);
		System.out.println(after);
	}
}