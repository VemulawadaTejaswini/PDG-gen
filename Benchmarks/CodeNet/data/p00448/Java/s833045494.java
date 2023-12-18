
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int R = scanner.nextInt();
			int C = scanner.nextInt();
			if ((R | C) == 0)
				break;
			int[] b = new int[C];
			for (int i = 0; i < R; i++)
				for (int j = 0; j < C; j++) {
					int a = scanner.nextInt();
					b[j] = b[j] * 2 + a;
				}
			int ans = 0;
			loop:
			for (int x = 0; x < (1 << R); x++) {
				int k = 0;
				for (int j = 0; j < C; j++) {
					int aa = b[j];
					int bb = aa ^ x;
					int cc = Integer.bitCount(bb);
					k += Math.max(cc, R - cc);
					if ((C - j -1) * R + k <= ans)
						continue loop;
				}
				ans = Math.max(ans, k);
			}
			System.out.println(ans);
		}
	}
}