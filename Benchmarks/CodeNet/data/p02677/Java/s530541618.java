import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();

		int Bangle = 6 * M;
		double Aangle = H * 30 + 0.5 * M;
		double X = Aangle - Bangle;
		if (X < 0) {
			X = Bangle - Aangle;
		}
		if (X > 180) {
			X = 360 - X;
		}

		System.out.println(Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(Math.PI * X / 180)));
	}
}