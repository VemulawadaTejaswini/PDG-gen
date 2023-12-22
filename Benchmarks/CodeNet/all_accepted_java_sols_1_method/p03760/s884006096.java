import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String o = sc.next();
		String e = sc.next();
		String s = "";
		int countO = 0;
		int countE = 0;
		int n = o.length() + e.length();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				s += o.charAt(countO);
				countO++;
			}else {
				s += e.charAt(countE);
				countE++;
			}
		}
		System.out.println(s);
		sc.close();
	}
}
