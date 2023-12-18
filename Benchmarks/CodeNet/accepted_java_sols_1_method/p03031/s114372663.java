import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N, M;
		N = sc.nextInt();
		M = sc.nextInt();

		int[] a = new int[N];
		for (int i = 0; i < M; i++) {
			int K;
			K = sc.nextInt();
			for (int j = 0; j < K; j++) {
				int S;
				S = sc.nextInt();
				S--;
				a[S] |= 1 << i;		//1を左にiビットシフト
			}
		}

		int p = 0;
		for (int i = 0; i < M; i++) {
			int x;
			x = sc.nextInt();
			p |= x << i;
		}

		int t = 0;
		int ans = 0;
		for (int s = 0; s < (1 << N); s++) {	//s < (1 << N); ... 1 << N(N = 3だとすると) 000から111まで回す。
			t = 0;
			for (int i = 0; i < N; i++) {
				if ((s >> i & 1) == 1) {	//iビット目が立っているかを判定
					t ^= a[i];
				}
			}
			if (t == p) {
				ans++;
			}
		}

		System.out.println(ans);
	}
}