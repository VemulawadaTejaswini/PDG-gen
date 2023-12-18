import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] s = scanner.nextLine().toCharArray();
			int count1 = 0, count2 = 0;
			char s1, s2;
			for (int i = 0; i < s.length; i++) {
				if (i % 2 == 0) {
					s1 = '0';
					s2 = '1';
				} else {
					s1 = '1';
					s2 = '0';
				}
				if (s[i] != s1) {
					count1++;
				}
				if (s[i] != s2) {
					count2++;
				}
			}
			System.out.println(Math.min(count1, count2));
		}
	}
}
