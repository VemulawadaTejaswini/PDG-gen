import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		String command;
		int value,temp;
		LinkedList<Integer> list = new LinkedList<>();
		for (int i=0; i<n; i++) {
			command = sc.next();
			if (command.equals("insert")) {
				value = Integer.parseInt(sc.next());
				list.add(0,value);
			}
			else if (command.equals("delete")) {
				value = Integer.parseInt(sc.next());
				temp = list.indexOf(value);
				if (temp != -1) {list.remove(list.indexOf(value));}
			}
			else if (command.equals("deleteFirst")) {
				list.pollFirst();
			}
			else if (command.equals("deleteLast")) {
				list.pollLast();
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(list.remove());
		for (Integer s: list) {
			sb.append(" ");
			sb.append(s);
		}
		out.println(sb);
	}
}
