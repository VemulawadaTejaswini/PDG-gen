
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String w = scanner.next();
		w = w.toLowerCase();
		String t;
		int count = 0;

		while (true) {
			t = scanner.next();
			if (t.equals("END_OF_TEXT")) {
				break;
			}
			t = t.toLowerCase();
			if (t.equals(w)) {
				count = count + 1;
			}
		}

		System.out.println(count);
	}

}

