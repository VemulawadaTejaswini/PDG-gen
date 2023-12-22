import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int l = 0;
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == 'A') {
				l = i;
				break;
			}
		}
		int r = 0;
		for(int i = S.length() - 1; i >= 0; i--) {
			if(S.charAt(i) == 'Z') {
				r = i;
				break;
			}
		}
		System.out.println(r- l + 1);
	}
}