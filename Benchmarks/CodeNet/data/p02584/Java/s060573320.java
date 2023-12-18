import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();
		sc.close();

		long c = Math.abs(X) / D;

		long ans = Long.MAX_VALUE / 2;
		// 収束しない場合
		if (K < c) {
			ans = Math.abs(X) - D * K;
		} else {
			// 収束する場合
			long std = Math.abs(X) - D * c;
			long rest = K - c;
			if (rest % 2 == 0) {
				ans = std;
			} else {
				if (std >= 0) {
					ans = std - D;
				} else {
					ans = std + D;
				}
			}
		}
		System.out.println(Math.abs(ans));
	}
}
