import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int d = sc.nextInt();
		if (d < 22 || m < 4) {
			System.out.println(0);
			return;
		}

		int count = 0;
		for (int i = 4; i <= m; i++) {
			for (int j = 22; j <= d; j++) {
				if (j % 10 < 2) continue;
				if ((j % 10) * (j / 10) == i) {
					count++;
				}
			}
		}

		System.out.println(count);
	}
}
