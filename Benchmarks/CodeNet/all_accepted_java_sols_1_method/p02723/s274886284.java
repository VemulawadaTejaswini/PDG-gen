import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String S;
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		char s_3;
		char s_4;
		char s_5;
		char s_6;
		s_3 = S.charAt(2);
		s_4 = S.charAt(3);
		s_5 = S.charAt(4);
		s_6 = S.charAt(5);
		if (s_3 == s_4) {
			if (s_5 == s_6) {
				System.out.println("Yes");
			} else
				System.out.println("No");
		} else
			System.out.println("No");
	}

}