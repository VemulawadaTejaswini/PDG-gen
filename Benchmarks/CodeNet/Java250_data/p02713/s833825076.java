import java.util.Scanner;

public class Main {

	public static int gcd2(int a, int b) {
		if (a % b == 0) {
			return b;
		} else {
			return gcd2(b, a % b);
		}
	}

	public static int gcd(int a, int b, int c) {
		return gcd2(a, gcd2(b, c));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int a, b, c;
		long sum = 0;
		for (a = 1; a <= K; a++) {
			for (b = 1; b <= K; b++) {
				for (c = 1; c <= K; c++) {
					sum += gcd(a, b, c);
				}
			}
		}

		System.out.println(sum);
	}
}
