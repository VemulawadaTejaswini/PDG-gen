import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			String command = sc.next();
			if (command.equals("insert") || command.equals("delete")) {
				Integer value = sc.nextInt();
				if (command.equals("insert")) {
					list.addFirst(value);
				} else {
					list.remove(value);
				}
			} else if (command.equals("deleteFirst")) {
				list.removeFirst();
			} else if (command.equals("deleteLast")) {
				list.removeLast();
			} else {
				System.out.println("Unknown command:" + command);
			}
		}
		sc.close();	
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer value = itr.next();
			System.out.print(value);
			if (itr.hasNext()) {
				System.out.print(" ");
			}
		}
		System.out.println("");
	}	
}
