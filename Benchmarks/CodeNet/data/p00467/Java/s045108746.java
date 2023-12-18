import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			if (N == 0) break;
			int[] d = new int[N];
			for (int i = 0; i < N; ++i) {
				d[i] = sc.nextInt();
			}
			int[] m = new int[M];
			for (int i = 0; i < M; ++i) {
				m[i] = sc.nextInt();
			}
			int cur = 0;
			for (int i = 0; i < M; ++i) {
				if (cur >= N - 1) {
					System.out.println(i + 1);
					break;
				}
				cur += m[i];
				if (cur >= N - 1) {
					System.out.println(i + 1);
					break;
				}
				cur += d[cur];
			}
		}
	}

}