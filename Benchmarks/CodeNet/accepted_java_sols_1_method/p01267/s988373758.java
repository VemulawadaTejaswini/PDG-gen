import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int X = sc.nextInt();
			int[] Y = new int[N];
			for (int i = 0; i < N; ++i) {
				Y[i] = sc.nextInt();
			}
			int p = 0;
			for (int i = 0; i <= 10000; ++i) {
				if (X == Y[p]) {
					++p;
					if (p == N) {
						System.out.println(i);
						break;
					}
				}
				X = (A * X + B) % C;
			}
			if (p < N) System.out.println(-1);
		}
	}

}