import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		sc.close();

		if(S.equals(T.substring(0, T.length() - 1)) && T.length() == S.length() + 1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}