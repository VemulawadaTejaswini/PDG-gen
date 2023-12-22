import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		sc.close();
		System.out.printf("%.6f %.6f", r * r * Math.PI, r * 2 * Math.PI);
	}
}