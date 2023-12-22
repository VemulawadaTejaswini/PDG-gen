import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*String a = s.next();
		String b = s.next();
		*/
		int N = s.nextInt();
		int[][] arr = new int[2][N];
		int count = 0;
		int upSum = 0;
		int downSum = 0;
		int[] upArr = new int[N];
		int[] downArr = new int[N];
		int tmpcount = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			upSum += arr[0][i];
			downSum += arr[1][i];
		}
		count = Math.max(downSum, upSum);

		for (int i = 0; i < N; i++) {
			if (i == 0) {
				upArr[0] = arr[0][0];
			} else {
				upArr[i] = arr[0][i] + upArr[i - 1];
			}
		}
		for (int j = 0; j < N; j++) {
			if (j == 0) {
				downArr[0] = downSum;
			} else {
				downArr[j] = downArr[j - 1] - arr[1][j - 1];
			}
		}
		for (int k = 0; k < N; k++) {
			tmpcount = upArr[k] + downArr[k];
			count = Math.max(count, tmpcount);
		}
		System.out.println(count);
	}
}