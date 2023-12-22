import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int[][] x = new int[N][D];
		for (int n = 0; n < N; n++) {
			for (int d = 0; d < D; d++) {
				x[n][d] = sc.nextInt();
			}
		}
		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
		      	double sum = 0;
				for (int d = 0; d < D; d++) {
					int dx = x[i][d] - x[j][d];
					sum += dx * dx;
				}
				double dist = Math.sqrt(sum);
				if (dist == Math.floor(dist)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}