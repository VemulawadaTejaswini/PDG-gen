import java.util.*;

class Main {
	public static void main(final String[] args) {
		final Scanner sc = new Scanner(System.in);
		// 入力
		final int N = sc.nextInt();
		int ans = 0;
		int tmp = 0;
		final int[] H = new int[N];
		Arrays.setAll(H, i -> sc.nextInt());
		sc.close();

		for (int i = 0; i < N - 1; i++) {
			if (H[i] >= H[i + 1]) { // 判定
				tmp++;
				// 毎回ansに入れる
				ans = Math.max(ans, tmp);
			} else {
				tmp = 0;
			}
		}
		System.out.println(ans);
	}
}
