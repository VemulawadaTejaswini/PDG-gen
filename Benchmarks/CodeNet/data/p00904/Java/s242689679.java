import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] sq = new int[20001];

	public static void main(String[] args) {
		for (int i = 1; i * i < 20000; ++i) {
			sq[i * i] = i;
		}
		int N = sc.nextInt();
		for (int i = 0; i < N; ++i) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(solve(m, n) ? "P" : "C");
		}
	}

	static boolean solve(int M, int N) {
		int D = M * M + N * N;
		for (int i = 2; i * i <= D; ++i) {
			if (D % i != 0) continue;
			for (int p = 1; p * p * 2 <= i; ++p) {
				int q = sq[i - p * p];
				if (p * p != i && q == 0) continue;
				if ((M * p + N * q) % i == 0 && (M * q - N * p) % i == 0) return false;
			}
		}
		return true;
	}
}