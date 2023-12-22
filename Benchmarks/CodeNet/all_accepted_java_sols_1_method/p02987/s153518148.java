import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0;
		String S = scan.next();
		char str [] = new char [S.length()] ;

		for (int i = 0;i < S.length();i++) {
			str[i] = S.charAt(i) ;
		}

		for (int i = 0; i < S.length() ;i++) {
			for (int j =i+1; j < S.length(); j++) {
				if (str[i] == str[j]) {
				count++;
				}
			}
		}
		if (count == 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}