import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		LinkedList<Integer> l = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			String command = str[0];
			if (command.equals("insert")) {
				Integer operand = Integer.parseInt(str[1]);
				l.add(operand);
			} else if (command.equals("delete")) {
				Integer num = Integer.parseInt(str[1]);
				l.removeLastOccurrence(num);
			} else if (command.equals("deleteFirst")) {
				l.removeLast();
			} else if (command.equals("deleteLast")){
				l.removeFirst();
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

