import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int r = sc.nextInt();
		double sin = Math.sin(Math.toRadians(r));
		double cos = Math.cos(Math.toRadians(r));

		System.out.println(.5 * a * b * sin);
		System.out.println(a + b + Math.sqrt(a * a + b * b - 2 * a * b * cos));
		System.out.println(b * sin);

	}

}