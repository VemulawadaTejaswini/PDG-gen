import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\ALDS1_6_A-in9.txt"));

		int n = scan.nextInt();
		Tree t = new Tree(n);

		for (int i = 0; i < n; i++) {
			String s = scan.next();
			if (s.equals("insert"))
				t.insert(i, scan.nextInt());
			else if (s.equals("find"))
				t.find(scan.nextInt());
			else if (s.equals("delete"))
				t.delete(scan.nextInt());
			else {
				t.printInorder();
				t.printPreorder();
			}
		}

		scan.close();
		System.exit(0);
	}
}

class Tree {

	private class Node {
		public Node(int _key) {
			key = _key;
		}

		int key;
		int Parent = -1;
		int LeftChild = -1;
		int RightChild = -1;

		public int getDeg() {
			int d = 2;
			if (LeftChild == -1)
				d--;
			if (RightChild == -1)
				d--;
			return d;
		}
	}

	Node[] node;
	int root = -1;

	public Tree(int n) {
		node = new Node[n];
	}

	public void delete(int key) {
		int x;
		if ((x = find(root, key)) != -1)
			delete(x, key);
	}

	private void delete(int x, int key) {
		if (node[x].getDeg() == 0) {
			if (root == x)
				root = -1;
			else if (node[node[node[x].Parent].LeftChild].key == key)
				node[node[x].Parent].LeftChild = -1;
			else
				node[node[x].Parent].RightChild = -1;
		} else if (node[x].getDeg() == 1) {
			int c;
			if (node[x].LeftChild == -1)
				c = node[x].RightChild;
			else
				c = node[x].LeftChild;

			if (root == x)
				root = c;
			else if (node[node[node[x].Parent].LeftChild].key == key)
				node[node[x].Parent].LeftChild = c;
			else
				node[node[x].Parent].RightChild = c;

			node[c].Parent = node[x].Parent;
		} else {
			int c = LeftIn(node[x].RightChild);
			node[x].key = node[c].key;
			delete(c, node[c].key);
		}
	}

	private int LeftIn(int x) {
		if (node[x].LeftChild == -1)
			return x;
		else
			return LeftIn(node[x].LeftChild);
	}

	public void find(int key) {
		if (find(root, key) == -1)
			System.out.println("no");
		else
			System.out.println("yes");
	}

	private int find(int x, int key) {
		if (x == -1)
			return -1;
		else if (node[x].key == key)
			return x;
		else if (key < node[x].key)
			return find(node[x].LeftChild, key);
		else
			return find(node[x].RightChild, key);
	}

	public void printPreorder() {
		printPre(root);
		System.out.println();
	}

	private void printPre(int id) {
		if (id == -1)
			return;
		System.out.print(" " + node[id].key);
		printPre(node[id].LeftChild);
		printPre(node[id].RightChild);
	}

	public void printInorder() {
		printIn(root);
		System.out.println();
	}

	private void printIn(int id) {
		if (id == -1)
			return;
		printIn(node[id].LeftChild);
		System.out.print(" " + node[id].key);
		printIn(node[id].RightChild);
	}

	public void insert(int i, int key) {
		node[i] = new Node(key);
		insert(i);
	}

	private void insert(int z) {
		int y = -1;
		int x = root;
		while (x != -1) {
			y = x;
			if (node[z].key < node[x].key)
				x = node[x].LeftChild;
			else
				x = node[x].RightChild;
		}
		node[z].Parent = y;

		if (y == -1)
			root = z;
		else if (node[z].key < node[y].key)
			node[y].LeftChild = z;
		else
			node[y].RightChild = z;
	}
}