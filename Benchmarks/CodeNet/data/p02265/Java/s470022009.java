import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		LinkedList<String> l = new LinkedList<String>();
		for (int i = 0; i < n; i++) {
			String command = sc.next();
			if (command.equals("insert")) {
				String operand = sc.next();
				l.add(operand);
			} else if (command.equals("deleteFirst")) {
				l.removeLast();
			} else if (command.equals("deleteLast")){
				l.removeFirst();
			} else if (command.equals("delete")) {
				String num = sc.next();
				l.removeLastOccurrence(num);
			} else {
				throw new IllegalArgumentException();
			}
		}

		PrintWriter out = new PrintWriter(System.out);
		for (int i = l.size()-1; i >= 0; i--) {
			out.print(l.get(i));
			if (i != 0) {
				out.print(" ");
			}
		}
		out.print("\n");
		out.flush();
	}

}
