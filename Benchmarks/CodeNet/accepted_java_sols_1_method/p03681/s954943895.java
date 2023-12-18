import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		if (n > m) {
			int t = n;
			n = m;
			m = t;
		}
		int d = m - n;
		if (d > 1) {
			System.out.println("0");
			return;
		}

		long p = 1L;
		for (int i = 2; i <= n; i++) {
			p = p * i % 1000000007;
		}

		if (d == 0) {
			System.out.println(p * p * 2 % 1000000007);
		} else {
			System.out.println(p * p % 1000000007 * m % 1000000007);
		}
	}
}
