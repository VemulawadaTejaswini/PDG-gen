import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int M = s.nextInt();

			int lhs = 1;
			int rhs = N;
			for (int i = 0; i < M; i++) {
				int l = s.nextInt();
				if (lhs < l) {
					lhs = l;
				}
				int r = s.nextInt();
				if (rhs > r) {
					rhs = r;
				}
			}
			if (lhs > rhs) {
				System.out.println(0);
			} else {
				System.out.println(rhs - lhs + 1);
			}
		}
	}
}
