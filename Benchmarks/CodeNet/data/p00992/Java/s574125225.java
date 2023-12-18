import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] H = new int[N];
		for (int i = 0; i < N; ++i) {
			H[i] = sc.nextInt();
		}
		Arrays.sort(H);
		long ans = 1;
		int pos = 0;
		for (int i = 1;; ++i) {
			while (pos < N && H[pos] < i) {
				++pos;
			}
			if (pos == N) break;
			ans += Math.min(N - pos, 4 * i);
		}
		System.out.println(ans);
	}

}