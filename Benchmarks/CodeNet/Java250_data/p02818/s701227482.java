import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			long a = sc.nextLong();
			long b = sc.nextLong();
			long k = sc.nextLong();

			if (a < k) {
				if (b < (k - a)) {
					b = 0;
				} else {
					b = b - (k - a);
				}
				a = 0;
			} else {
				a = a - k;
			}

			System.out.println(a + " " + b);
		}
	}
}
