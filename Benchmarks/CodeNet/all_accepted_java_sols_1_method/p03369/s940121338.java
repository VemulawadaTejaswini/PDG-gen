import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		int en = 700;
		for (char c : s.toCharArray()) {
			if (c == 'o') {
				en += 100;
			}
		}
		System.out.println(en);
	}

}
