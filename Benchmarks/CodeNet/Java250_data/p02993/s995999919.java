import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		sc.close();
		char s = S[0];
		boolean ok = true;
		for(int i = 1; i < S.length; i++) {
			if(s == S[i]) {
				ok = false;
				break;
			}
			s = S[i];
		}
		System.out.println(ok ? "Good" : "Bad");
	}
}
