import java.util.Scanner;


public class Main{

	static Node head = null;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = new Integer(s.nextLine()).intValue();
		for(int i=0 ; i<cnt ; i++) {
			String[] str = s.nextLine().split(" ");
			if("insert".equals(str[0])) {
				insert(new Integer(str[1]).intValue());
			}else if("delete".equals(str[0])) {
				delete(new Integer(str[1]).intValue());
			}else if("deleteFirst".equals(str[0])) {
				deleteFirst();
			}else if("deleteLast".equals(str[0])) {
				deleteLast();
			}
		}
		StringBuilder b = new StringBuilder();
		while(head!=null){
			b.append(head.value).append(" ");
			head = head.nextNode;
		}
		System.out.println(b.toString().trim());
	}

	public static void insert(int value) {
		if(head == null) {
			head = new Main().new Node(value);
			return;
		}
		Node current = new Main().new Node(value);
		head.previousNode = current;
		current.nextNode = head;
		head = current;
	}

	public static void delete(int value) {
		if(head == null) {
			return;
		}
		Node n = head;
		while(n != null) {
			if(n.value == value && n.nextNode!=null && n.previousNode!=null) {
				n.nextNode.previousNode = n.previousNode;
				n.previousNode.nextNode = n.nextNode;
				n = null;
				System.gc();
				break;
			}else if(n.value==value && n.previousNode==null && n.nextNode!=null){
				deleteFirst();
				break;
			}

			else if(n.value==value && n.nextNode==null && n.previousNode!=null){
				deleteLast();
				break;
			}


			n = n.nextNode;
		}
	}

	public static void deleteFirst() {
		if(head == null)
			return;
		if(head.nextNode == null) {
			head = null;
			return;
		}
		Node d = head.nextNode;
		head.nextNode = null;
		//メモリ解放
		System.gc();
		d.previousNode = null;
		head = d;
	}

	public static void deleteLast() {
		if(head == null)
			return;

		if(head.nextNode == null){
			head = null;
			return;
		}

		Node n = head;
		while(n.nextNode != null) {
			n = n.nextNode;
		}
		//メモリ解放
		n = null;
		System.gc();
		n.previousNode.nextNode = null;
	}

	public class Node {
		int value;
		Node previousNode;
		Node nextNode;

		public Node(int value) {
			this.value = value;
			this.previousNode = null;
			this.nextNode = null;
		}

		public void setPreviousNode(Node node) {
			this.previousNode = node;
		}

		public void setNextNode(Node node) {
			this.nextNode = node;
		}
	}
}