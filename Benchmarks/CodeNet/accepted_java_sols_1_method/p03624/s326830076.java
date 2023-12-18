import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String s = sc.next();
		final String list[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "y", "z" };

		int count = 0;
		for (int i = 0; i < list.length; i++) {
			if (s.indexOf(list[i]) >= 0) {
				count++;
				continue;
			} else {
				System.out.print(list[i]);
				break;
			}
		}

		if (count == list.length) {
			System.out.print("None");
		}

	}

}