import java.util.Scanner;

public class Main {
	final boolean DEBUG = false;
	class Node {
		int key;
		Node p, l, r;
		Node(int key) {
			this.key = key;
		}
		void insert(Node z) {
			Node y = null;
			Node x = this;
			while (x != null) {
				y = x;
				if (z.key < x.key)
					x = x.l;
				else
					x = x.r;
			}
			z.p = y;
			
			if (z.key < y.key)
				y.l = z;
			else
				y.r = z;
		}

		void delete(int key) {
			Node z = this;
			while (z != null) {
				if (key == z.key)
					break;
				if (key < z.key)
					z = z.l;
				else
					z = z.r;
			}
			Node y = z.p;
			if (z.l == null && z.r == null)
				if (key < y.key)
					y.l = null;
				else
					y.r = null;
			else if (z.l != null && z.r != null) {
				z.key = z.l.key;
				z.l.delete(z.l.key);
			} else {
				if (z.l != null) {
					if (key < z.key)
						y.l = z.l;
					else
						y.r = z.l;
					z.l.p = y;
				} else {
					if (key < z.key)
						y.l = z.r;
					else
						y.r = z.r;
					z.r.p = y;
				}
			}
		}

		boolean find(int key) {
			Node x = this;
			while (x != null) {
				if (key == x.key)
					return true;
				else if (key < x.key)
					x = x.l;
				else
					x = x.r;
			}
			return false;
		}
		void print() {
			this.inorder();
			System.out.println();
			this.preorder();
			System.out.println();
		}
		void preorder() {
			System.out.print(" " + this.key);
			if (this.l != null)
				this.l.preorder();
			if (this.r != null)
				this.r.preorder();
		}
		void inorder() {
			if (this.l != null)
				this.l.inorder();
			System.out.print(" " + this.key);
			if (this.r != null)
				this.r.inorder();
		}
	}
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Node t = null;
		for (int i = 0; i < n; i++) {
			String inst = scan.next();
			// set a root node
			if (i == 0) {
				int key = scan.nextInt();
				t = new Node(key);
				continue;
			}
			
			switch(inst) {
			case "insert":
				int key = scan.nextInt();
				if (DEBUG)
					System.out.println("insert: " + key);
				t.insert(new Node(key));
				break;
			case "find":
				int findKey = scan.nextInt();
				if (DEBUG)
					System.out.println("find: " + findKey);
				System.out.println(t.find(findKey) ? "yes" : "no");
				break;
			case "delete":
				int delKey = scan.nextInt();
				if (DEBUG)
					System.out.println("find: " + delKey);
				t.delete(delKey);
				break;
			case "print":
				if (DEBUG)
					System.out.println("print");
				t.print();
				break;
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}

