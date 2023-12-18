import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		StringBuilder sb = new StringBuilder();
		while (!(line = br.readLine()).equals("0")) {

			int n = Integer.parseInt(line);
			int num, sum;
			int sums[] = new int[n + 1];

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);
				sum = 0;
				for (int j = 0; j < n; j++) {
					num = Integer.parseInt(st.nextToken());
					sum += num;
					sums[j] += num;
				}
				sums[n] += sum;
				sb.append(line + " " + sum + "\n");
			}
			sb.append(sums[0]);
			for (int i = 1; i < n + 1; i++) {
				sb.append(" " + sums[i]);
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}