import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] buf = new int[50];
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int R = sc.nextInt();
			int[] v = new int[N];
			for (int i = 0; i < N; ++i) {
				v[i] = N - i;
			}
			for (int i = 0; i < R; ++i) {
				int P = sc.nextInt() - 1;
				int C = sc.nextInt();
				for (int j = 0; j < C; ++j) {
					buf[j] = v[P + j];
				}
				for (int j = 0; j < P; ++j) {
					buf[C + j] = v[j];
				}
				for (int j = 0; j < C + P; ++j) {
					v[j] = buf[j];
				}
			}
			System.out.println(v[0]);
		}
	}
}