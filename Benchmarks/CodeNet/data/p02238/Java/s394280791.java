import java.util.*;
import java.io.*;

class Main {

	static int n;
	static int[] d;
	static int[] f;
	static int[][] adj;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		adj = new int[n][n];

		for (int i=0; i<n; i++) {
			String line = br.readLine();
			String[] str = line.split(" ");
			for (int j=2; j<str.length; j++) {
				adj[Integer.parseInt(str[0])-1][Integer.parseInt(str[j])-1] = 1;
			}
		}

		d = new int[n];
		f = new int[n];

		int t = 1;
		for (int i=0; i<n-1; i++) {
			t = dfs(i,t);
		}

		for (int i=0; i<n; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append((i+1)).append(" ").append(d[i]).append(" ").append(f[i]);
			System.out.println(sb);
		}

		br.close();
	}

	static int dfs(int now,int t) {
		if (d[now] != 0)
			return t;
		d[now] = t++;
		for (int i=0; i<n; i++) {
			if (adj[now][i] == 1 && i != now) {
				t = dfs(i,t);
			}
		}
		f[now] = t++;
		return t;
	}
}