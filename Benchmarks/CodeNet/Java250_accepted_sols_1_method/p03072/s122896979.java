import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int top = 0;

		int ans = 0;
		for (int i = 0; i < n; i++) {
			int h = sc.nextInt();
			if (h >= top) {
				ans++;
				top = h;
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
