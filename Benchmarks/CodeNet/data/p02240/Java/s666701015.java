import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String[] n_m = br.readLine().split(" ");

		int n = Integer.parseInt(n_m[0]); // id = 0, 1, 2,  ... , n-1
		int[][] adjmatrix = new int[n][n+1]; // adjmatrix[id][n] = id
		for (int id=0; id < n; id++) {
			adjmatrix[id][n] = id;
		}

		int m = Integer.parseInt(n_m[1]);
		for (int i=0; i < m; i++) { // while (m-- > 0)
			String[] s_t = br.readLine().split(" ");
			int s = Integer.parseInt(s_t[0]);
			int t = Integer.parseInt(s_t[1]);

			adjmatrix[s][t] = adjmatrix[t][s] = 1;
		}

		StringBuilder ans = new StringBuilder();

		int q = Integer.parseInt(br.readLine());
		for (int i=0; i < q; i++) { // while (q-- > 0)
			String[] s_t = br.readLine().split(" ");
			int s = Integer.parseInt(s_t[0]);
			int t = Integer.parseInt(s_t[1]);

			if (isreachable(adjmatrix, s, t)) ans.append("yes\n");
			else ans.append("no\n");
		}

		System.out.print(ans);
	}

	public static boolean isreachable(int[][] adjmatrix, int s, int t) {
		boolean[] issearched = new boolean[adjmatrix.length];

		return search(adjmatrix, s, t, issearched);
	}

	static boolean search(int[][] adjmatrix, int s, int t, boolean[] issearched) {
		if (issearched[s]) return false;
//		if (s==t) return true;
		issearched[s] = true;

		for (int i=0; i < adjmatrix.length; i++) {
			if (adjmatrix[s][i] == 1) {
				if(i == t) return true;
				else if ( search(adjmatrix, i, t, issearched) ) {
					return true;
				}
			}
		}

		return false;
	}
}