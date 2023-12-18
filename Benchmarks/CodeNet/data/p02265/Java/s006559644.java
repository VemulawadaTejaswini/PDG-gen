import java.util.Scanner;

public class Main {

	static class Node<E> {
		E value;
		Node<E> prev;
		Node<E> next;
		public Node(E value) {
			this.value = value;
			prev = null;
			next = null;
		}
		public String toString() {
			return value.toString();
		}
	}
	
	static class DoublyLinkedList<E> {		
		
		private Node<E> head;
		private Node<E> tail;
		private int size;
		
		public DoublyLinkedList() {
			head = tail = null;			
			size = 0;
		}
		
		public int getSize() {
			return size;
		}
		
		public boolean isEmpty() {
			return size == 0;
		}

		public void appendToHead(E element) {
			Node<E> node = new Node<E>(element);
			if (head == null && tail == null) {
				head = tail = node;
			} else {
				head.prev = node;
				node.next = head;
				head = node;
			}
			size++;
		}
		
		public void delete(E element) {

			if (isEmpty()) {
				return;
			}
			
			if (head.value.equals(element)) {
				deleteFirst();
			} else {
				Node<E> current = head.next;
				Node<E> current2 = tail;
				Node<E> current3 = null;
				while (current != null) {
					if (current.value.equals(element)) {
						Node<E> prev = current.prev;
						Node<E> next = current.next;
						prev.next = next;
						if (next != null) {
							next.prev = prev;
						} else {
							tail = prev;
						}
						size--;
						break;
					} else if (current == current2) {
						if (current3 != null) {
							current = current3;
						} else {
							break;							
						}
					} else {
						current = current.next;						
						if (current2.value.equals(element)) {
							current3 = current2;
						}
						current2 = current2.prev;
					}
				}
			}
		}

		public void deleteFirst() {			
			if (isEmpty()) {
				return;
			}
			if (size == 1) {
				head = null;
				tail = null;
			} else {
				head = head.next;
				head.prev = null;
			}
			size--;
		}
		
		public void deleteLast() {			
			if (isEmpty()) {
				return;
			}
			if (size == 1) {
				head = null;
				tail = null;
			} else {
				tail = tail.prev;
				tail.next = null;
			}
			size--;
		}

		public void print() {
			Node<E> current = head;
			while (current != null) {
				System.out.print(current);
				current = current.next;
				if (current != null) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			String command = sc.next();
			if (command.length() == 6) {
				Integer value = sc.nextInt();
				if (command.charAt(0) == 'i') {
					list.appendToHead(value);
				} else {
					list.delete(value);
				}
			} else if (command.charAt(6) == 'F') {
				list.deleteFirst();
			} else {
				list.deleteLast();
			}
		}
		sc.close();
		list.print();
	}
}

