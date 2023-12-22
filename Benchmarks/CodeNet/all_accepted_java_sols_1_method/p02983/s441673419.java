import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();
		long N = R;

		if (R > L + 2019) {
			N = L + 2019;
		}
		int ans = Integer.MAX_VALUE;
		for (long i = L; i <= N; i++) {
			for (long j = i + 1; j <= N; j++) {
				ans = (int) Math.min(ans, i * j % 2019);
			}
		}
		System.out.println(ans);
		sc.close();
	}
}