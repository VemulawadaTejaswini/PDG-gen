import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String word = sc.next().toLowerCase();
		String text;
		int count = 0;

		while (true) {
			text = sc.next();
			if (text.contentEquals("END_OF_TEXT")) {
				break;
			} else {
				if (text.toLowerCase().equals(word)) {
					count++;
				}
			}
		}

		System.out.println(count);
	}
}
