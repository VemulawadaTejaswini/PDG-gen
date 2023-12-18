import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			Scanner sc = new Scanner(line);
			int m, n, k;
			m = sc.nextInt();
			n = sc.nextInt();
			k = Integer.parseInt(br.readLine());

			int[][] map = new int[m + 1][n + 1];
			for (int i = 1; i < m + 1; i++) {
				line = br.readLine();
				for (int j = 1; j < n + 1; j++) {
					switch (line.charAt(j - 1)) {
						case 'J':
							map[i][j] = 0;
							break;
						case 'O':
							map[i][j] = 1;
							break;
						case 'I':
							map[i][j] = 2;
							break;
					}
				}
			}
			for (int i = 0; i < k; i++) {
				sc = new Scanner(br.readLine());
				int a, b, c, d;
				int[] count;
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				d = sc.nextInt();
				count = new int[3];
				for (int j = a; j <= c; j++) {
					for (int l = b; l <= d; l++) {
						count[map[j][l]]++;
					}
				}
				System.out.println(count[0] + " " + count[1] + " " + count[2]);
			}
		}
	}

}

class Scanner {
	private StringTokenizer st;

	Scanner(String line) {
		st = new StringTokenizer(line);
	}

	int nextInt() {
		return Integer.parseInt(st.nextToken());
	}
}