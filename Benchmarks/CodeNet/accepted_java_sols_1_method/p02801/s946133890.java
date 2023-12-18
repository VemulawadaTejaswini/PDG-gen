import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < alphabet.length(); i++) {
			if (s.equals(alphabet.substring(i, i + 1))) {
				System.out.println(alphabet.substring(i + 1, i + 2));
			}
		}
		scan.close();
	}

}
