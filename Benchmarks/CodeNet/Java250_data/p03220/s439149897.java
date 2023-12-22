import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			final int N = scn.nextInt();
			final int T = scn.nextInt();
			final int A = scn.nextInt();

			double min = Double.MAX_VALUE;
			int ret = -1;
			for (int i = 0; i < N; i++) {
				double work = Math.abs(A - (T - scn.nextInt() * 0.006));
				if (min > work) {
					min = work;
					ret = i + 1;
				}
			}
			System.out.println(ret);
		}
	}
}
