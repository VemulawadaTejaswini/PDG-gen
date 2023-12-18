
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String[] line = reader.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int q = Integer.parseInt(line[1]);
		List<String[]> queue = new LinkedList<String[]>();
		for (int i = 0; i < n; i++) {
			queue.add(reader.readLine().split(" "));
		}
		String[] work = new String[2];
		int elapse = 0;
		while (queue.size()!=0) {
			work = queue.remove(0);
			int time = Integer.parseInt(work[1]);
			if (time <= q) {
				elapse += time;
				builder.append(work[0]).append(" ").append(elapse).append("\n");
			} else {
				time -= q;
				elapse += q;
				work[1] = String.valueOf(time);
				queue.add(work);
			}
		/*	queue.forEach(a->System.out.println(Arrays.toString(a)));
			System.out.println(Arrays.toString(work) + "  ->  work    " + elapse);
			System.out.println();*/

		}
		System.out.print(builder);
	}
}