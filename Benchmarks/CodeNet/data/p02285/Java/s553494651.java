import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// ALDS1_8_C
public class Main {
	Node root = null;
	
	void preParse(Node node) {
		if (node == null) return;
		System.out.print(" " + node.number);
		preParse(node.left);
		preParse(node.right);
	}
	
	void inParse(Node node) {
		if (node == null) return;
		inParse(node.left);
		System.out.print(" " + node.number);
		inParse(node.right);
	}
	
	void postParse(Node node) {
		if (node == null) return;
		postParse(node.left);
		postParse(node.right);
		System.out.print(" " + node.number);
	}
	
	void delete(Node node) {
		if (node == null) return;
		if (node.left == null) {
			if (node.right == null) {
				if (node.parent.left == node) node.parent.left = null;
				else node.parent.right = null;
			} else {
				node.right.parent = node.parent;
				if (node.parent.left == node) node.parent.left = node.right;
				else node.parent.right = node.right;
			}
		} else {
			if (node.right == null) {
				node.left.parent = node.parent;
				if (node.parent.left == node) node.parent.left = node.left;
				else node.parent.right = node.left;
			} else {
				Node tmpnode = node.right;
				while (tmpnode.left != null) {
					tmpnode = tmpnode.left;
				}
				if (node.right != tmpnode) tmpnode.parent.left = tmpnode.right;
				if (tmpnode.right != null) tmpnode.right.parent = tmpnode.parent;
				tmpnode.parent = node.parent;
				if (node.parent.left == node) node.parent.left = tmpnode;
				else node.parent.right = tmpnode;
				if (tmpnode != node.left) {
					tmpnode.left = node.left;
					node.left.parent = tmpnode;
				}
				if (tmpnode != node.right) {
					tmpnode.right = node.right;
					node.right.parent = tmpnode;
				}
			}
		}
	}
	
	Node findCheck(Node node, int n) {
		if (node == null) return null;
		if (node.number == n) return node;
		else if (node.number > n) return findCheck(node.left, n);
		else return findCheck(node.right, n);
	}
	
	void insert(List T, Node node) {
		Node y = null;
		Node x = root;
		while (x != null) {
			y = x;
			if (node.number < x.number) x = x.left;
			else x = x.right;
		}
		node.parent = y;
		if (y == null) root = node;
		else if (node.number < y.number) y.left = node;
		else y.right = node;
	}
	
	void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Node> T = new LinkedList<Node>();
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			switch(str.charAt(0)) {
			case 'd':
				delete(findCheck(root, Integer.parseInt(str.split(" ")[1])));
				break;
			case 'f':
				if (findCheck(root, Integer.parseInt(str.split(" ")[1])) != null) System.out.println("yes");
				else System.out.println("no");
				break;
			case 'i':
				Node node = new Node(Integer.parseInt(str.split(" ")[1]));
				insert(T, node);
				break;
			case 'p':
				inParse(root);
				System.out.println();
				preParse(root);
				System.out.println();
				break;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}

class Node {
	int number;
	Node parent = null;
	Node left = null;
	Node right = null;
	Node(int number) {
		this.number = number;
	}
}
