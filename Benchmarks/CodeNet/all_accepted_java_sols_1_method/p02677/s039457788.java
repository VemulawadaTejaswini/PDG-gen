import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();

		double Hrad = 30 * (H + M / 60.0);
		double Mrad = 360 * (H + M / 60.0);

		double C = A * A + B * B - 2 * A * B * Math.cos(Math.toRadians(Hrad - Mrad));

		C = Math.sqrt(C);
		System.out.println(C);
	}

}
