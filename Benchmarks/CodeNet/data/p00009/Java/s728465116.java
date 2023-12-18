import java.util.Scanner;

public class Main {
	static Scanner sc = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		while (sc.hasNext()) {
			int n = sc.nextInt();

			if (n == 1) {
				System.out.println(0);
			} else if (n == 2) {
				System.out.println(1);
			} else if (n == 3 || n == 4) {
				System.out.println(2);
			} else if (n == 5 || n == 6) {
				System.out.println(3);
			} else if (n == 7 || n == 8) {
				System.out.println(4);
			} else {
				int count = 4;

				for (int i = 9; i <= n; i = i + 2) {
					boolean type = true;
					for (int j = 3; j <= Math.sqrt(i); j++) {
						if (i % j == 0) {
							type = false;
							break;
						}
					}
					if (type) {
						count++;
					}
				}
				System.out.println(count);
			}

		}

	}

}