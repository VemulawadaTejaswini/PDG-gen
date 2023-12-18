import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt(),
				sum = 2 * C * (Math.max(X, Y));
		if (X < Y) {
			sum = Math.min(2 * C * X + B * (Y - X), 2 * C * Y);
		} else {
			sum = Math.min(2 * C * Y + A * (X - Y), 2 * C * X);
		}
		System.out.println(A * X + B * Y > sum ? sum : A * X + B * Y);
	}
}