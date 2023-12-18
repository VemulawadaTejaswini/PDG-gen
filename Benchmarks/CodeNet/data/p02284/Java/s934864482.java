/**
 * Binary search trees - Binary Search Tree II
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		Tree tree = new Tree();
		int key;

		int n = parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			line = br.readLine();
			switch (line.charAt(0)) {
				case 'i':
					key = parseInt(line.substring(line.indexOf(' ') + 1));
					tree.insert(new Node(key));
					break;
				case 'f':
					key = parseInt(line.substring(line.indexOf(' ') + 1));
					if (tree.find(key) != null) System.out.println("yes");
					else System.out.println("no");
					break;
				case 'p':
					tree.print(Tree.Order.Inorder);
					tree.print(Tree.Order.Preorder);
					break;
			}
		}
	} //end main
}

class Tree {

	enum Order {
		Preorder,
		Inorder,
		Postorder
	}

	Node root;

	Node insert(Node node) {
		Node parent = null;
		Node child = root;
		//
		while (child != null) {
			parent = child;
			if (node.key < child.key) child = child.left;
			else child = child.right;
		}
		node.parent = parent;
		//
		if (parent == null) {
			this.root = node;
		} else if (node.key < parent.key) {
			parent.left = node;
		} else {
			parent.right = node;
		}
		return node;
	}

	Node find(int key) {
		Node node = root;
		while (node != null && key != node.key) {
			if (key < node.key) node = node.left;
			else node = node.right;
		}
		return node;
	}

	void print(Order order) {
		switch (order) {
			case Preorder:
				walkPreorder(root);
				break;
			case Inorder:
				walkInorder(root);
				break;
			case Postorder:
				walkPostorder(root);
				break;
		}
		System.out.println();
	}

	void walkPreorder(Node node) {
		if (node == null) return;
		System.out.print(" " + node.key);
		walkPreorder(node.left);
		walkPreorder(node.right);
	}

	void walkInorder(Node node) {
		if (node == null) return;
		walkInorder(node.left);
		System.out.print(" " + node.key);
		walkInorder(node.right);
	}

	void walkPostorder(Node node) {
		if (node == null) return;
		walkPostorder(node.left);
		walkPostorder(node.right);
		System.out.print(" " + node.key);
	}
}

class Node {
	int key;
	Node parent, left, right;

	Node(int key) {
		this.key = key;
	}
}