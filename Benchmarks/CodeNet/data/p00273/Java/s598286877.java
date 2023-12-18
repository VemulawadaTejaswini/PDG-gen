import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			int x, y, b, p;
			int regular, discount;
			StringTokenizer st = new StringTokenizer(line);
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			p = Integer.parseInt(st.nextToken());
			regular = x * b + y * p;
			discount = (x * (b > 5 ? b : 5) + y * (p > 2 ? p : 2)) * 4 / 5;
			sb.append(regular < discount ? regular : discount).append('\n');
		}
		System.out.print(sb.toString());
	}
}