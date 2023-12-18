import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String n = sc.next();
		String sm = Long.toString(Long.parseLong(n, 10), 26);
		// System.out.println(sm);

		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] smStr = "123456789abcdefghijklmnop0".toCharArray();
		for (int i = alphabet.length - 1; i >= 0; i--) {
			sm = sm.replace(smStr[i], alphabet[i]);
		}
		System.out.println(sm);
	}
}