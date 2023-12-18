import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String n = sc.next();
		boolean flg26 = false;
		if (Long.parseLong(n) % 26 == 0) {
			n = Long.toString(Long.parseLong(n) - 26);
			flg26 = true;
		}
		String sm = Long.toString(Long.parseLong(n, 10), 26);

		boolean flg = true;
		if (flg26) {
			if ("1".equals(sm.substring(0, 1))) {
				for (int i = 1; i < sm.length(); i++) {
					if (!"0".equals(sm.substring(i, i + 1))) {
						flg = false;
						break;
					}
				}
				if (flg) {
					sm = sm.substring(1);
				}
			}
		}

		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] smStr = "123456789abcdefghijklmnop0".toCharArray();
		for (int i = alphabet.length - 1; i >= 0; i--) {
			sm = sm.replace(smStr[i], alphabet[i]);
		}
		System.out.println(sm);
	}
}