import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		String t = sc.next();

		String[] sa = s.split("");
		String[] ta = t.split("");

		String ans = "";
		for (int i = 0; i < n; i++) {
			ans += sa[i];
			ans += ta[i];
		}
		System.out.println(ans);
	}
}
