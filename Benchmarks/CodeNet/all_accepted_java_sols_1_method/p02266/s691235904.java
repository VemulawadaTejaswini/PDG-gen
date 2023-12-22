
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		StringBuilder builder = new StringBuilder();
		Deque<Integer> S = new ArrayDeque<Integer>();
		Deque<int[]> L = new ArrayDeque<int[]>();

		char[] g = reader.readLine().toCharArray();
		int sum = 0;
		for (int i = 0; i < g.length; i++) {
			if (g[i] == '\\')
				S.add(i);
			else if (!S.isEmpty() && g[i] == '/') {
				int s = i - S.getLast();
				sum += s;
				while (!L.isEmpty() && S.getLast() < L.getLast()[0]) {
					s += L.getLast()[1];
					L.removeLast();
				}
				int[] data = { S.pollLast(), s };
				L.add(data);
			}
		}
		builder.append(sum).append('\n').append(L.size());
		for (int[] t : L) {
			builder.append(' ').append(t[1]);
		}
		System.out.println(builder);

	}
}