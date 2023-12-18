import java.util.Scanner;

public class Main {

	public static void main(String... args) {

		try (Scanner sc = new Scanner(System.in)) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = 0;

			for (int i = a; i <= b; i++) {

				String s = String.valueOf(i);
				int l = s.length();

				boolean eq = true;
				for (int j = 0; j < l >> 1; j++) {

					eq &= s.charAt(j) == s.charAt(l - j - 1);
					if (!eq) {
						break;
					}

				}

				if (eq) {
					c++;
				}

			}

			System.out.println(c);

		}

	}

}
