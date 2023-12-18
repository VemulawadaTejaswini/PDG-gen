import java.util.Scanner;

public class Main {
	static boolean is_cap(char c) {
		return 'A' <= c && c <= 'Z';
	}
	static boolean is_sml(char c) {
		return 'a' <= c && c <= 'z';
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); ++i) {
			char c = str.charAt(i);
			System.out.print(is_cap(c) ? (char) (c - 'A' + 'a') : is_sml(c) ? (char) (c - 'a' + 'A') : c);
		}
		System.out.println();
	}
}
