import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int count = 0;
		int cord = 97;

		char word = 'a';

		Scanner sc = null;

		try {
			sc = new Scanner(System.in);

			String input = sc.nextLine();

			//?°????????????????
			input = input.toLowerCase();

			//??¢?????????????????????????´¢
			char[] check = input.toCharArray();
			for (int i = 0; i < 26; i++) {

				for (int j = 0; j < check.length; j++) {
					if ((int)check[j] == (int)word) {
						count++;
					}
				}
				System.out.println(word + " : " + count);

				count = 0;
				word++;
			}

		} finally {
			sc.close();
		}
	}

}