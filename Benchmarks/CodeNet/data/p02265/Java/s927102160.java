import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		DblLinkedList<Integer> list = new DblLinkedList<Integer>();

		for (int i=0; i<n; i++) {
			String str = stdIn.next();

			if (str.equals("insert")) {
				list.addFirst(stdIn.nextInt());
			}else if (str.equals("delete")) {
				list.remove(stdIn.nextInt());
			}else if (str.equals("deleteFirst")) {
				list.removeFirst();
			}else {
				list.removeLast();
			}
		}
		list.output();

		stdIn.close();
	}
}

class DblLinkedList<Integer> {

	class Node<Integer> {
		private Integer data;
		private Node<Integer> prev;
		private Node<Integer> next;

		Node(){
			data = null;
			prev = next = this;
		}
		Node(Integer obj,Node<Integer> prev,Node<Integer> next){
			data = obj;
			this.prev = prev;
			this.next = next;
		}
	}

	private Node<Integer> head;
	private Node<Integer> crnt;

	public DblLinkedList(){
		head = crnt = new Node<Integer>();
	}

	public boolean isEmpty(){
		return head.next == head;
	}

	public Integer search(Integer obj,Comparator<? super Integer> c){
		Node<Integer> ptr = head.next;

		while (ptr != head) {
			if (c.compare(obj,ptr.data) == 0) {
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next;
		}

		return null;
	}

	public void output(){
		Node<Integer> ptr = head.next;
		while (ptr != head.prev){
			System.out.print(ptr.data+" ");
			ptr = ptr.next;
		}
		System.out.println(ptr.data);
	}

	public void printCurrentNode(){
		if(isEmpty())
			System.out.println("着目ノードはありません");
		else
			System.out.println(crnt.data);
	}

	public void add(Integer obj){
		Node<Integer> node = new Node<Integer>(obj,crnt,crnt.next);
		crnt.next = crnt.next.prev = node;
		crnt = node;
	}

	public void addFirst(Integer obj){
		crnt = head;
		add(obj);
	}

	public void addLast(Integer obj){
		crnt = head.prev;
		add(obj);
	}

	public void removeCurrentNode(){
		if (!isEmpty()) {
			crnt.prev.next = crnt.next;
			crnt.next.prev = crnt.prev;
			crnt = crnt.prev;
			if (crnt == head) crnt = head.next;
		}
	}

	public void remove(Integer p){
		Node<Integer> ptr = head.next;

		while (ptr != head) {
			if (ptr.data == p) {
				crnt = ptr;
				removeCurrentNode();
				break;
			}
			ptr = ptr.next;
		}
	}

	public void removeFirst(){
		crnt = head.next;
		removeCurrentNode();
	}

	public void removeLast(){
		crnt = head.prev;
		removeCurrentNode();
	}
}