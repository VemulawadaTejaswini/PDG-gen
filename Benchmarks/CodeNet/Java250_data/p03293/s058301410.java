import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		if (S.equals(T)) {
			System.out.println("Yes");
			return;
		}
		StringBuilder sb = new StringBuilder(S);
		for (int i = 0; i < sb.length() - 1; i++) {
			sb.insert(0, sb.charAt(sb.length() - 1));
			sb.delete(sb.length() - 1, sb.length());
			if (sb.toString().equals(T)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
		sc.close();
	}
}