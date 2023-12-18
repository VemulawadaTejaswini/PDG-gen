
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int w = scanner.nextInt();
			int q = scanner.nextInt();
			if ((w | q) == 0)
				break;
			int[] map = new int[w];
			Arrays.fill(map, -1);
			loop: while (q-- > 0) {
				char c = scanner.next().charAt(0);
				if (c == 's') {
					int id = scanner.nextInt();
					int n = scanner.nextInt();
					int cnt = 0;
					for (int i = 0; i < w; i++) {
						if (map[i] == -1) {
							cnt++;
							if (cnt == n) {
								for (int j = i - n + 1; j <= i; j++) {
									map[j] = id;
								}
								System.out.println(i - cnt + 1);
								continue loop;

							}
						} else
							cnt = 0;
					}
					System.out.println("impossible");
				} else {
					int id = scanner.nextInt();
					for (int i = 0; i < w; i++) {
						if (map[i] == id)
							for (int j = i; j < w; j++) {
								if (map[j] == id)
									map[j] = -1;
								else
									break;
							}
					}
				}
			}
			System.out.println("END");
		}
	}
}