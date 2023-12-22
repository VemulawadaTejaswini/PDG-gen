import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		sc.close();

		int[] tastes = new int[N];
		int minAbs = 1000;
		int minIdx = -1;

		// 味を求める
		for (int i = 0; i < N; i++) {
			tastes[i] = L + (i + 1) - 1;

			int abs = Math.abs(tastes[i]);
			if (abs < minAbs) {
				minAbs = abs;
				minIdx = i;
			}
		}

		// アップルパイ
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (i != minIdx) {
				ans += tastes[i];
			}
		}
		System.out.println(ans);
	}
}
