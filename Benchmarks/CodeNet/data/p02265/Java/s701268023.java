import java.util.Scanner;

class Node {
	int key;
	Node prev, next;
}

class SohokoList {
	Node banpei;

	public SohokoList() {
		super();
		this.banpei = new Node();
		banpei.next = banpei;
		banpei.prev = banpei;
	}

	public void insert(int key) {
		Node x = new Node();
		x.key = key;
		// ???????????´??????????´??????????
		x.next = banpei.next;
		banpei.next.prev = x;
		banpei.next = x;
		x.prev = banpei;
	}

	public Node listSearch(int key) {
		Node cur = banpei.next;	// ??????????¬????????´????????????????
		while ( cur != banpei && cur.key != key ) {
			cur = cur.next;
		}
		return cur;
	}

	public void deleteNode(Node t) {
		if ( t == banpei ) return;	// ?????????????????????????????´?????????????????????
		t.prev.next = t.next;
		t.next.prev = t.prev;
	}

	public void deleteFirst() {
		deleteNode(banpei.next);
	}

	public void deleteLast() {
		deleteNode(banpei.prev);
	}

	public void deleteKey(int key) {
		deleteNode(listSearch(key));
	}

	public void print() {
		Node cur = banpei.next;
		int isf = 0;
		while(true) {
			if( cur == banpei ) break;
			if( isf++ > 0 ) System.out.print(" ");
			System.out.printf("%d", cur.key);
			cur = cur.next;
		}
		System.out.println();
	}

}

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		String[] commands = new String[n];
		for (int i = 0; i < n; i++) {
			commands[i] = sc.nextLine();
		}
		sc.close();

		SohokoList list = new SohokoList();

		for(String command : commands) {
			String[] elements = command.split(" ");
			String method = elements[0];

			int key = 0;
			if(elements.length == 2) {
				key = Integer.parseInt(elements[1]);
			}

			switch (method) {
			case "insert":
				list.insert(key);
				break;

			case "delete":
				list.deleteKey(key);
				break;

			case "deleteFirst":
				list.deleteFirst();
				break;

			case "deleteLast":
				list.deleteLast();
				break;

			default:
				break;
			}
		}

		list.print();

	}
}