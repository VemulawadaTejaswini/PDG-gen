import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {

	void tr(Object... os) {
		System.err.println(deepToString(os));
	}
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj2107/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/aoj2107/result.txt")));
			if (false) throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			solve();
		}
	}


	int[][] identity(int n) {
		int[][] A = new int[n][n];
		for (int i = 0; i < n; i++) A[i][i] = 1;
		return A;
	}

	int[][] mul(int[][] A, int[][] B) {
		int I = A.length, J = B[0].length, K = B.length;
		int[][] C = new int[I][K];
		for (int i = 0; i < I; i++)
			for (int j = 0; j < J; j++)
				for(int k = 0; k < K; k++){
					C[i][j] |= A[i][k] & B[k][j];
					if (C[i][j] > 0) break;
					// C[i][j] += A[i][k] * B[k][j];
					// if (C[i][j] >= MOD) C[i][j] %= MOD;
				}
		return C;
	}
	int[][] pow(int[][] A, long b) {
		int[][] C = identity(A.length);
		while (b > 0) {
			if ((b & 1) == 1) C = mul(C, A);
			A = mul(A, A);
			b >>= 1;
		}
		return C;
	}

	void solve()
	{
		int n = sc.nextInt();
		int m = sc.nextInt();
		int z = sc.nextInt();
		if (0 == (n | m | z)) return;

		int[][] edge = new int[m][2];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			edge[i][0] = a;
			edge[i][1] = b;

		}

		// 直前に使ったエッジが e で、0 の側の頂点に居る <=> i=2*e+0
		// A[i][j] := i から j へ一歩で到達可能なら 1
		// A^x[i][j] := i から j へ x 歩で到達可能なら 1
		int[][] A = new int[2*m][2*m];
		int[][] B = new int[2*m][2*m];

		for (int e = 0; e < m; e++) {
			B[2 * e + 0][2 * e + 1] = 1;
			B[2 * e + 1][2 * e + 0] = 1;
		}

		for (int i = 0; i < 2 * m; i++) {
			int cur = edge[i/2][i%2];
			int prev = edge[i/2][1-i%2];
			for (int e = 0; e < m; e++) {
				if (cur == edge[e][0] && prev != edge[e][1]) {
					A[i][e*2 + 1] = 1;
				}
				if (cur == edge[e][1] && prev != edge[e][0]) {
					A[i][e*2 + 0] = 1;
				}
			}
		}

		int [][] Az = pow(A, z - 1);
		Az = mul(B, Az);

		boolean can = false;
		for (int i = 0; i < 2 * m; i++)
			for (int j = 0; j < 2 * m; j++) {
				if (Az[i][j] > 0) {
					int a = edge[i/2][i%2];
					int b = edge[j/2][j%2];
					if (a == 0 && b == n - 1) {
						can = true;
					}
				}
			}
		System.out.println(can ? "yes":"no");
	}

}