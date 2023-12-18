import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

/**
 * Shuffle
 * JOI 8th, Pre 5
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			int m = parseInt(br.readLine());

			words = br.readLine().split(" ");

			int p, q, r;
			p = parseInt(words[0]);
			q = parseInt(words[1]);
			r = parseInt(words[2]);

			//shuffle
			//ABC -> CBA
			Deque<int[]> ABC = new ArrayDeque<>();
			ABC.offer(new int[]{1, n});

			for (int i = 0; i < m; i++) {
				line = br.readLine();

				int x, y;
				x = parseInt(line.substring(0, line.indexOf(' ')));
				y = parseInt(line.substring(line.indexOf(' ') + 1));
				y -= x;

				Deque<int[]> A = head(ABC, x);
				Deque<int[]> B = head(ABC, y);

				//C+B+A
				for (int[] b : B) ABC.offer(b);
				for (int[] a : A) ABC.offer(a);
			}

			//solve
			int count = 0;
			p--;
			q -= p;

			head(ABC, p);
			ABC = head(ABC, q);

			for (int[] c : ABC) {
				if (c[1] <= r) {
					count += c[1] - c[0] + 1;
				} else if (c[0] <= r && r < c[1]) {
					count += r - c[0] + 1;
				}
			}

			System.out.println(count);

		}
	}

	static Deque<int[]> head(Deque<int[]> deque, int size) {

		Deque<int[]> head = new ArrayDeque<>();

		while (size > 0) {
			int _x = deque.peek()[1] - deque.peek()[0] + 1;
			if (size == _x) {
				head.offer(deque.poll());
				size = 0;
			} else if (size > _x) {
				head.offer(deque.poll());
				size -= _x;
			} else if (size < _x) {
				head.offer(new int[]{
						deque.peek()[0],
						deque.peek()[0] + size - 1
				});
				deque.peek()[0] = deque.peek()[0] + size;
				size = 0;
			}
		}

		return head;
	}
}