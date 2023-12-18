import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * A Thief
 */
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
			Short[][] treasure = new Short[n][2];

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				treasure[i][0] = Short.valueOf(line.substring(0,
						line.indexOf(',')));
				treasure[i][1] = Short
						.valueOf(line.substring(line.indexOf(',') + 1));
			}

			Arrays.sort(treasure, new Comparator<Short[]>() {
				@Override
				public int compare(Short[] o1, Short[] o2) {
					if (o1[0].compareTo(o2[0]) == 0)
						return o1[1] - o2[1];
					else
						return o2[0] - o1[0];
				}
			});

			int value, weight;
			value = 0;
			weight = 0;
			for (int i = 0; i < n; i++) {
				if (treasure[i][1] <= w - weight) {
					value += treasure[i][0];
					weight += treasure[i][1];
				}
			}

			sb.append("Case " + c + ":\n");
			sb.append(value + "\n");
			sb.append(weight + "\n");
		}
		System.out.println(sb.toString());
	}
}