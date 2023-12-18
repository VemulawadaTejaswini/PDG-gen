import java.util.Scanner;

public class Main {
	static class Node {
		int value;
		Node prev;
		Node next;
		
		public Node(int value, Node prev, Node next) {
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
	}
	
	static class MyList {
		Node start;
		Node end;
		Node cursor;
		
		public void insert(int num) {
			Node tmp = new Node(num, cursor.prev, cursor);
			cursor.prev.next = tmp;
			cursor.prev = tmp;
			cursor = tmp;
		}
		
		public void move (int d) {
			if (d < 0) {
				d *= -1;
				for (int i = 0; i < d; i++) {
					cursor = cursor.prev;
				}
			} else {
				for (int i = 0; i < d; i++) {
					cursor = cursor.next;
				}
			}
		}
		
		public void erase() {
			cursor.prev.next = cursor.next;
			cursor.next.prev = cursor.prev;
			cursor = cursor.next;
		}
		
		public void print() {
			Node tmp = start.next;
			while (tmp != end) {
				System.out.println(tmp.value);
				tmp = tmp.next;
			}
		}
		
		public MyList() {
			start = new Node(-1000000001, null, null);
			end = new Node(-1000000001, start, start);
			start.next = end;
			start.prev = end;
			cursor = end;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		MyList myList = new MyList();
		for (int i = 0; i < q; i++) {
			switch (sc.nextInt()) {
				case 0:
					myList.insert(sc.nextInt());
					break;
				case 1:
					myList.move(sc.nextInt());
					break;
				case 2:
					myList.erase();
					break;
			}
		}
		myList.print();
	}
}

