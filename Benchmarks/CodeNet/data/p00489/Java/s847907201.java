import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] p = new int[N];
		for (int i = 0; i < N * (N - 1) / 2; ++i) {
			int A = sc.nextInt() - 1;
			int B = sc.nextInt() - 1;
			int C = sc.nextInt();
			int D = sc.nextInt();
			if (C > D) {
				p[A] += 3;
			} else if (C < D) {
				p[B] += 3;
			} else {
				p[A]++;
				p[B]++;
			}
		}
		int[] v = new int[N];
		for (int i = 0; i < N; ++i) {
			v[i] = (p[i] << 10) + i;
		}
		Arrays.sort(v);
		int[] rank = new int[N];
		int r = 0;
		int prev = 1 << 30;
		for (int i = N - 1; i >= 0; --i) {
			if ((v[i] >> 10) != prev) {
				r = N - i;
			}
			rank[v[i] & 0xFF] = r;
			prev = v[i] >> 10;
		}
		for (int i = 0; i < N; ++i) {
			System.out.println(rank[i]);
		}
	}
}