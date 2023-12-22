import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int A = s.nextInt();
			final int B = s.nextInt();
			final int T = s.nextInt();

			int ret = 0;
			for(int i = A; i <= T; i += A) {
				ret += B;
			}
			System.out.println(ret);
		}
	}
}
