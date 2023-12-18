import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			String s = "";
			while (sc.hasNextLine()) {
				s += sc.nextLine();
			}
			s = s.toLowerCase();
			int num[] = new int[26];
			for (int i = 0; i < s.length(); i++) {
				if (String.valueOf(s.charAt(i)).matches("[a-z]")) {
					num[(s.charAt(i) - 'a')]++;
				}
			}
			for (int j = 0; j < 26; j++) {
				System.out.println((char) (j + 'a') + " : " + num[j]);
			}
		}
	}
}

