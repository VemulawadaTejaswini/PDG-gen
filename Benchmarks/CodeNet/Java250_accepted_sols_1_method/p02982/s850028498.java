import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		final int N = scan.nextInt();
		final int D = scan.nextInt();
		int[][] point = new int[N][D];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < D; j++) {
				point[i][j] = scan.nextInt();
			}
		}
		scan.close();

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= 130; i++) {
			list.add(i * i);
		}

		int count = 0;

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int distance = 0;
				for (int d = 0; d < D; d++) {
					distance += (point[i][d] - point[j][d]) * (point[i][d] - point[j][d]);
				}
				if (list.contains(distance)) {
					count++;
				}
			}
		}
		
		System.out.println(count);

	}

}