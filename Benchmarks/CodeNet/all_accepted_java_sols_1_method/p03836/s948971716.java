import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();

		int w1 = tx - sx;
		int h1 = ty - sy;
		int w2 = w1 + 1;
		int h2 = h1 + 1;

		char u = 'U';
		char d = 'D';
		char l = 'L';
		char r = 'R';

		char[] c = {u, r, d, l, l, u, r, d, r, d, l, u};
		int[] dis = {h1, w1, h1, w1, 1, h2, w2, 1, 1, h2, w2, 1};

		int sumDis = w1 * 2 + h1 * 2 + w2 * 2 + h2 * 2 + 4;

		StringBuilder ans = new StringBuilder(sumDis);

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < dis[i]; j++) {
				ans.append(c[i]);
			}
		}

		System.out.println(ans.toString());
		sc.close();
	}

}
