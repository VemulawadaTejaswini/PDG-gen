import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double r nextDouble();
		double pi = Math.PI;
		double area, length;

		r = sc.nextDouble();

		area = pi * r * r;
		length = 2.0 * pi * r;

		System.out.printf("%f %f", area, length);
	}
}