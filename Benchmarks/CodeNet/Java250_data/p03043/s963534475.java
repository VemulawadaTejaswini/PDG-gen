import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		double ans = 0;
		for (int i = 1; i <= N; i++) {
			int cnt;
			int d;
			if (i < K) {
				cnt = (int) Math.ceil(Math.log((double) K / i) / Math.log(2));
				d = N * (int) Math.pow(2, cnt);
			} else {
				d = N;
			}
			ans += 1.0 / d;
		}
		System.out.println(ans);
	}
}
