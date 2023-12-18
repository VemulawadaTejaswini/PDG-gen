import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			if (A == 0) break;
			int N = sc.nextInt();
			int[][] fail = new int[N][3];
			int[] ans = new int[301];
			Arrays.fill(ans, 2);
			int fi = 0;
			for (int i = 0; i < N; ++i) {
				int I = sc.nextInt();
				int J = sc.nextInt();
				int K = sc.nextInt();
				int R = sc.nextInt();
				if (R == 1) {
					ans[I] = ans[J] = ans[K] = 1;
				} else {
					fail[fi][0] = I;
					fail[fi][1] = J;
					fail[fi][2] = K;
					++fi;
				}
			}
			for (int i = 0; i < fi; ++i) {
				int cand = 0;
				for (int j = 0; j < 3; ++j) {
					if (ans[fail[i][j]] != 1) cand += (1 << j);
				}
				if (Integer.bitCount(cand) == 1) {
					ans[fail[i][Integer.numberOfTrailingZeros(cand)]] = 0;
				}
			}
			for (int i = 1; i <= A + B + C; ++i) {
				System.out.println(ans[i]);
			}
		}
	}
}