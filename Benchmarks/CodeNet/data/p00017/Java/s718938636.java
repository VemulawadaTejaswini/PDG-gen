import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNext()) {
				String line = sc.nextLine();
				int offset = calculateIndex(line);
				System.out.println(encryptString(line, offset));
			}
		}
	}

	public static int calculateIndex(String str) {
		String[] ss = str.split(" ");
		for (String s : ss) {
			if (s.length() == 4) { // this, that
				if ((s.charAt(0) + 26 - s.charAt(1)) % 26 == 't' - 'h'
						&& (s.charAt(2) + 26 - s.charAt(1)) % 26 == 'i' - 'h'
						&& (s.charAt(3) + 26 - s.charAt(2)) % 26 == 's' - 'i') {
					return (s.charAt(0) + 26 - 't') % 26;
				} else if ((s.charAt(0) + 26 - s.charAt(1)) % 26 == 't' - 'h'
						&& (s.charAt(2) + 26 - s.charAt(1)) % 26 == 'a' - 'h'
						&& (s.charAt(3) + 26 - s.charAt(2)) % 26 == 't' - 'a') {
					return (s.charAt(0) + 26 - 't') % 26;
				}
			} else if (s.length() == 3) { // the
				if ((s.charAt(0) + 26 - s.charAt(1)) % 26 == 't' - 'h'
						&& (s.charAt(2) + 26 - s.charAt(1)) % 26 == 'e' - 'h') {
					return (s.charAt(0) + 26 - 't') % 26; 
				}
			}
		}
		return 0;
	}

	public static String encryptString(String str, int offset) {
		char[] result = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			result[i] = cc;
			if (cc == ' ' || cc == '.') {
				continue;
			}
			result[i] = (char)(((result[i] - offset) % 'a') + 'a');
		}
		return new String(result);
	}
}