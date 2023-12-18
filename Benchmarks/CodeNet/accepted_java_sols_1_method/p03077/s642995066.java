import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final double N = s.nextLong();
			long min = Long.MAX_VALUE;
			for (int i = 0; i < 5; i++) {
				min = Math.min(min, s.nextLong());
			}

			long ret = (long) Math.ceil(N / min) - 1 + 5;
			System.out.println(ret);
		}
	}
}
