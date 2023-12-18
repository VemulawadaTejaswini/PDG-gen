import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int c = 0;
		StringBuilder sb = new StringBuilder();

		while (!(line = br.readLine()).equals("0")) {
			c++;
			int w = Integer.parseInt(line);
			int n = Integer.parseInt(br.readLine());
			short[] values = new short[n];
			short[] weights = new short[n];

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				values[i] = Short.parseShort(line.substring(0,
						line.indexOf(',')));
				weights[i] = Short
						.parseShort(line.substring(line.indexOf(',') + 1));
			}

			int steal;
			int[] steals = new int[w + 1];
			for (int i = 0; i < n; i++) {
				for (int j = weights[i]; j < w + 1; j++) {
					steal = steals[j - weights[i]] + values[i];
					if (steal > steals[j]) {
						steals[j] = steal;
					}
				}
			}
			
			int maxValue = 0, minWeight = w;
			for (int i = 1; i < steals.length; i++) {
				if (steals[i] > maxValue) {
					maxValue = steals[i];
					if (i < minWeight) {
						minWeight = i;
					}
				}
			}
			sb.append("Case " + c + ":\n");
			sb.append(maxValue + "\n");
			sb.append(minWeight + "\n");
		}
		System.out.print(sb.toString());
	}
}