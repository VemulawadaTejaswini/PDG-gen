import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final char[] END_OF_INPUT = "END OF INPUT".toCharArray();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			char[] line = in.nextLine().toCharArray();
			if (!Arrays.equals(line, END_OF_INPUT)) {
				int num = 0;
				for (char c : line) {
					if (c == ' ') {
						System.out.print(num);
						num = 0;
					} else {
						num++;
					}
				}
				System.out.println(num);
			}

		}

	}
}