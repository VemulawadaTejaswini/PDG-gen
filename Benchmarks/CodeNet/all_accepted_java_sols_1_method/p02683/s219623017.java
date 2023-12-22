import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,M,X;
		long min = Long.MAX_VALUE;
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		N = line[0];
		M = line[1];
		X = line[2];

		int[][] books = new int[N][M + 1];
		int[] skillSum = new int[M];
		long costLet = 0;
		for (int i = 0; i < books.length; i++) {
			books[i] = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		}

		for (int i = 0; i < (1 << N) ; i++) {
			for (int j = 0; j < N; j++) {
				if (((i >>j) & 1) == 1 ) {
					costLet += books[j][0];
					for (int k = 1; k <= M; k++) {
						skillSum[k - 1] += books[j][k];
					}
				}
			}
			for (int j = 0; j < M; j++) {
				if (skillSum[j] < X) {
					break;
				}
				if (j == M - 1 && costLet < min) {
					min =costLet;
				}
			}
			Arrays.fill(skillSum, 0);
			costLet = 0;
		}

		if (min == Long.MAX_VALUE) {
			System.out.println(-1);
		}else {
			System.out.println(min);
		}

	}
}