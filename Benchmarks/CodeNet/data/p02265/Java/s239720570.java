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
				l.addFirst(operand);
			} else if (command.equals("deleteFirst")) {
				l.removeFirst();
			} else if (command.equals("deleteLast")){
				l.removeLast();
			} else if (command.equals("delete")) {
				Integer num = Integer.parseInt(str[1]);
				l.removeFirstOccurrence(num);
			} else {
				throw new IllegalArgumentException();
			}
		}

		PrintWriter out = new PrintWriter(System.out);
		for (int i = 0; i < l.size(); i--) {
			out.print(l.get(i));
			if (i != l.size()-1) {
				out.print(" ");
			}
		}
		out.print("\n");
		out.flush();

		br.close();
	}

}

