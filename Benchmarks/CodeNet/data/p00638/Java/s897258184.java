import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		outer:
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			if (n == 0) {
				break;
			}

			int[][] bridge = new int[n][2];
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				int p, q;
				p = Integer.parseInt(line.substring(0, line.indexOf(' ')));
				q = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
				bridge[i][0] = p;
				bridge[i][1] = q;
			}

			Arrays.sort(bridge, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if (o1[0] != o2[0]) {
						return o1[0] - o2[0];
					} else {
						return o1[1] - o2[1];
					}
				}
			});

			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += bridge[i][0];
				if (sum > bridge[i][1]) {
					System.out.println("No");
					continue outer;
				}
			}
			System.out.println("Yes");
		}
	}
}