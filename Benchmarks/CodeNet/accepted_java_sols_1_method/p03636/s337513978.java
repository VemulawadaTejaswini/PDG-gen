import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		if(S.length() > 2) {
			String h = S.substring(0, 1);
			String t = S.substring(S.length()-1,S.length());
			int length = S.length()-2;
			System.out.println(h + length + t);
		} else {
			System.out.println(S);
		}
	}
}
