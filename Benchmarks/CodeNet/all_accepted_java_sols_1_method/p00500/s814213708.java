import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[][];
		int score[];

		n = sc.nextInt();
		a = new int[n][3];
		score = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < n; j++) {
				boolean f = true;
				for (int k = 0; k < n; k++) {
					if (j != k && a[j][i] == a[k][i]) {
						f = false;
					}
				}
				if (f) {
					score[j] += a[j][i];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(score[i]);
		}
	}
}