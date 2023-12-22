import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int cnt = 0;

		for (int i = 0; i < C + 1; i++) {

			int Y = X - 50 * i;

			if(Y == 0) {
				cnt ++;
				continue;
			}

			for (int j = 0; j < B + 1; j++) {

				int Z = Y - 100 * j;

				if(Z == 0) {
					cnt++;
					continue;
				}

				for (int k = 0; k < A + 1; k++) {

					int W = Z - 500 * k;

					if(W == 0) {
						cnt ++;
						continue;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
