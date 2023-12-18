
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String a = scanner.next();
			String b = scanner.next();

			int p1 = a.length();
			int p2 = 0;
			int ans = 0;
			while (p1 != 0 || p2 <= b.length()) {
				if (p1 != 0)
					p1--;
				else
					p2++;
				ans = Math.max(ans, slove(a, b, p1, p2));
			}
			System.out.println(ans);
		}
	}

	private int slove(String a, String b, int p1, int p2) {
		int tmp = 0;
		int res = 0;
		int len = Math.min(b.length() - p2, a.length() - p1);

		for (int i = 0; i < len; i++) {
			if (a.charAt(p1 + i) != b.charAt(p2 + i)) {
				res = Math.max(res, tmp);
				tmp = 0;
			} else
				tmp++;
		}
		return Math.max(tmp, res);
	}
}