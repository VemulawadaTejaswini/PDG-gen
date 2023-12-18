import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String w = in.next();
		int count = 0;
		while (true) {
			String t = in.next();
			if (t.equals("END_OF_TEXT")) {
				break;
			}
			String text = t.toLowerCase();
			if (text.equals(w)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
