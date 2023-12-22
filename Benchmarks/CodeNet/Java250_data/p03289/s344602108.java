import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		scan.close();
		if(S.charAt(0) != 'A') {
			System.out.println("WA");
			System.exit(0);
		}
		int cnt = 0;
		for(int i = 2; i < S.length() - 1; i++) {
			char c = S.charAt(i);
			if(c == 'C') {
				cnt++;
			}
		}
		if(cnt != 1) {
			System.out.println("WA");
			System.exit(0);
		}
		for(int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if(c != 'A' && c != 'C') {
				if(!(c >= 'a' && c <= 'z')) {
					System.out.println("WA");
					System.exit(0);
				}
			}
		}
		System.out.println("AC");
	}
}