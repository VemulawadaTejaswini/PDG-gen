import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int A, B, C, X, Y;
		int cost = 0;
		Scanner in = new Scanner(System.in);

		A = Integer.parseInt(in.next());
		B = Integer.parseInt(in.next());
		C = Integer.parseInt(in.next());
		X = Integer.parseInt(in.next());
		Y = Integer.parseInt(in.next());

		int sum = A + B;
		if (C * 2 < sum) {
			cost += C * 2 * Math.min(X, Y);
			if (X > Y) {
				if (A < 2 * C) {
					cost += A * (X - Y);
				} else {
					cost += C * 2 * (X - Y);
				}
			} else {
				if (B < 2 * C) {
					cost += B * (Y - X);
				} else {
					cost += C * 2 * (Y - X);
				}
			}
		} else {
			cost += A * X + B * Y;
		}

		System.out.println(cost);
	}
}
