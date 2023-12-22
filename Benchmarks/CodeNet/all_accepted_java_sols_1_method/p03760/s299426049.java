import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String o = sc.nextLine();
			String e = sc.nextLine();

			StringBuilder sb = new StringBuilder(o);
			for (int i = 0; i < e.length(); i++) {
				sb.insert(2 * i + 1, e.charAt(i));
			}

			System.out.println(sb.toString());

		} finally {
			sc.close();
		}
	}
}