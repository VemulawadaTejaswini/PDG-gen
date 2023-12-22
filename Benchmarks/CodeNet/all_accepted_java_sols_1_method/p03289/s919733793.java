import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char s[] = sc.next().toCharArray();
		boolean b = true;
		int cnt = 0;
		if (s[0] == 'A') {

			for (int i = 1; i < s.length; i++) {
				if (s[i] >= 'a' && s[i] <= 'z') {
				} else if (s[i] == 'C' && i != s.length - 1 && i != 1) {
					cnt++;
					if (cnt > 1) {
						b = false;
						break;
					}
				} else {
					b = false;
					break;
				}
			}

		} else {
			b = false;
		}

		if (b && cnt == 1) {
			System.out.println("AC");
		} else {
			System.out.println("WA");
		}
	}
}
