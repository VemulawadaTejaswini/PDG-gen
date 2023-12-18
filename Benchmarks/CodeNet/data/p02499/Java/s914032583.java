import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int['z' - 'a'];

		while (sc.hasNextLine()) {
			String input = sc.nextLine();
			input = input.toLowerCase();

			int len = input.length();
			char[] str = new char[len];

			for (int i = 0; i < len; i++) {
				str[i] = input.charAt(i);
			}

			for (int i = 0; i < len; i++) {
				for (int j = 0; j < 'z' - 'a'; j++) {
					if (str[i] == 'a' + j) {
						count[j] = count[j] + 1;
					}
				}
			}

			for (int j = 0; j < 'z' - 'a'; j++) {
				System.out.printf("%c : %d\n", 'a' + j, count[j]);
			}
		}
		sc.close();
	}
}