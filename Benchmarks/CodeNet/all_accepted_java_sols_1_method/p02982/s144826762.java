import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int[][] input = new int[N][D];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < D; j++) {
				input[i][j] = sc.nextInt();
			}
		}
		Integer[] square = new Integer[130];
		for (int i = 1; i <= 130; i++) {
			square[i - 1] = i * i;
		}
		int res = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int sum = 0;
				for (int k = 0; k < D; k++) {
					sum += Math.pow(input[i][k] - input[j][k], 2);
				}
				if (Arrays.asList(square).contains(Integer.valueOf(sum))) {
					res += 1;
				}
			}
		}
		System.out.print(res);
	}
}
