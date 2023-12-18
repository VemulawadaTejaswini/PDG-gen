import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String sentence = scanner.nextLine();
			if (sentence.equals(".")) {
				break;
			}
			sentence = sentence.replaceAll("[a-zA-Z .]", "");

			int length = sentence.length();
			while (length > 0) {
				sentence = sentence.replaceAll("\\(\\)", "");
				sentence = sentence.replaceAll("\\[\\]", "");
				if (sentence.length() == length) {
					break;
				} else {
					length = sentence.length();
				}
			}
			if (sentence.length() == 0) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}

	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

}