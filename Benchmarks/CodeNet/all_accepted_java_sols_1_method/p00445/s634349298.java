import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		while (true) {
			if (in.hasNext() == false) {
				break;
			}
			String text = in.next();
			char[] s = text.toCharArray();
			int joi = 0;
			int ioi = 0;
			for (int i = 0; i < text.length() - 2; i++) {
				if (s[i] == 'J' && s[i + 1] == 'O' && s[i + 2] == 'I') {
					joi++;
				} else if (s[i] == 'I' && s[i + 1] == 'O' && s[i + 2] == 'I') {
					ioi++;
				}
			}
			System.out.println(joi);
			System.out.println(ioi);
		}
	}
}