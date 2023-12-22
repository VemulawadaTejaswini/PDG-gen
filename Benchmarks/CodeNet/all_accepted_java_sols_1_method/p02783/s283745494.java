import java.util.Scanner;

public class Main {
	//C問題

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		int h;
		int ans;

		h = scanner.nextInt();
		a = scanner.nextInt();
		ans = 0;

		while (true) {
			ans++;

			h = h - a;

			if (h <= 0) {
				break;
			}
		}

		System.out.println(ans);

	}

}