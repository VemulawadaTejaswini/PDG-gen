import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int t[] = new int[] { s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt() };

			int ret = 0;
			int min = 10;
			for (int i = 0; i < t.length; i++) {
				if (t[i] % 10 != 0) {
					ret += (t[i] / 10) + 1;
					min = Math.min(min, t[i] % 10);
				} else {
					ret += t[i] / 10;
				}
			}
			System.out.println(ret * 10 - (10 - min));
		}
	}
}
