import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int n, growth;

		while (!(line = br.readLine()).equals("0")) {
			n = Integer.parseInt(line);
			line = br.readLine();
			growth = getGrowthRate(line);
			System.out.println(find(n, growth, line));
		}
	}

	// 成長率
	static int getGrowthRate(String progression) {
		int h1, h2, result = 0;
		int[] g = new int[4];
		StringTokenizer st = new StringTokenizer(progression);

		h1 = Integer.parseInt(st.nextToken());
		for (int i = 0; i < 4; i++) {
			h2 = Integer.parseInt(st.nextToken());
			g[i] = h2 - h1;
			h1 = h2;
		}
		Arrays.sort(g);
		for (int i = 0; i < 3; i++) {
			if (g[i] == g[i + 1])
				result = g[i];
		}
		return result;
	}

	// 雑草探し
	static int find(int n, int growth, String progression) {
		int h0, h1, h2, result = 0;
		StringTokenizer st = new StringTokenizer(progression);

		h1 = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			h2 = Integer.parseInt(st.nextToken());
			if (h1 + growth != h2) {
				if (i == n - 1) {
					result = h2;
					break;
				}
				h0 = h1;
				h1 = h2;
				h2 = Integer.parseInt(st.nextToken());
				if (h1 + growth != h2) {
					result = h1;
					break;
				} else {
					result = h0;
					break;
				}
			} else {
				h1 = h2;
			}
		}
		return result;
	}

}