import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = Integer.parseInt(s.next());
		int M = Integer.parseInt(s.next());
		int C = Integer.parseInt(s.next());

		int[][] pro = new int[N + 1][M];
		for (int n = 0; n <= N; n++) {
			for (int m = 0; m < M; m++) {
				pro[n][m] = Integer.parseInt(s.next());
			}
		}

		int counts = 0;
		for (int n = 1; n <= N; n++) {
			int cra = 0;
			for (int m = 0; m < M; m++) {
				cra += pro[n][m] * pro[0][m];
			}
			if (cra + C > 0) {
				counts++;
			}
		}
		System.out.println(counts);
	}
}