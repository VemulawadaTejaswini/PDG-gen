import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int N;
	static int S;
	static int[] A;

	public static void main(String[] args) throws NumberFormatException, IOException {
		read();
	}

	private static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] word = br.readLine().split(" ");
		N = Integer.parseInt(word[0]);
		S = Integer.parseInt(word[1]);
		word = br.readLine().split(" ");
		A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.valueOf(word[i]);
		}
		int[][] f = new int[N][S + 1];

		for (int i = 0; i < N; i++) {
			f[i][0] = 1<<(i+1);
			f[i][0] = f[i][0] -1;
		}
		if (A[0] <= S)
			f[0][A[0]] = 1;

		for (int i = 1; i < N; i++) {
			for (int j = 1; j <= S; j++) {
				if (i > 0) {
					f[i][j] = f[i - 1][j];
				}
				if (j >= A[i]) {
					f[i][j] += f[i - 1][j - A[i]];
				}
			}
		}

		System.out.println(f[N - 1][S]);

		br.close();
	}

}
