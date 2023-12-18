import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int count = 0;
		for (int i = 0; i < N; i++) {
			int x = scanner.nextInt();
			if (isPrime(x)) count++;
		}
		System.out.println(count);
	}

	private static boolean isPrime(int x) {
		int i;
		int n = (int) Math.ceil(Math.sqrt((double)x));
		if (x == 2) return true;
		for (i = 2; i <= n; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
}