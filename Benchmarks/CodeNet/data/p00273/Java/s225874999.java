import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x, y, b, p;
		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			b = sc.nextInt();
			p = sc.nextInt();
			if (b >= 5 && p >= 2) {
				System.out.println((int) ((x * b + y * p) * 0.8));
			} else {
				System.out.println(min(((int) ((x * max(5, b) + y * max(2, p)) * 0.8)), (x * b + y * p)));
			}
		}

		sc.close();
	}

	static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	static int min(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}
}