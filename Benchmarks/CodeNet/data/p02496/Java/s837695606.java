import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		boolean[] cards = new boolean[52];
		for (int i = 0; i < n; i++) {
			String mark = in.next();
			int no = in.nextInt();
			int index;
			if ("S".equals(mark)) {
				cards[no - 1] = true;
			} else if ("H".equals(mark)) {
				cards[13 + no - 1] = true;
			} else if ("C".equals(mark)) {
				cards[13 * 2 + no - 1] = true;
			} else {
				cards[13 * 3 + no - 1] = true;
			}
		}
		String[] marks = { "S", "H", "C", "D" };
		for (int i = 0; i < 52; i++) {
			if (!cards[i]) {
				System.out.println(marks[i / 13] + " " + ((i + 1) % 13));
			}
		}
	}
}