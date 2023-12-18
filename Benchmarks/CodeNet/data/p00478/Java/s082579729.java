
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int n = scanner.nextInt();
		int ans = 0;
		while (n-- > 0) {
			String s = scanner.next();
			s += s;
			if (s.contains(str))
				ans++;
		}
		System.out.println(ans);
	}
}