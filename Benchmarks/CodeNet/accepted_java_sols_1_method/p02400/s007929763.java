import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();

		sc.close();

		double pi = Math.PI;

		double area = r * r * pi;
		double cir = 2 * pi * r;

		System.out.println(String.format("%.6f", area) + " " + String.format("%.6f", cir));

	}

}

