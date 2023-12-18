import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Integer.parseInt;
import static java.lang.Byte.parseByte;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			if (n == 0) break;

			int[][] table = new int[n * 2][2];
			for (int i = 0; i < table.length; i++) {
				line = br.readLine();
				String[] start = line.substring(0, line.indexOf(' ')).split(":");
				String[] arrive = line.substring(line.indexOf(' ') + 1).split(":");
				table[i][0] = parseInt(start[0]) * 3600 + parseInt(start[1]) * 60 + parseInt(start[2]);
				table[i][1] = 1;
				table[i++][0] = parseInt(arrive[0]) * 3600 + parseInt(arrive[1]) * 60 + parseInt(arrive[2]);
				table[i++][1] = -1;
			}
			Arrays.sort(table, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o2[0];
				}
			});
			int peak = 0, inuse = 0;
			for (int i = 0; i < table.length; i++) {
				inuse += table[i][1];
				if (peak < inuse) {
					peak = inuse;
				}
			}
			System.out.println(peak);
		}
	}
}