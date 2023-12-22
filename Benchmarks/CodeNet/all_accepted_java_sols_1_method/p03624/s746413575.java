import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String S = scan.nextLine();

		char alpha = 'a';

		for (int i = 0; i < 26; i++) {
			if (S.indexOf(String.valueOf(alpha)) != -1) {
				alpha++;
			} else {
				System.out.println(alpha);
				return;
			}

		}
		System.out.print("None");
	}
}
