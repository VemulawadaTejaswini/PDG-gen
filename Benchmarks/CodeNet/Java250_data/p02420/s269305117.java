import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int n = sc.nextInt();
		int h = sc.nextInt();
		String str2 = null;

		while (true) {

			for (int i = 0; i < n; i++) {
				str2 = str.substring(0, h);
				str = str.substring(h, str.length());
				str = str + str2;
				if (i != n - 1) {
					h = sc.nextInt();
				}
			}

			System.out.println(str);

			str = sc.nextLine();
			str = sc.nextLine();

			if (str.equals("-")) {
				break;
			}
			n = sc.nextInt();
			h = sc.nextInt();

		}

	}
}