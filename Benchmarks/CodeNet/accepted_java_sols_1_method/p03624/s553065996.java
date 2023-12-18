import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String s = sc.next();
		char moji = 'a';

		for (int i = 0; i < 26; i++) {
			if (s.contains(Character.toString(moji)) == false) {
				System.out.print(moji);
				System.exit(0);
			}
			moji++;
		}
		System.out.print("None");

	}
}