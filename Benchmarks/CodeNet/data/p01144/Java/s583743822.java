import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int M = sc.nextInt();
			int[] v = new int[N];
			for (int i = 0; i < N; ++i) {
				int D = sc.nextInt();
				int P = sc.nextInt();
				v[i] = (P << 16) + D;
			}
			Arrays.sort(v);
			int ans = 0;
			for (int i = N - 1; i >= 0; --i) {
				int D = v[i] & 0xFFFF;
				int P = v[i] >> 16;
				if (M >= D) {
					M -= D;
				} else {
					ans += (D - M) * P;
					M = 0;
				}
			}
			System.out.println(ans);
		}
	}
}