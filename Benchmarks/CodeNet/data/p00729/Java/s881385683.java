import java.security.AlgorithmParameterGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int M = sc.nextInt();
			int R = sc.nextInt();
			boolean[][] use = new boolean[M][1260 - 540 + 1];
			int[] prev = new int[N + 1];
			for (int i = 0; i < R; ++i) {
				int t = sc.nextInt();
				int n = sc.nextInt();
				int m = sc.nextInt();
				int s = sc.nextInt();
				if (s == 0) {
					for (int j = prev[n]; j < t; ++j) {
						use[m - 1][j - 540] = true;
					}
				} else {
					prev[n] = t;
				}
			}
			int Q = sc.nextInt();
			for (int i = 0; i < Q; ++i) {
				int ts = sc.nextInt();
				int te = sc.nextInt();
				int m = sc.nextInt();
				int ans = 0;
				for (int j = ts; j < te; ++j) {
					if (use[m - 1][j - 540]) ++ans;
				}
				System.out.println(ans);
			}
		}
	}

}