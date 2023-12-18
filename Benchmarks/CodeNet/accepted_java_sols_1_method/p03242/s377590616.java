
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n;
		n = sc.next();
		char ans[];
		ans = new char[n.length()];

		for (int i = 0; i < n.length(); ++i) {
			if (n.charAt(i) == '1') {
				ans[i] = '9';
			} else if (n.charAt(i) == '9') {
				ans[i] = '1';
			}
		}

		System.out.println(ans);
		sc.close();
	}

}
