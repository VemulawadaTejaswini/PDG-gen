import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] mat = new int[n][n];
		int cost = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = in.nextInt();
			}
		}
		Set<Integer> mst = new HashSet<>();
		Set<Integer> target = new HashSet<>();
		mst.add(0);
		for (int i = 1; i < n; i++) {
			target.add(i);
		}

		while (!target.isEmpty()) {
			int min = Integer.MAX_VALUE;
			int nextVisitTo = -1;
			int nextVisitFrom = -1;
			for (int from : mst) {
				for (int to : target) {
					if (mat[from][to] != -1 && mat[from][to] <= min) {
						nextVisitFrom = from;
						nextVisitTo = to;
						min = mat[from][to];
					}
				}
			}
			target.remove(nextVisitTo);
			mst.add(nextVisitTo);
			cost += mat[nextVisitFrom][nextVisitTo];
		}
		System.out.println(cost);

	}

}

