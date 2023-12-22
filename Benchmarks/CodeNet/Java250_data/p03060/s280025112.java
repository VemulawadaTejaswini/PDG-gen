import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(solve());
	}
	
	public static int solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] V = new int[N];
		int[] C = new int[N];
		for (int i = 0; i < N; i++) {
			V[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}

		int X = 0, Y = 0;
		for (int i = 0; i < N; i++) {
			if (V[i] >= C[i]) {
				X += V[i];
				Y += C[i];
			}
		}
		return X - Y;
	}
}