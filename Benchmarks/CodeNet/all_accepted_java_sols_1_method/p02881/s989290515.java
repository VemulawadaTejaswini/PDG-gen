import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();

		long ans = Long.MAX_VALUE;
		long end = (long) Math.sqrt(n);
		for (int i = 1; i <= end; i++) {
			if (n % i == 0) {
				ans = Math.min(ans, i + n / i - 2);
			}
		}
		System.out.println(ans);
	}
}
