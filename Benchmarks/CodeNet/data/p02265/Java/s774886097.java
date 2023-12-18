import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Deque<String> q = new LinkedList<String>();
		for (int i = 0; i < n; i++) {
			String line = br.readLine();

			if (line.startsWith("insert")) {
				q.offerLast(line.split(" ")[1]);
			} else if (line.equals("deleteFirst")) {
				q.pollLast();
			} else if (line.equals("deleteLast")) {
				q.pollFirst();
			} else {
				q.removeLastOccurrence(line.split(" ")[1]);
			}

			if (i % 100000 == 0) {
				System.gc();
			}
		}

		List<String> l = Arrays.asList(q.toArray(new String[0]));
		Collections.reverse(l);
		System.out.print(l.get(0));
		for (int i = 1; i < l.size(); i++) {
			System.out.print(" ");
			System.out.print(l.get(i));
		}
		System.out.println();

		if (br != null) {
			br.close();
			br = null;
		}
	}
}