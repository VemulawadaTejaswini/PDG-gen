import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		Set<String> dictionary = new TreeSet<String>();
		String[] commands;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			commands = br.readLine().split(" ");
			if (commands[0].startsWith("i")) {
				dictionary.add(commands[1]);
			} else {
				if (dictionary.contains(commands[1])) {
					sb.append("yes").append("\n");
				} else {
					sb.append("no").append("\n");
				}
			}
		}
		System.out.print(sb);
	}
}