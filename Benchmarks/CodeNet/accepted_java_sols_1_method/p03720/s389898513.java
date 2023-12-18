import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		int edge[][] = new int[n][n];

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;

			edge[a][b] += 1;
			edge[b][a] += 1;
		}

		for (int i = 0; i < n; i++) {
			int count = 0;

			for (int j = 0; j < n; j++) {
				if (edge[i][j] != 0)
					count += edge[i][j];
			}
			System.out.println(count);
		}
	}
}
