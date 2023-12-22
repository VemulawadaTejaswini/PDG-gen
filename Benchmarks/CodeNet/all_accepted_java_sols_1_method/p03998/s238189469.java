import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		String[] S = new String[] {A,B,C};
		sc.close();
		int num = 0;
		while(S[num].length() != 0) {
			int cnt = S[num].charAt(0) - 'a';
			S[num] = S[num].substring(1);
			num = cnt;
		}
		System.out.println((char)('A' + num));
	}
}