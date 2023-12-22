import java.util.*;

// ABC 54-D
// https://beta.atcoder.jp/contests/abc054/tasks/abc054_d

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int Y = in.nextInt();
		
		int a = -1;
		int b = -1;
		int c = -1;
		int rem = Y;
		boolean shouldContinue = true;
		
		for (int i = Y / 10_000; i >= 0 && shouldContinue; i--) {
			rem = Y - i * 10_000;
			if (i > N) {
				continue;
			}
			for (int j = rem / 5_000; j >= 0 && shouldContinue; j--) {
				if (i + j > N) {
					continue;
				}
				rem = Y - i * 10_000 - j * 5_000;
				int k = rem / 1000;
				rem = Y - i * 10_000 - j * 5_000 - k * 1_000;
				if (rem == 0 && i + j + k == N) {
					shouldContinue = false;
					a = i;
					b = j;
					c = k;
				}
			}
		}
		System.out.printf("%d %d %d\n", a, b, c);
	}
}