import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double S, a, b, theta;
		try (Scanner sc = new Scanner(System.in)) {
			a = sc.nextInt();
			b = sc.nextInt();
			theta = sc.nextInt();
			S = a * b * Math.sin(Math.toRadians(theta)) / 2;
			System.out.println(S);
			System.out.println(a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(theta))));
			System.out.println(2 * S / a);
		}
	}
}

