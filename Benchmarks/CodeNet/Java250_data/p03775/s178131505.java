import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final long N = sc.nextLong();
		long minFab = Integer.MAX_VALUE;

		for (int i = 1, cap = (int) Math.sqrt(N) + 1; i <= cap; i++) {
			long a = i;
			if (N % a == 0) {
				long b = N / i;
				minFab = Math.min(minFab, F(a, b));
			}
		}
		System.out.println(minFab);
		sc.close();
	}

	private int F(long a, long b) {
		return Math.max(Long.toString(a).length(), Long.toString(b).length());
	}
}
