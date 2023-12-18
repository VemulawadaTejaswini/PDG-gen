
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		String[] fiz = new String[10001];
		for (int i = 1; i <= 10000; i++) {
			if (i % 15 == 0)
				fiz[i] = "FizzBuzz";
			else if (i % 5 == 0)
				fiz[i] = "Buzz";
			else if (i % 3 == 0)
				fiz[i] = "Fizz";
			else
				fiz[i] = String.valueOf(i);
		}
		while (true) {
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			if ((m | n) == 0)
				break;
			List<Integer> list = new LinkedList<Integer>();
			for (int i = 1; i <= m; i++) {
				list.add(i);
			}
			int pos = 0;
			for (int i = 1; i <= n; i++) {
				String str = scanner.next();
				if (list.size() == 1)
					continue;
				if (!str.equals(fiz[i])) {
					list.remove(pos);
					pos--;
				}
				pos = pos == list.size() - 1 ? 0 : pos + 1;

			}
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i));
				System.out.print(i == list.size() - 1 ? '\n' : ' ');
			}

		}
	}
}