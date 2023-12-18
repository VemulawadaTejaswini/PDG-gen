import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = Integer.parseInt(sc.next());
	static int M = Integer.parseInt(sc.next());
	static int[] X = new int[M];
	static {
		Arrays.setAll(X, i -> Integer.parseInt(sc.next()));
	}
	public static void main(String[] args) {
		if (N>=M) {
			System.out.println("0");
			return;
		}
		int ans = 0;
		Arrays.sort(X);
		int[] deltaX = new int[M-1];
		for (int i = 0; i < M-1; i++) {
			deltaX[i] = X[i+1] - X[i];
		}
		Arrays.sort(deltaX);
		for (int i = 0; i < M-1 - (N-1); i++) {
			ans += deltaX[i];
		}
		System.out.println(ans);
	}
}