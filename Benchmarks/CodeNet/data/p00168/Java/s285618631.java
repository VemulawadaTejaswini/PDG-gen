import java.util.Scanner;

public class Main {
	static long sum;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			sum = 0;
			solve(n);
			System.out.println((sum / 10 + 1) / 365 + 1);
		}
	}

	public static void solve(int n) {
		if (n < 0)
			return;
		if (n == 0) {
			sum += 1;
			return;
		}
		for (int i = 1; i <= 3; i++) {
			solve(n - i);
		}
	}
}