
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
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
			Map<String, String> map = new HashMap<String, String>();
			while (n-- > 0) {
				String k = scanner.next();
				String v = scanner.next();
				map.put(k, v);
			}
			int m = scanner.nextInt();
			while (m-- > 0) {
				String ans = scanner.next();
				if (map.containsKey(ans))
					ans = map.get(ans);
				System.out.print(ans);
			}
			System.out.println();
		}
	}
}