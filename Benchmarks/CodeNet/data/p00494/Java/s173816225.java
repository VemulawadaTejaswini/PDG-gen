
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		char[] chs = scanner.next().toCharArray();
		int len = chs.length;
		int idx = 0;
		int ans = 0;
		while (idx < len) {
			int jc = 0;
			int oc = 0;
			int ic = 0;
			while (idx < len && chs[idx] == 'J') {
				jc++;
				idx++;
			}
			while (idx < len && chs[idx] == 'O') {
				oc++;
				idx++;
			}
			while (idx < len && chs[idx] == 'I') {
				ic++;
				idx++;
			}
			if (jc >= oc && oc <= ic)
				ans = Math.max(ans, oc);
		}
		System.out.println(ans);
	}
}