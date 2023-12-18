import java.io.BufferedReader;
import java.io.InputStreamReader;

class Node {
	private int value;
	private Node nextNode;
	private Node prevNode;

	public int getValue() {
		return value;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	public Node getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(Node prevNode) {
		this.prevNode = prevNode;
	}

	public Node(int value, Node nextNode, Node prevNode) {
		this.value = value;
		this.nextNode = nextNode;
		this.prevNode = prevNode;
	}
 }
class doubleLinkedList {
	private Node first;
	private Node last;

	public void removeFirst() {
		Node oldFirst = first;
		first = oldFirst.getNextNode();
		first.setPrevNode(null);
		oldFirst = null;
		System.gc();
		}

	public void removeLast() {
		Node oldLast = last;
		last = oldLast.getPrevNode();
		last.setNextNode(null);
		oldLast = null;
		System.gc();
	}

	public void insertFirst(int num) {
		if (first == null) {
			first = new Node(num, null, null);
			last = first;
		} else {
			Node newFirst = new Node(num, first, null);
			first.setPrevNode(newFirst);
			first = newFirst;
		}
	}

	public void delete (int num) {
		Node dltTarget = search(num);
		if (dltTarget.getNextNode() == null) {
			removeLast();
			return;
		} else if (dltTarget.getPrevNode() == null) {
			removeFirst();
			return;
		} else {
			dltTarget.getPrevNode().setNextNode(dltTarget.getNextNode());
			dltTarget.getNextNode().setPrevNode(dltTarget.getPrevNode());
		}
		dltTarget = null;
		System.gc();
	}

	private Node search(int num) {
		for (Node target = first; target !=null; target = target.getNextNode()) {
			if (target.getValue() == num) return target;
		}
		return null;
	}

	public void Print() {
		StringBuilder sb = new StringBuilder();
		Node target = first;
		if (target == null) {
			System.out.println("");
			return;
		} else {
			sb.append(target.getValue());
			target = target.getNextNode();
			while (target != null) {
				sb.append(" ");
				sb.append(target.getValue());
				target = target.getNextNode();
			}
			System.out.println(sb);
		}
	}
}
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] commands;
		int num;
		doubleLinkedList list = new doubleLinkedList();
		for (int i = 0; i < n; i++) {
			commands = br.readLine().split(" ");
			if (commands[0].endsWith("First")) {
				list.removeFirst();
				continue;
			} else if (commands[0].endsWith("Last")) {
				list.removeLast();
				continue;
			}
			num = Integer.parseInt(commands[1]);
			if (commands[0].startsWith("i")) {
				list.insertFirst(num);
			} else {
				list.delete(num);
			}
		}
		list.Print();
	}
}