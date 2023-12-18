import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class Main {
	void run() throws IOException {
		ArrayDeque<String> qu = new ArrayDeque<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			switch (str[0]) {
			case "insert":
				qu.addFirst(str[1]);
				break;
			case "delete":
				qu.remove(str[1]);
				break;
			case "deleteFirst":
				qu.removeFirst();
				break;
			case "deleteLast":
				qu.removeLast();
				break;
			default:
				break;
			}
		}
		boolean check = true;
		for (String str : qu) {
			if (check) {
				check = false;
				System.out.print(str);
			} else {
				System.out.print(" " + str);
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}

