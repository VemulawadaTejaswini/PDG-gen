import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder S = new StringBuilder(sc.next());
		String T = sc.next();
		String ans = "No";
		for (int i = 0; i < S.length(); i++) {
			S.insert(0, S.substring(S.length() - 1));
			S.delete(S.length() - 1, S.length());
			if (S.toString().equals(T)) {
				ans = "Yes";
				break;
			}
		}
		System.out.println(ans);

	}

}
