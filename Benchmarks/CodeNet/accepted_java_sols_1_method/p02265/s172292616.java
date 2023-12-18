import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		try {
			int n = Integer.parseInt(br.readLine());
			Deque<Integer> list = new ArrayDeque<Integer>();
			for (int i = 0; i < n; i++) {
				String command = br.readLine();
				if (command.charAt(0) == 'i') {
					String[] commands = command.split(" ");
					int num = Integer.parseInt(commands[1]);
					list.push(num);
				} else if (command.charAt(6) == 'F') {
					list.removeFirst();
				} else if (command.charAt(6) == 'L') {
					list.removeLast();
				} else {
					String[] commands=command.split(" ");
					int num = Integer.parseInt(commands[1]);
					list.remove(num);
				}

			}
			sb.append(list.poll());
			while (!list.isEmpty()) {
				sb.append(" " + list.poll());
			}
			System.out.println(sb);
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
