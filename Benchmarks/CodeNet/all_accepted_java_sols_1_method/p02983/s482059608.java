import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long L, R;
		L = sc.nextLong();
		R = sc.nextLong();

		long ans = 2019;
		if(L == 2019 || R == 2019) {
			System.out.println(0);
			return;
		}
		if(R - L >= 2019) {
			System.out.println(0);
			return;
		} else if(R - L < 2019) {
			for (long i = L; i < R; i++) {
				for (long j = L + 1; j <= R; j++) {
					long res = ((i * j) % 2019);
					ans = Math.min(ans, res);
				}
			}
		}

		System.out.println(ans);
	}
}