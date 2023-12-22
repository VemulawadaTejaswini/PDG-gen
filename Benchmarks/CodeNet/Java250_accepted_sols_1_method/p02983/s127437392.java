import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long L, R, ans;
		L = sc.nextLong();
		R = sc.nextLong();
		sc.close();
		R = Math.min(R, L + 4038);
		ans = 2100;
		for (long i = L; i < R; i++) {
			for (long j = i + 1; j <= R; j++) {
				long a = (i * j) % 2019;
				if (ans > a) {
					ans = a;
				}
			}
		}
		System.out.println(ans);
	}
}
