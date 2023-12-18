import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, m, k;
		LinkedList<Integer> list;

		n = 2 * Integer.parseInt(br.readLine());
		list = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(i + 1);
		}
		m = Integer.parseInt(br.readLine());
		for (int i = 0; i < m; i++) {
			k = Integer.parseInt(br.readLine());
			if (k > 0) {
				cut(k, list);
			} else {
				reshuffle(list);
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(list.get(i));
		}
	}

	static List<Integer> reshuffle(List<Integer> list) {
		LinkedList<Integer> temp = (LinkedList<Integer>) list;
		int n = temp.size() / 2;
		for (int i = 0; i < n; i++) {
			temp.add(i * 2 + 1, temp.remove(n + i));

		}
		return temp;
	}

	static List<Integer> cut(int k, List<Integer> list) {
		LinkedList<Integer> temp = (LinkedList<Integer>) list;
		for (int i = 0; i < k; i++) {
			temp.addLast(temp.removeFirst());
		}
		return temp;
	}
}