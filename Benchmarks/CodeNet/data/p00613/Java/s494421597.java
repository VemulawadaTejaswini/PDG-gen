import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		StringBuilder sb = new StringBuilder();
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int k = Integer.parseInt(line);
			if (k == 0) {
				break;
			}
			int sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			sb.append(sum / (k - 1) + '\n');
		}
		System.out.print(sb.toString());
	}
}