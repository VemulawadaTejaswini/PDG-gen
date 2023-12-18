import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> l = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			String command = sc.next();
			if (command.equals("insert")) {
				String num = sc.next();
				l.add(num);
			} else if (command.equals("delete")) {
				String num = sc.next();
				for (int j = l.size()-1; j >= 0; j--) {
					if (num.equals(l.get(j))) {
						l.remove(j);
						break;
					}
				}
			} else if (command.equals("deleteFirst")) {
				l.remove(l.size()-1);
			} else if (command.equals("deleteLast")){
				l.remove(0);
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

