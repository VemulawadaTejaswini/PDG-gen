import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		long C[] = new long[27];
		for (int i = 1; i <= 26; i++) {
			C[i] = sc.nextLong();
		}
		long S[][] = new long[D+1][27];
		for (int i = 1; i <= D; i++) {
			for (int j = 1; j <= 26; j++) {
				S[i][j] = sc.nextLong();
			}
		}
		int T[] = new int[D+1];
		for (int i = 1; i <= D; i++) {
			T[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		int[][] q = new int[M+1][2];
		for (int i = 1; i <= M; i++) {
			q[i][0] = sc.nextInt();
			q[i][1] = sc.nextInt();
		}

		long[] p = new long[D+1];
		int[][] d = new int[D+1][27];
		for (int i = 1; i <= D; i++) {
			p[i] = p[i-1];
			p[i] += S[i][T[i]];
			for (int j = 1; j <= 26; j++) {
				if (j == T[i]) {
					d[i][j] = 0;
				} else {
					d[i][j] = d[i - 1][j] + 1;
					p[i] -= C[j] * d[i][j];
				}
			}
		}

		for (int m = 1; m <= M; m++) {
			T[q[m][0]] = q[m][1];
			for (int i = q[m][0]; i <= D; i++) {
				p[i] = p[i-1];
				p[i] += S[i][T[i]];
				for (int j = 1; j <= 26; j++) {
					if (j == T[i]) {
						d[i][j] = 0;
					} else {
						d[i][j] = d[i - 1][j] + 1;
						p[i] -= C[j] * d[i][j];
					}
				}
			}
			System.out.println(p[D]);
		}
	}
}
