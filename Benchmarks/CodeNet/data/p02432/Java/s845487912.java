import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		try (Scanner sc = new Scanner (System.in)){
			int times = sc.nextInt();
			int d, x;
			for (int i=0; i < times; i++) {
				int query = sc.nextInt();
				d = sc.nextInt();
				switch (query) {
				//push(d,x)
				case 0:
					x = sc.nextInt();
					if (d == 0) deque.addFirst(x);
					else if (d == 1) deque.addLast(x);
					break;
				//randomAccess(d)
				case 1:
					Iterator<Integer> ite = deque.iterator();
					for(int j=0; j<d; j++) ite.next();
					System.out.println(ite.next());
					break;
				//pop(d)
				case 2:
					if (d == 0) deque.removeFirst();
					else if (d == 1) deque.removeLast();
					break;

				}
			}
		}
	}
}
