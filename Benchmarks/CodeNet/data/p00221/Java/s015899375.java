import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

/**
 * Problem F: FizzBuzz
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0 0")) {
			int m = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int n = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			ArrayDeque<Integer> players = new ArrayDeque<Integer>();
			boolean[] says = new boolean[n];

			for (int i = 1; i <= m; i++) {
				players.add(i);
			}
			for (int i = 1; i <= n; i++) {
				says[i - 1] = fizzBuzz(i, br.readLine());
			}

			for (int i = 0; i < n; i++) {
				if (players.size() == 1) {
					break;
				}
				Integer player = players.poll();
				if (says[i]) {
					players.offer(player);
				}
			}

			//頭出し
			while (true) {
				players.offer(players.poll());
				if (players.peekFirst() <= players.peekLast()) {
					break;
				}
			}
			StringBuilder sb = new StringBuilder();
			sb.append(players.poll());
			for (Integer player : players) {
				sb.append(" " + player);
			}
			System.out.println(sb.toString());
		}
	}

	public static boolean fizzBuzz(int idx, String say) {
		boolean ret = false;
		if (idx % 15 == 0) {
			if (say.equals("FizzBuzz")) {
				ret = true;
			}
		} else if (idx % 3 == 0) {
			if (say.equals("Fizz")) {
				ret = true;
			}
		} else if (idx % 5 == 0) {
			if (say.equals("Buzz")) {
				ret = true;
			}
		} else if (say.equals(String.valueOf(idx))) {
			ret = true;
		}
		return ret;
	}
}