import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Unique number
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = Integer.parseInt(line);
			short[][] occured = new short[3][101];
			short[][] choice = new short[n][3];

			short c1, c2, c3;
			StringTokenizer st;
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				c1 = Short.parseShort(st.nextToken());
				c2 = Short.parseShort(st.nextToken());
				c3 = Short.parseShort(st.nextToken());
				occured[0][c1]++;
				occured[1][c2]++;
				occured[2][c3]++;
				choice[i][0] = c1;
				choice[i][1] = c2;
				choice[i][2] = c3;
			}

			short points;
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				points = 0;
				for (int j = 0; j < 3; j++) {
					if (occured[j][choice[i][j]] < 2) {
						points += choice[i][j];
					}
				}
				sb.append(points + "\n");
			}
			
			System.out.print(sb.toString());
		}

	}
}