import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int ans = 0;
		if (M == 1) {
			ans = 0;
		} else {
			int[] X = new int[M];
			int[] DX = new int[M - 1];

			for (int i = 0; i < M; i++) {
				X[i] = scn.nextInt();
			}
			Arrays.sort(X);
			ans += X[M - 1] - X[0];

			for (int i = 0; i < M - 1; i++) {
				DX[i] = X[i + 1] - X[i];
			}
			Arrays.sort(DX);
			for (int i = 0; i < N - 1; i++) {
				if(M-2-i < 0)break;
				ans -= DX[M - 2 - i];
			}
		}
		System.out.println(ans);
	}

}
