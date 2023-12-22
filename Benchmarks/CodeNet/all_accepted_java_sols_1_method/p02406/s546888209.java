import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				sb.append(" ").append(i);
				continue;
			}
			int tmp = i;
			do {
				if (i % 10 == 3) {
					i = tmp;
					sb.append(" ").append(i);
					break;
				}
				i /= 10;
			} while (i != 0);
			i = tmp;
		}
		System.out.println(sb);
	}
}