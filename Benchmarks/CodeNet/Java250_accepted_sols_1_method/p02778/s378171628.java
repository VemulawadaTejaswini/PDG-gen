import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int n = S.length();
		StringBuilder st = new StringBuilder("x");
		for (int x = 1; x < n; x++) {
			st.append("x");
		}
		System.out.println(st);
	}
}
