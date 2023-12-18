import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();

		int[] charArr = new int[26];

		for (char c : str.toCharArray()) {
			if (c > 64 && c < 91) {
				charArr[c - 65]++;
			}
			if (c > 96 && c < 123) {
				charArr[c - 97]++;
			}
		}

		for (int i=0; i<26; i++) {
			System.out.println((char)(i+97) + " : " + charArr[i]);
		}

		scan.close();
	}
}

