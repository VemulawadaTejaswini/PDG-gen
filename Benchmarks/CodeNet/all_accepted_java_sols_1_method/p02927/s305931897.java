import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int D = sc.nextInt();

		if (D < 20) {
			System.out.println(0);
			return;
		}

		int cnt = 0;

		for (int i = 1; i <= M; i++) {
			for (int j = 20; j <= D; j++) {
				int d10 = j/10;
				int d2 = j%10;
				if (d2 < 2) {
					continue;
				}
				if (i == d10*d2) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}

