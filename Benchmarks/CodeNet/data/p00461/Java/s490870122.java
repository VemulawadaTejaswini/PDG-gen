
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int m = scanner.nextInt();
			char[] s = scanner.next().toCharArray();
			int i = 0;
			int ret = 0;
			while (i < m) {
				if (s[i] == 'O') {
					i++;
					continue;
				}
				int cnt = 0;
				i++;
				while (i + 1 < m && s[i] == 'O' && s[i + 1] == 'I') {
					cnt++;
					i += 2;
				}
				ret += Math.max(0, cnt - n + 1);
			}
			System.out.println(ret);
		}
	}
}