import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line);
			if (n == 0) break;

			byte[] table = new byte[24 * 60 * 60];
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				String start = line.substring(0, line.indexOf(' '));
				String arrive = line.substring(line.indexOf(' ') + 1);
				table[secondValue(start)]++;
				table[secondValue(arrive)]--;
			}
			int peak = 0, inuse = 0;
			for (int i = 0; i < table.length; i++) {
				inuse += table[i];
				if (peak < inuse) {
					peak = inuse;
				}
			}
			System.out.println(peak);
		}
	}

	static int secondValue(String time) {
		StringTokenizer st = new StringTokenizer(time, ":");
		int second = parseInt(st.nextToken()) * 3600;
		second += parseInt(st.nextToken()) * 60;
		second += parseInt(st.nextToken());
		return second;
	}
}