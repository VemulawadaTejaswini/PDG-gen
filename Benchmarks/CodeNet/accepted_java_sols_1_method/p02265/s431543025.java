import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		final int n = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		
		// 両端キュー
		Deque<String> array = new ArrayDeque<String>();
		
		for (int i = 0; i < n; i++) {
			final String ord = scan.next();
			final String number;
			
			switch (ord) {
			case "insert":
				number = scan.next();
				array.addFirst(number);
				break;
			case "delete":
				number = scan.next();
				array.remove(number);
				break;
			case "deleteFirst":
				array.removeFirst();
				break;
			case "deleteLast":
				array.removeLast();
			break;
			}
			
		}
		scan.close ();
		
		sb.append(array.removeFirst());
		
		while (!array.isEmpty()) {
			sb.append(" ").append(array.getFirst());
			array.removeFirst();
		}
		
		System.out.println(sb);
	}
}

