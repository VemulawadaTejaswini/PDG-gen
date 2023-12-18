import java.util.Scanner;

class Main{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double r  = scanner.nextDouble();

		double phi = Math.PI;
		System.out.printf("%f %f\n",r * r * phi, 2 * r * phi);
	}
}
