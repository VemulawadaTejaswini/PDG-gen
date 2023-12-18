
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
		int n = Integer.parseInt(reader.readLine());
		Deque<Integer> deque = new ArrayDeque<Integer>();
		for (int i = 0; i < n; i++) {
			String[] line = reader.readLine().split(" ");
			String name = line[0];
			int num = Integer.parseInt(line[1]);
			if (name.equals("insert"))
				deque.push(num);
			else if (name.equals("delete"))
				deque.remove(num);
			else if (name.equals("deleteFirst"))
				deque.pollFirst();
			else
				deque.pollLast();
			/*System.out.println(deque.stream().map(String::valueOf)
					.collect(Collectors.joining(", ", "[", "]")));*/
		}
		int size = deque.size();
		for (int i = 0; i < size; i++) {
			if (0 < i)
				builder.append(" ");
			builder.append(deque.pollFirst());
		}
		System.out.println(builder);
	}
}