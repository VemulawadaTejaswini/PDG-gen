import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final double PI = 3.141592653589;
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		sc.close();
		System.out.println(r * 2 * PI + " " + r * r * PI);
	}
}