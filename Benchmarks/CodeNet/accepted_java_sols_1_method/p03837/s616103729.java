import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		int edge[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				edge[i][j] = (i == j) ? 0 : Integer.MAX_VALUE;
			}
		}

		int a[] = new int[m];
		int b[] = new int[m];
		int c[] = new int[m];

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");

			a[i] = Integer.parseInt(str[0]) - 1;
			b[i] = Integer.parseInt(str[1]) - 1;
			c[i] = Integer.parseInt(str[2]);

			edge[a[i]][b[i]] = c[i];
			edge[b[i]][a[i]] = c[i];
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				if (edge[i][k] == Integer.MAX_VALUE) {
					continue;
				}
				for (int j = 0; j < n; j++) {
					if (edge[k][j] == Integer.MAX_VALUE) {
						continue;
					}
					edge[i][j] = Math.min(edge[i][j], edge[i][k] + edge[k][j]);
				}
			}
		}

		int ans = 0;
		for (int i = 0; i < m; ++i) {
			if (c[i] > edge[a[i]][b[i]])
				ans++;
		}

		System.out.println(ans);
	}
}
