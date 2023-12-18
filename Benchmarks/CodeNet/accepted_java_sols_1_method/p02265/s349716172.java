import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayDeque<Long> list = new ArrayDeque<>();
		long ele = 0;

		for (int i = 0; i < n; i++) {
			switch (sc.next()) {
			case "insert":
				ele = Integer.parseInt(sc.next());
				list.offerFirst(ele);
				break;
			case "delete":
				ele = Long.parseLong(sc.next());
				list.remove(ele);
				break;
			case "deleteFirst":
				list.pollFirst();
				break;
			case "deleteLast":
				list.pollLast();
				break;
			}
		}

		PrintWriter out = new PrintWriter(System.out);

		for (int i = 0; i < list.size();) {
			out.print(list.pollFirst());
			out.print(list.size() == 0 ? "" : " ");
		}
		out.println();
		out.flush();
	}
}

