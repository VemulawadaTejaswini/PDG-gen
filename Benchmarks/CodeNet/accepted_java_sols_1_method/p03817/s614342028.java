import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		sc.close();

		long ans = x / 11 * 2;
		long r = x % 11;
		if (0 < r) {
			if (r <= 6) {
				ans++;
			} else {
				ans += 2;
			}
		}
		System.out.println(ans);
	}
}
