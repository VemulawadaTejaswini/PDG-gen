import java.util.Scanner;

public class Main {
	static int r = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int[][] X = new int[N][D];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < D; j++) {
				X[i][j] = sc.nextInt();
			}	
		}
		sc.close();
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				solve(D, X, i, j);
			}
		}
		System.out.println(r);
	}
	
	static void solve(int D, int[][] X, int idx1, int idx2) {
		int sum = 0;
		for(int i = 0; i < D; i++) {
			int yx = Math.abs(X[idx1][i] - X[idx2][i]);
			sum += yx * yx;
		}
		boolean f = false;
		for(int i = 0; i <= sum; ++i) {
			if(i * i == sum) f = true;
		}
		if(f) r++;
		// double sqrt1 = Math.sqrt(sum);
		// int sqrt2 = (int)sqrt1;
		// if(sqrt1 == (double)sqrt2) r++;
		// System.out.println("# " + (sqrt1 == (double)sqrt2) + " = " + sum + " : " + sqrt1 + " " + sqrt2);
	}
}	
