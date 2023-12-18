import java.util.Scanner;

public class Main{
	static final int N = 8;
	static int[] row = new int[N];
	static int[] col = new int[N];
	static int[] dpos = new int[2 * N - 1];
	static int[] dneg = new int[2 * N - 1];
	static boolean[][] X = new boolean[N][N];
	static final int FREE = -1;
	static final int NOT_FREE = 1;
	public static void main(String[] args) {
		initialize();
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] r = new int[k];
		int[] c = new int[k];
		for(int i = 0; i < k; i++) {
			r[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		sc.close();

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				X[i][j] = false;
			}
		}
		for(int i = 0; i < k; i++) {
			X[r[i]][c[i]] = true;
		}
		rec(0);
	}
	static void initialize() {
		for(int i = 0; i < N; i++) {
			row[i] = FREE;
			col[i] = FREE;
		}
		for(int i = 0; i < 2 * N - 1; i++) {
			dpos[i] = FREE;
			dneg[i] = FREE;
		}
	}
	static void printBoard() {
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(X[i][j]) {
					if(row[i] != j) return;
				}
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(row[i] == j) {
					System.out.print("Q");
				}else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
	static void rec(int i) {
		if(i == N) {
			printBoard();
			return;
		}
		for(int j = 0; j < N; j++) {
			if(col[j] == NOT_FREE || dpos[i + j] == NOT_FREE || dneg[i - j + N - 1] == NOT_FREE) {
				continue;
			}
			row[i] = j;
			col[j]=dpos[i+j]=dneg[i-j+N-1]=NOT_FREE;
			rec(i + 1);
			row[i]=col[j]=dpos[i+j]=dneg[i-j+N-1]=FREE;
		}
	}
}
