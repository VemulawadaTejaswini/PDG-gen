import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		sc.close();

		for(int i = 0; i < S.length(); i++) {
			if(S.equals(T)) {
				System.out.println("Yes");
				return;
			}
			String tmp = S.substring(0, S.length() - 1);
			S = S.charAt(S.length() - 1) + tmp;
		}
		System.out.println("No");
	}

}
