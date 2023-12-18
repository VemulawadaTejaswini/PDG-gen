import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = sc.nextInt();
		int x[][] = new int[n][d];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < d; j++) {
				x[i][j] = sc.nextInt();
			}
		}

		int count = 0;
		for (int i = 0; i < n - 1; i++) {

			for (int j = i + 1; j < n; j++) {
				int dist = 0;
				for (int k = 0; k < d; k++) {
					dist += ((x[i][k] - x[j][k]) * (x[i][k] - x[j][k]));
				}
				int sqrt = (int)Math.sqrt(dist);
//				System.out.println("i:" + i + ", j:" + j);
//				System.out.println("s:" + sqrt + ", d:" + dist + ", s*s:" + (sqrt * sqrt));
				if (sqrt * sqrt == dist) {
					count++;
				}
			}
		}

		System.out.println(count);
		sc.close();
	}
}