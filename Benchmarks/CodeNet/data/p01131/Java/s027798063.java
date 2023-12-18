
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n-- > 0) {
			String s = scanner.next();
			int size = s.length();
			int pos = -1;
			int stock = -1;
			for (int i = 0; i < size; i++) {
				int button = s.charAt(i) - '0';
				if (button == 0) {
					if (stock == -1)
						continue;
					System.out.print(mes[stock].charAt(pos
							% mes[stock].length()));
					stock = -1;
					pos = -1;
				} else {
					stock = button;
					pos++;
				}
			}
			System.out.println();

		}
	}

	String[] mes = { " ", ".,!? ", "abc", "def", "ghi", "jkl", "mno", "pqrs",
			"tuv", "wxyz" };
}