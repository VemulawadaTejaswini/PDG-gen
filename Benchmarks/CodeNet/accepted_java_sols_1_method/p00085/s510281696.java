import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Joseph's Potato
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0 0")) {

			int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int m = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			Deque<Integer> q = new ArrayDeque<Integer>(n);

			for (int i = 1; i <= n; i++) {
				q.offer(i);
			}

			while (q.size() != 1) {
				for (int i = 0; i < m - 1; i++) {
					q.offer(q.poll());
				}
				q.poll();
			}
			System.out.println(q.poll());

		}

	}

}