import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			if (n == 0) break;

			int[][] table = new int[n * 2][2];
			for (int i = 0; i < table.length; i += 2) {
				line = br.readLine();
				String[] sta = line.substring(0, line.indexOf(' ')).split(":");
				String[] stp = line.substring(line.indexOf(' ') + 1).split(":");
				table[i][0] = parseInt(sta[0]) * 3600 + parseInt(sta[1]) * 60 + parseInt(sta[2]);
				table[i][1] = 1;
				table[i + 1][0] = parseInt(stp[0]) * 3600 + parseInt(stp[1]) * 60 + parseInt(stp[2]);
				table[i + 1][1] = -1;
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