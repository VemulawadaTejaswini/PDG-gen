import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		String input = scan.next();
		char[] tile = input.toCharArray();
		int len = tile.length;

		// check
		int count = 0;
		char color = tile[0];
		for (int i = 1; i < len; i++) {
			if (tile[i] == color) {
				if (color == '1') {
					tile[i] = '0';
					color = '0';
					count++;
				} else {
					tile[i] = '1';
					color = '1';
					count++;
				}
			} else {
				color = tile[i];
			}
		}

		// answer
		System.out.println(count);
	}
}
