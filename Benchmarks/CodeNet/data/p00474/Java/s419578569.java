import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import static java.lang.Integer.parseInt;

/**
 * Icicles
 * JOI 9th, Fin.3
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N = parseInt(line.substring(0, line.indexOf(' ')));
			int L = parseInt(line.substring(line.indexOf(' ') + 1));

			List<Icicle> list = new ArrayList<>();

			list.add(new Icicle(0));
			for (int i = 1; i <= N; i++) {
				int a = parseInt(br.readLine());
				list.add(new Icicle(a));
			}
			list.add(new Icicle(0));

			int total = 0;
			int count = N;

			while (count > 0) {

				//System.out.println(list.size());

				Queue<Icicle> pq = new PriorityQueue<>();

				for (int i = 1; i <= list.size() - 1; i++) {
					if (list.get(i).len > list.get(i - 1).len
							&& list.get(i).len > list.get(i + 1).len) {
						pq.offer(list.get(i));
					}
				}

				int elapsed = L - pq.peek().len;
				total += elapsed;

				for (Icicle i : pq) {
					if ((i.len += elapsed) >= L) {
						i.len = 0;
						count--;
					}
				}

				List<Icicle> _list = new ArrayList<>();
				_list.add(new Icicle(0));
				for (int i = 1; i < list.size() - 1; i++) {
					if (list.get(i).len > 0) {
						_list.add(list.get(i));
					} else {
						if (_list.get(_list.size() - 1).len != 0) {
							_list.add(list.get(i));
						}
					}
				}
				if (_list.get(_list.size() - 1).len != 0) {
					_list.add(new Icicle(0));
				}

				list = _list;
				_list = null;
			}

			System.out.println(total);
		}
	}
}

class Icicle implements Comparable<Icicle> {

	int len = 0;

	Icicle(int len) {
		this.len = len;
	}

	@Override
	public int compareTo(Icicle o) {
		return Integer.compare(o.len, this.len);
	}
}