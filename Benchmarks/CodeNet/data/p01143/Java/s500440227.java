import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int M = sc.nextInt() - 1;
			int P = sc.nextInt();
			int all = 0;
			int win = 0;
			for (int i = 0; i < N; ++i) {
				int X = sc.nextInt();
				all += X;
				if (i == M) win = X;
			}
			System.out.println(win == 0 ? 0 : (all * 100 - all * P) / win);
		}
	}
}