import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S;
		S = sc.next();

		int cnt = 0;
		int cntN = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'o') {
				cnt++;
			} else {
				cntN++;
			}
		}

		if (S.length() == 15 && cnt < 8) {
			System.out.println("NO");
		} else if (S.length() == 15 && cnt >= 8) {
			System.out.println("YES");
		} else if (S.length() < 15 && cntN <= 7) {
			System.out.println("YES");
		} else if (S.length() < 15 && cntN >= 8) {
			System.out.println("NO");
		}
	}
}