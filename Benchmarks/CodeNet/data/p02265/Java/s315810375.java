import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] commands;
		int num;
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			commands = br.readLine().split(" ");
			if (commands[0].endsWith("First")) {
				list.removeFirst();
				continue;
			} else if (commands[0].endsWith("Last")) {
				list.removeLast();
				continue;
			}
			num = Integer.parseInt(commands[1]);
			if (commands[0].startsWith("i")) {
				list.addFirst(num);
			} else {
				list.remove(new Integer(num));
			}
		}
		Object[] output = list.toArray();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < output.length; i++) {
			if (i > 0) {
				sb.append(" ");
			}
			sb.append(output[i]);
		}
		System.out.println(sb.toString());
	}
}