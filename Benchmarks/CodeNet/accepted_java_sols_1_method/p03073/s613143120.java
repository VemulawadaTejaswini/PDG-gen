import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();

		int count = 0;
		char preC = S.charAt(0);
		char[] sChar = S.toCharArray();
		for (int i = 1; i < S.length(); i++) {
			char c = sChar[i];
			if (c == preC) {
				count++;
				if (c == '0') {
					preC = '1';
				} else {
					preC = '0';
				}
			} else {
				preC = c;
			}
		}

		System.out.println(count);
	}

}