import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class Node {
		int key;
		Node left;
		Node right;
		
		public Node(int key) {
			this.key = key;
		}
	}
	
	Node root;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			if(s.startsWith("i")) {
				insert(sc.nextInt());
			}else {
				inorder(root);
				System.out.println();
				preorder(root);
				System.out.println();
			}
		}
		sc.close();
	}
	
	void preorder(Node u) {
		if(u == null) return;
		System.out.print(" " + u.key);
		preorder(u.left);
		preorder(u.right);
	}
	
	void inorder(Node u) {
		if(u == null) return;
		System.out.print(" " + u.key);
		inorder(u.left);
		inorder(u.right);
	}
	
	void insert (int key) {
		Node y = null;
		Node x = root;
		Node z = new Node(key);
		while (x != null) {
			y = x;
			if(z.key < x.key) {
				x = x.left;
			} else {
				x = x.right;
			}
		}
		if(y == null) {
			root = z;
		} else if (z.key < y.key) {
			y.left = z;
		}else {
			y.right = z;
		}
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
