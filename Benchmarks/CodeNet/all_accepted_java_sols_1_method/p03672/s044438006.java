
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		for (int i = S.length() - 1; i > 0; i--) {
			String f = S.substring(0, i / 2);
			String s = S.substring(i / 2, i);
			if (f.equals(s)) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
}