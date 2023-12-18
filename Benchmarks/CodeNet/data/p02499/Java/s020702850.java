import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.length();
		char c = 'a';
		for (int i = 0; i < 26; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (str.charAt(j) == c + i || str.charAt(j) == c + i - 32) {
					count++;
				}
			}
			System.out.printf("%c : %d\n", c + i, count);
		}
	}

}