import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long n = sc.nextLong();
		long p = sc.nextLong();
		if (n == 1) {
			System.out.println(p);
			return;
		}
		long x = 2;
		int cnt;
		long ans = 1;
		while (Math.ceil(Math.sqrt(p)) >= x) {
			cnt = 0;
			while (p % x == 0) {
				cnt++;
				p = p / x;
			}
			if (n <= cnt) {
				ans *= Math.pow(x, (cnt / n));
			}
			x++;

		}
		System.out.println(ans);
	}
}