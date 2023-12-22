import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		int ans = S.replace("-", "").length() - S.replace("+", "").length();
		System.out.println(ans);
		scanner.close();
	}
}