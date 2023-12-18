import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			String s = sc.next();
			int k = s.length();
			int win = 0;

			for (int i = 0; i < k; i++) {
				if (s.substring(i, i + 1).equals("o")) {
					win++;
				}
			}

			if ((15 - k + win >= 8)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

	}

}