import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int T = sc.nextInt();
			String N = sc.next();
			int num = Integer.parseInt(N);
			if (T == 0 && num == 0) break;
			int L = N.length();
			int[][] v = new int[L][L + 1];
			for (int i = 0; i < L; ++i) {
				for (int j = i + 1; j <= L; ++j) {
					v[i][j] = Integer.parseInt(N.substring(i, j));
				}
			}
			int best = -1;
			int bestI = -1;
			for (int i = 0; i < (1 << (L - 1)); ++i) {
				int idx = (1 << L) + (i << 1) + 1;
				int sum = 0;
				int left = 0;
				while (left < L) {
					int right = left + 1;
					while ((idx & (1 << right)) == 0) {
						++right;
					}
					sum += v[left][right];
					left = right;
				}
				if (sum <= T) {
					if (sum > best) {
						best = sum;
						bestI = idx;
					} else if (sum == best) {
						bestI = -2;
					}
				}
			}
			if (bestI == -1) {
				System.out.println("error");
			} else if (bestI == -2) {
				System.out.println("rejected");
			} else {
				System.out.print(best);
				int left = 0;
				while (left < L) {
					int right = left + 1;
					while ((bestI & (1 << right)) == 0) {
						++right;
					}
					System.out.print(" " + v[left][right]);
					left = right;
				}
				System.out.println();
			}
		}
	}
}