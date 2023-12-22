import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n, m;
			n = Integer.parseInt(line);
			if (n == 0) {
				break;
			}
			m = Integer.parseInt(br.readLine());

			//問題文解析
			line = br.readLine();
			ArrayDeque<Integer> count = new ArrayDeque<Integer>();
			count.add(0);
			int j = -1;
			for (int i = 1; i < m - 1; i++) {
				if (line.charAt(i) == 'O') {
					if ((line.charAt(i - 1) | line.charAt(i + 1)) == 'I') {
						if (i - j == 2) {
							count.offer(count.pollLast() + 1);
						} else {
							count.offer(1);
						}
						j = i;
					}
				}
			}
			//集計
			int sum = 0;
			for (int c : count) {
				if (c >= n) {
					sum += c - n + 1;
				}
			}
			System.out.println(sum);
		}
	}
}