import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static final int MAX = 1000;
	static final int VMAX = 100000;

	static int n, s;
	static int []A = new int[MAX];
	static int []B = new int[MAX];
	static int []T = new int[VMAX + 1];
	static int solve() {
		int ans = 0;
		boolean []V = new boolean[MAX];
		for(int i = 0; i < n; i++) {
			B[i] = A[i];
			V[i] = false;
		}
		Arrays.sort(B, 0, n);
		for(int i = 0; i < n; i++) {
			T[B[i]] = i;
		}
		for(int i = 0; i < n; i++) {
			if(V[i]) continue;
			int cur = i;
			int S = 0;
			int  m = VMAX;
			int an = 0;
			while(true) {
				V[cur] = true;
				an ++;
				int v = A[cur];
				m = Math.min(m, v);
				S += v;
				cur = T[v];
				if(V[cur]) {
					break;
				}

			}
			ans += Math.min(S + (an - 2) * m, m + S + (an + 1) * s);
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		s = VMAX;
		for(int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
			s = Math.min(s, A[i]);
		}
		scan.close();
		int ans = solve();
		System.out.println(ans);
	}
}
