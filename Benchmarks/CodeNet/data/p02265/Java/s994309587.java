import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	void run() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			String command = br.readLine();
			int val = 0;
			if (command.charAt(6) == ' ') {
				val = Integer.parseInt(command.substring(7));
				command = command.substring(0, 6);
			}
			switch (command) {
			case "insert":
				list.addLast(val);
				break;
			case "delete":
				list.remove(list.indexOf(val));
				break;
			case "deleteFirst":
				list.pollFirst();
				break;
			case "deleteLast":
				list.pollLast();
				break;
			}
		}
		int len = list.size();
		for (int i = 1; i <= len; i++)
			System.out.print(list.get(len - i) + (i == len ? "\n" : " "));
	}
	public static void main(String[] args) {
		try {
			new Main().run();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}

