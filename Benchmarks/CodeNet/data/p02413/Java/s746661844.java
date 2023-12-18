import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] sheets = new int[r + 1][c + 1];

		int sum = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				int n = sc.nextInt();
				sheets[i][j] = n;
				sheets[r][j] += n;
				sheets[i][c] += n;
				sum += n;
			}
		}

		sheets[r][c] = sum;
		for (int i = 0; i <= r; i++) {
			for (int j = 0; j <= c; j++) {
				System.out.printf(j < c ? "%d " : "%d%n", sheets[i][j]);
			}
		}
	}

