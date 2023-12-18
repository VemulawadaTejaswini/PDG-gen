import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] x = new int[n][d];
		int count = 0;

		int seisuu = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < d; j++) {
				x[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n -1; i++) {
			for (int j = i + 1; j < n; j++) {
				double dist = 0.0;
				for (int k = 0; k < d; k++) {
					double diff = (x[i][k] - x[j][k]);
					dist += Math.pow(diff, 2);
//					System.out.println(dist);
				}
				dist = Math.sqrt(dist);
//				System.out.println(dist);
				seisuu = (int)dist;
				if ((double)seisuu == dist) {
					count++;

				}
			}
		}

		System.out.println(count);

	}
}
