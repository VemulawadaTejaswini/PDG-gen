import java.util.Scanner;

public class Main {
	public void main(Scanner sc) {
		int n = sc.nextInt();
		long ans = 1;

		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();

			if (ans != -1) {
				if (((int) Math.ceil(Math.log10(ans))) + ((int) Math.ceil(Math.log10(a))) > 18) {
					ans = -1;
				}
				ans *= a;
			} else {
				if (a == 0) {
					ans = 0;
				}
			}
		}

		System.out.println(ans);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new Main().main(sc);
	}
}
