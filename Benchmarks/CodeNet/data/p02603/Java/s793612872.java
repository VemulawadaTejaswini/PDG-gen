import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();

		boolean isUp = false;
		boolean[] isBuy = new boolean[N];
		boolean[] isSell = new boolean[N];

		for (int i = 1; i < N; i++) {
			// 値が同じ時はcontinue
			if (A[i - 1] == A[i]) {
				continue;
			}

			if (A[i - 1] < A[i]) {
				// 価格が上がり始めるタイミング
				if (!isUp) {
					isBuy[i - 1] = true;
				}

				isUp = true;
			}

			if (A[i - 1] > A[i]) {
				// 価格が下がり始めるタイミング
				if (isUp) {
					isSell[i - 1] = true;
				}
				isUp = false;
			}
		}

		if (A[N - 2] < A[N - 1]) {
			isSell[N - 1] = true;
		}

		// 最後に売るタイミングを求める
		int last = -1;
		for (int i = N - 1; i >= 0; i--) {
			if (isSell[i]) {
				last = i;
				break;
			}
		}
		if (last == -1) {
			System.out.println(1000);
			return;
		}

		// 計算
		int money = 1000;
		int stock = 0;

		for (int i = 0; i <= last; i++) {
			if (isBuy[i]) {
				int cnt = money / A[i];
				stock += cnt;
				money -= A[i] * cnt;
			}

			if (isSell[i]) {
				money += stock * A[i];
				stock = 0;
			}
		}

		System.out.println(money);
	}
}
