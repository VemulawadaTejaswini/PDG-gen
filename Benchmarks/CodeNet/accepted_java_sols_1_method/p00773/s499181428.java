import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int max = 0;

			if (a == 0 && b == 0 && c == 0)
				return;

			for (int i = 1; i < c; i++) {
				for (int j = 1; j < c; j++) {
					if (i * (100 + a) / 100 + j * (100 + a) / 100 == c)
						max = Math.max(max, i * (100 + b) / 100 + j * (100 + b) / 100);
				}
			}

			System.out.println(max);
		}

	}
}
