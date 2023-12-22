import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int count = 0;

		char word = 'a';
		String input = "";

		int[] countList = new int[26];

		Scanner sc = null;

		try {
			sc = new Scanner(System.in);

			while (sc.hasNext()) {

			input = sc.nextLine();

				//?°????????????????
				input = input.toLowerCase();

				if (input != null) {

					//??¢?????????????????????????´¢
					char[] check = input.toCharArray();
					for (int i = 0; i < 26; i++) {

						for (int j = 0; j < check.length; j++) {
							if ((int)check[j] == (int)word) {
								count++;
							}
						}
						countList[i] += count;
						count = 0;
						word++;
					}
					word = 'a';
				}
			}
			//????????????
			word = 'a';
			for (int i = 0; i < countList.length; i++) {

				System.out.println(word + " : " + countList[i]);
				word++;
			}

		}finally {
			sc.close();
		}
	}

}