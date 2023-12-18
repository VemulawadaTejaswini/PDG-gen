import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		
		double a = r * r * Math.PI;
		double b = r * 2 * Math.PI;
		
		System.out.printf("%f %f", a, b);
	}
}