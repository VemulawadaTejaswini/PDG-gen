
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[][] = new int[2][N];
		int point = 0;
		for (int i = 0; i < N; i++) {
			A[0][i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			A[1][i] = sc.nextInt();
		}
		int score = 0;
		for (int i = 0; i < N; i++) {
			int temp = 0;
			for (int j = 0; j < N; j++) {
				if (i > j) {
					temp += A[0][j];
				} else if (i == j) {
					temp += A[0][j];
					temp += A[1][j];
				} else {
					temp += A[1][j];
				}
			}
			if (temp > score) {
				score = temp;
			}
		}
		System.out.println(score);
	}
}
