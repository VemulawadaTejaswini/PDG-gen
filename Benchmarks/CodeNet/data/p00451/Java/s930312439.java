
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			a = scanner.next();
			b = scanner.next();
			int p1 = a.length();
			int p2 = 0;
			int ans = 0;
			while (p1 != 0 || p2 != b.length()) {
				if (p1 != 0)
					p1--;
				else
					p2++;
				ans = Math.max(ans, slove(p1, p2));
			}
			System.out.println(ans);
		}

	}

	private int slove(int p1, int p2) {
		int res = 0;
		int tmp = 0;
		int leng = Math.min(a.length() - p1, b.length() - p2);
		for (int i = 0; i < leng; i++) {
			if (a.charAt(i + p1) == b.charAt(i + p2)) {
				tmp++;
				res = Math.max(res, tmp);
			} else {
				tmp = 0;
			}
		}
		return res;
	}

	String a;
	String b;
}