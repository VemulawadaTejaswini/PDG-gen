import java.util.*;
import java.io.*;
public class Main {
	static Node head, tail, node;
	public static void main(String[] args) throws IOException {
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		head = new Node(0);
		tail = new Node(0);
		head.next = tail;
		tail.front = head;
		String command;
		int n, i, x;
		in.nextToken();
		n = (int)in.nval;
		// System.out.println("n = " + n);
		in.nextToken();
		for (i = 0; i < n; i++) {
			command = in.sval;
			// System.out.println("i = " + i + ", n = " + n + ", command = " + command);
			in.nextToken();
			if (command.length() > 6) {
				if (command.charAt(6) == 'F')
					deleteFirst();
				else
					deleteLast();
			} else {
				x = (int)in.nval;
				in.nextToken();
				if (command.charAt(0) == 'i')
					insertNum(x);
				else
					deleteNum(x);
			}
		}
		node = head.next;
		if (node.next != null) {
			System.out.print(node.value);
			node = node.next;
		}
		
		while (node.next != null) {
			System.out.print(" " + node.value);
			node = node.next;
		}
		System.out.println();
	}
	static void insertNum(int x) {
		node = new Node(x);
		node.next = head.next;
		node.next.front = node;
		node.front = head;
		head.next = node;
	}
	static void deleteNum(int x) {
		node = head.next;
		while (node.next != null) {
			if (node.value == x) {
				node.front.next = node.next;
				node.next.front = node.front;
				return;
			}
			node = node.next;
		}
	}
	static void deleteFirst() {
		node = head.next;
		node.next.front = head;
		head.next = node.next;
	}
	static void deleteLast() {
		node = tail.front;
		node.front.next = tail;
		tail.front = node.front;
	}
}

class Node {
	int value;
	Node front;
	Node next;
	Node() {
		value = 0;
		front = null;
		next = null;
	}
	Node(int x) {
		this();
		value = x;
	}
}
