import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double r = in.nextInt();

		double area = r * r * Math.PI;
		double circumference = 2 * r * Math.PI;

		System.out.printf("%.5f %.5f", area, circumference);
	}
}