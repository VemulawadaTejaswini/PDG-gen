import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X[][] = new int[N][D];
		double dst = 0;
		int answer = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < D; j++) {
				X[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				dst = 0;
				for (int k = 0; k < D; k++) {
					dst += Math.pow(X[j][k] - X[i][k], 2);
				}
				if (dst == Math.pow((int)Math.sqrt(dst), 2)) answer++;
			}
		}

		System.out.println(answer);
	}
}
