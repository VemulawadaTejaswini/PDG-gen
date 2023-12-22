import java.util.BitSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			BitSet[] bs = new BitSet[N];
			for (int i = 0; i < N; ++i) {
				bs[i] = new BitSet(N);
			}
			for (int i = 0; i < N; ++i) {
				int M = sc.nextInt();
				for (int j = 0; j < M; ++j) {
					int p = sc.nextInt() - 1;
					bs[i].set(p);
				}
			}
			int K = sc.nextInt();
			BitSet reveal = new BitSet(N);
			for (int i = 0; i < K; ++i) {
				int l = sc.nextInt() - 1;
				reveal.set(l);
			}
			int ans = -1;
			for (int i = 0; i < N; ++i) {
				bs[i].and(reveal);
				if (bs[i].equals(reveal)) {
					if (ans != -1) {
						ans = -1;
						break;
					} else {
						ans = i + 1;
					}
				}
			}
			System.out.println(ans);
		}
	}
}