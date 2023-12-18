import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count[] = new int[26];
		for (int i = 0; i < 26; i++) {
			count[i] = 0;
		}
		while (true) {
			String str = sc.next();
			int n = str.length();
			char c = 'a';
			for (int i = 0; i < 26; i++) {
				for (int j = 0; j < n; j++) {
					if (str.charAt(j) == c + i || str.charAt(j) == c + i - 32) {
						count[i]++;
					}
				}
			}
			if (str.charAt(n-1) == '.') {
				break;
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.printf("%c : %d\n", 'a' + i, count[i]);
		}
	}

}