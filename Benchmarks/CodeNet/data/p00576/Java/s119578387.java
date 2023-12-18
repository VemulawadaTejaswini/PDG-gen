import java.util.Scanner;

public class Main {
	static final int MAX = 2019;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();   // 駒の数
		int[] X = new int[N];   // 駒の位置（スタートに近い順から）
		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}
		int M = sc.nextInt();   // 行う操作の回数
		for(int i = 0; i < M; i++) {
			int A = sc.nextInt();
			advancePiece(X, A);
		}

		// 結果出力
		for(int i = 0; i < N; i++) {
			System.out.println(X[i]);
		}

		sc.close();
	}

	static void advancePiece(int[] x, int a) {
		int work = x[a-1] + 1;
		if(work == MAX+1) {
			return;
		}
		for(int i = 0; i < x.length; i++) {
			if(work == x[i]) {
				return;
			}
		}
		x[a-1] = work;
	}
}
