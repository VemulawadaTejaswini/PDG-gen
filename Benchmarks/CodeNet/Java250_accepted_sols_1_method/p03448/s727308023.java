import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		int x = Integer.parseInt(sc.nextLine());

		int ans = 0;
		int tmp = 0;
		int tmp2 = 0;
		for (int i = 0; i <= a; i++) {
			if (500 * i <= x) {
				tmp = x - 500 * i;
			} else {
				break;
			}

			for (int j = 0; j <= b; j++) {
				if (100 * j <= tmp) {
					tmp2 = tmp - 100 * j;
				} else {
					break;
				}

				if (tmp2 / 50 <= c) {
					ans++;
				}

			}

			if (500 * i >= x) {
				break;
			}
		}

		System.out.println(ans);

		sc.close();
	}
}