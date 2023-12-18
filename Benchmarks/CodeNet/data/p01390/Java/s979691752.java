import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		boolean[] used = new boolean[26];
		System.out.println("?a");
		System.out.flush();
		while (true) {
			String input = sc.next();
			if (input.charAt(0) != 'a' || input.equals("a") || used[input.charAt(1) - 'a']) {
				System.out.println("!OUT");
				return;
			}
			used[input.charAt(1) - 'a'] = true;
			if (input.equals("aa")) {
				System.out.println("?aaa");
			} else {
				System.out.println("?" + input.charAt(1) + "a");
			}
			System.out.flush();
		}
	}
}