
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
			String line = reader.readLine();
			if(line.charAt(0) == 'i')
				deque.push(Integer.parseInt(line.substring(7)));
			else if(line.charAt(6)=='F')
				deque.removeFirst();
			else if(line.charAt(6)=='L')
				deque.removeLast();
			else
				deque.remove(Integer.parseInt(line.substring(7)));
			/*System.out.println(deque.stream().map(String::valueOf)
					.collect(Collectors.joining(", ", "[", "]")));*/
		}
		builder.append(deque.poll());
		for(int num2 : deque)
			builder.append(" ").append(num2);
		System.out.println(builder);
	}
}
