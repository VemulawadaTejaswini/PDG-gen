import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count[] = new int[26];
		for (int i = 0; i < 26; i++) {
			count[i] = 0;
		}
		loop: while (true) {
			String str = new String();
			str = sc.next();
			int n = str.length();
			char c = 'a';
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 26; j++) {
					if (str.charAt(i) == c + j || str.charAt(i) == c + j - 32) {
						count[j]++;
					}
				}
				if (str.charAt(i) == '.') {
					break loop;
				}
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.printf("%c : %d\n", 'a' + i, count[i]);
		}
	}

}