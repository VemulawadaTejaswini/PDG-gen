import java.util.*;
public class Main {

	public static void main(String[] args) {
		long INF = Long.MAX_VALUE/2;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] P = new int[N];
		Arrays.setAll(P, i -> sc.nextInt()-1);
		long[] C = new long[N];
		Arrays.setAll(C, i -> sc.nextLong());
		long[][] x = new long[N][N*2];
		int[] l_n = new int[N];
		long[] l_v = new long[N];
		for(int i = 0; i < N; i++) {
			Arrays.fill(x[i], -INF);
			x[i][0] = 0;
			int t = P[i];
			int[] used = new int[N];
			Arrays.fill(used, -1);
			used[i] = 0;
			for(int j = 1; j < N*2; j++) {
				x[i][j] = x[i][j-1] + C[t];
				if(used[t] >= 0) {
					l_n[i] = j - used[t];
					l_v[i] = x[i][j] - x[i][used[t]];
					break;
				}
				used[t] = j;
				t = P[t];
			}
		}
		long ans = -INF;
		for(int i = 0; i < N; i++) {
			long temp = -INF;
			for(int j = 1; j < N*2 && j <= K; j++)
				temp = Math.max(temp, x[i][j]);
			if(l_v[i] > 0 && K >= l_n[i]) {
				long temp2 = 0;
				temp2 += K / l_n[i] * l_v[i];
				for(int j = 1; j <= K % l_n[i]; j++)
					temp = Math.max(temp, temp2 + x[i][j]);
			}
			ans = Math.max(ans, temp);
		}
		System.out.println(ans);
	}

}
