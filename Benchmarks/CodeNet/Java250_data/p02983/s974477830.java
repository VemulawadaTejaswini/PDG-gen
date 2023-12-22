import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = 2019;
		int L = sc.nextInt();
		int R = sc.nextInt();
		int ans = M;
		if (R - L <= M) {
			for (int i = L; i <= R; i++) {
				for (int j = i + 1; j <= R; j++) {
					ans = Math.min(((i%M) * (j%M)) % M, ans);
				}
			}
		} else {
			L = L % M;
			R = (R % M) + M;
			for (int i = L; i <= R; i++) {
				for (int j = i + 1; j <= R; j++) {
					ans = Math.min(((i%M) * (j%M)) % M, ans);
				}
			}
		}
		System.out.println(ans);
	}
}
