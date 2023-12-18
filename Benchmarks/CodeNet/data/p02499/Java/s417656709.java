import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		int[] alphabet = new int[26];

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ('A' <= c && c <= 'Z') {
				alphabet[c - 'A']++;
			}
			if ('a' <= c && c <= 'z') {
				alphabet[c - 'a']++;
			}
		}

		for (int i = 0; i < 26; i++) {
			System.out.println((char) (i + 'a') + " : " + alphabet[i]);
		}

		sc.close();
	}
}