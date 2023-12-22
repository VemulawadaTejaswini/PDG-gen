import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		char[] s = new char[S.length()];
		for(int i = 0; i < S.length(); i++) {
			s[i] = S.charAt(i);
		}
		s[3] = '8';
		System.out.println(s);

	}

}