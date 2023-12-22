import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();

		if(S.substring(0,S.length()).equals(T.substring(0,S.length()))) {
			if(T.substring(T.length()) != "") {
				System.out.print("Yes");
			}
			else
				System.out.print("No");
		}
		else
			System.out.print("No");

    }
}
