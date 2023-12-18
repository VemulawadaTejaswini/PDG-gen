import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int id = sc.nextInt();
		Node root = new Node(++id, 0, sc.next());
		for (int i = 1; i < n; i++) {
			int targetId = sc.nextInt();
			Node parent = root.findNode(targetId);
			parent.children.add(new Node(++id, parent.depth + 1, sc.next()));
		}
		root.printContents();
		sc.close();
	}

}

class Node {
	int id, depth;
	String contents;
	List<Node> children;

	Node(int i, int d, String c) {
		id = i;
		depth = d;
		contents = c;
		children = new ArrayList<Node>();
	}

	public Node findNode(int id) {
		if (id == this.id)
			return this;
		for (Node child : children) {
			Node target = child.findNode(id);
			if (target != null)
				return target;
		}
		return null;
	}

	public void printContents() {
		for (int i = 0; i < depth; i++)
			System.out.print('.');
		System.out.println(contents);
		for (Node child : children)
			child.printContents();
	}
}