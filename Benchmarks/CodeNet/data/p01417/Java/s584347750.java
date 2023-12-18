import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static double dps(int deep, final int M, int prev, final int N, LinkedList<Integer> list, double[][] dist) {
		if (deep == M) {
			double ret = 0;
			
			if(M == 1){
				return 0.0;
			}

			for (int from : list) {
				for (int to : list) {
					if (from > to) {
						continue;
					}

					ret += dist[from][to];
				}
			}
			
			return ret;

		} else {
			double max = -Double.MAX_VALUE;
			for (int i = prev + 1; i < N - (M - deep - 1); i++) {
				list.addLast(i);
				max = Math.max(max, dps(deep + 1, M, i, N, list, dist));
				list.removeLast();
			}

			return max;
		}
	}

	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);

		final int N = sc.nextInt();
		final int M = sc.nextInt();

		double[][] data = new double[N][3];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				data[i][j] = sc.nextDouble();
			}
		}

		double[][] dist = new double[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				double sum = 0;

				for (int k = 0; k < 3; k++) {
					sum += (data[i][k] - data[j][k])
							* (data[i][k] - data[j][k]);
				}

				dist[i][j] = dist[j][i] = sum;
			}
		}

		System.out.println(dps(0, M, -1, N, new LinkedList<Integer>(), dist));

	}

}