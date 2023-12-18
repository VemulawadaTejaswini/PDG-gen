import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		StringBuilder sb = new StringBuilder();

		br.readLine();
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int x, y, b, p;
			double regular, discount;
			StringTokenizer st = new StringTokenizer(line);
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			p = Integer.parseInt(st.nextToken());
			regular = x * b + y * p;
			discount = (x * (b > 5 ? b : 5) + y * (p > 2 ? p : 2)) * 0.8;
			sb.append(
					Double.valueOf(regular < discount ? regular : discount)
							.intValue()).append('\n');
		}
		System.out.print(sb.toString());
	}
}