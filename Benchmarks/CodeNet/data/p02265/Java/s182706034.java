import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

class Elem {
	Elem next;
	Elem prev;
	int key;
	
	Elem(int key) {
		this.key = key;
	}
}

class DoubleyLinkedList {
	Elem head;
	
	DoubleyLinkedList() {
		head = new Elem(-1);
		head.next = head;
		head.prev = head;
	}
	
	boolean isEmpty() {
		return head.prev == head;
	}
	
	void insert(int key) {
		Elem e = new Elem(key);
		e.next = head.next;
		e.prev = head;
		e.next.prev = e;
		head.next = e;
	}
	
	int delete(int key) {
		for (Elem e = head.next; e != head; e = e.next) {
			if (e.key == key) {
				e.prev.next = e.next;
				e.next.prev = e.prev;
				return e.key;
			}
		}
		return -1;
	}
	
	int deleteFirst() {
		Elem e = head.next;
		e.next.prev = head;
		head.next = e.next;
		return e.key;
	}
	
	int deleteLast() {
		Elem e = head.prev;
		e.prev.next = head;
		head.prev = e.prev;
		return e.key;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Elem e = head.next; e != head; e = e.next) {
			sb.append(e.key);
			sb.append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append('\n');
		return sb.toString();
	}
}

public class Main {
	public static void main(String[] args) throws Exception {
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader br = new BufferedReader(new FileReader("in1.txt"));
		BufferedReader br = new BufferedReader(new FileReader("in2.txt"));
		int n = Integer.parseInt(br.readLine());

		DoubleyLinkedList list = new DoubleyLinkedList();
		for (int i = 0; i < n; i++) {
			String[] line = br.readLine().split(" ");
			if (line[0].equals("insert")) {
				list.insert(Integer.parseInt(line[1]));
			} else if (line[0].equals("delete")) {
				list.delete(Integer.parseInt(line[1]));
			} else if (line[0].equals("deleteFirst")) {
				list.deleteFirst();
			} else if (line[0].equals("deleteLast")) {
				list.deleteLast();
			}
		}
		System.out.print(list.toString());
	}
}