
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Count = new int[26];
		for (int i = 0; i < 26; i++) {
			Count[i] = 0;
		}
		while (sc.hasNextLine()) {
			String S = sc.nextLine();
			for (int i = 0; i < S.length(); i++) {
				char c = Character.toLowerCase(S.charAt(i));
				if (c >= 'a' && c <= 'z') {
					Count[c - 'a']++;
				}
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.println((char)('a' + i) + " : " + Count[i]);
		}
	}
}

