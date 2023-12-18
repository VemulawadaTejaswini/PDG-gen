import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		double r = stdIn.nextDouble();

		double area = r * r * Math.PI;
		double cir = 2 * r * Math.PI;

		System.out.printf("%.6f %.6f",area,cir);
	}
}