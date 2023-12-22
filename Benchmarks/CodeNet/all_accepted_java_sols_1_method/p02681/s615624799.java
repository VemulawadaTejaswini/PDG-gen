import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		String subT = T.substring(0, T.length() - 1);
		System.out.println(S.equals(subT) ? "Yes" : "No");

		sc.close();
	}
}