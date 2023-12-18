import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		char[] code = sc.nextLine().toCharArray();

		decode(code);

	}

	private static void decode(char[] code) {
		char[] decode = new char[code.length];

		for(int i = 0; i < 26; i++) {

			for(int j = 0; j < code.length; j++) {

				if ( code[j] == '.' || code[j] == ' ' || code[j] == '\n') {
					decode[j] = code[j];

				} else {
					int num = ( code[j] - 'a' + i ) % 26;
					decode[j] = (char) ('a' + num);

				}
			}

			String str = String.valueOf(decode);

				if (str.contains("the") && str.contains("this") &&str.contains("that")) {
					System.out.println(str);
					break;
				}

		}
	}

}
