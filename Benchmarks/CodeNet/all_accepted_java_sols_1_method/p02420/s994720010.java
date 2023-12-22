import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int j = 0; j < 10; j++) {
			String line = sc.next();
			if (line.charAt(0) == '-') {
				System.exit(0);
			} else if (line.length() > 200) {
				System.exit(0);
			}

			int m = sc.nextInt();
			if (m > 100 || m < 1) {
				System.exit(0);
			}

			for (int i = 0; i < m; i++) {
				int hi = sc.nextInt();
				if (hi > line.length() || hi < 1) {
					System.exit(0);
				}

				String line1 = line.substring(0, hi);
				String line2 = line.substring(hi);

				line = line2 + line1;

			}

			System.out.println(line);

		}
	}

}

