import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int W = sc.nextInt();
		int H = sc.nextInt();
		int T = sc.nextInt();
		int P = sc.nextInt();
		int[] X = new int[P];
		int[] Y = new int[P];
		for (int i = 0; i < P; ++i) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
			sc.next();
		}
		int[][] S = new int[H][W];
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				S[i][j] = sc.nextInt();
			}
		}
		int ans = 0;
		for (int i = 0; i < P; ++i) {
			ans += S[Y[i]][X[i]];
		}
		System.out.println(ans);
	}

}