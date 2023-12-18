
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] l = new int[n];
			for (int i = 0; i < n; i++) {
				l[i] = sc.nextInt();
			}

			if (n < 3) {
				System.out.println(0);
				return;
			}

			int result = 0;
			for (int i = 0; i < n - 2; i++) {
				for (int j = i + 1; j < n - 1; j++) {
					for (int k = j + 1; k < n; k++) {
						if (isTriangle(l[i], l[j], l[k])) {
							result++;
						}
					}
				}
			}
			System.out.println(result);
		}
	}

	private static boolean isTriangle(int a, int b, int c) {
		if (a == b || b == c || c == a) {
			return false;
		}

		if (b < a && c < a && a < c + b) {
			return true;
		} else if (a < b && c < b && b < a + c) {
			return true;
		} else if (a < c && b < c && c < a + b) {
			return true;
		}
		return false;
	}
}
