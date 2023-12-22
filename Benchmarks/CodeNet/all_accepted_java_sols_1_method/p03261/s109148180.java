import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] w = new String[n];
		String msg = "Yes";

		for (int i = 0; i < n; i++) {
			w[i] = sc.next();
		}

		for (int i = 1; i < n; i++) {
			if (!(w[i-1].substring(w[i-1].length() - 1, w[i-1].length()).equals(w[i].substring(0, 1)))) {
				msg = "No";
				break;
			}

			for (int j = 0; j < i; j++) {
				if (w[j].equals(w[i])) {
					msg = "No";
					break;
				}
			}
		}

		System.out.println(msg);

	}
}