import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double base = sc.nextDouble();
		double side = sc.nextDouble();
		double corner = sc.nextDouble();

		System.out.println(AreaCalculation(base, HeightCalculation(base, side, corner)));
		System.out.println(CircumferenceCalculation(base, side, corner));
		System.out.println(HeightCalculation(base, side, corner));

	}

	static double AreaCalculation(double base, double height) {
		return base * height / 2;
	}

	static double CircumferenceCalculation(double a, double b, double corner) {
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (2 * a * b * Math.cos(Math.toRadians(corner))));
		return a + b + c;
	}

	static double HeightCalculation(double a, double b, double corner) {
		return a * (b * Math.sin(Math.toRadians(corner))) / 4;
	}

}

