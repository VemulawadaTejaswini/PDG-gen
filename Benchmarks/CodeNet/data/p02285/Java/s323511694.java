import java.util.Scanner;

public class Main{
	static Node root;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			String com = scan.next();
			if(com.equals("insert")) {
				int k = scan.nextInt();
				insert(k);
			}else if(com.equals("find")){
				int k = scan.nextInt();
				Node t = find(k, root);
				if(t != null) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}else if(com.equals("delete")){
				int k = scan.nextInt();
				treeDelete(find(k, root));
			}else {
				inorder(root);
				System.out.println();
				preoder(root);
				System.out.println();
			}
		}
		scan.close();
	}
	static class Node{
		int key;
		Node parent, left, right;
		Node(int key){
			this.key = key;
		}
	}
	static void insert(int k) {
		Node y = null;
		Node x = root;
		Node z = new Node(k);
		while(x != null) {
			y = x;
			if(k < x.key) {
				x = x.left;
			}else {
				x = x.right;
			}
		}
		z.parent = y;
		if(y == null) {
			root = z;
		}else {
			if(z.key < y.key) {
				y.left = z;
			}else {
				y.right = z;
			}
		}
	}
	static Node find(int k, Node x) {
		while(x != null && k != x.key) {
			if(k < x.key) x = x.left;
			else x = x.right;
		}
		return x;
	}
	static Node treeMinimum(Node x) {
		while(x.left != null) x = x.left;
		return x;
	}
	// 次節点の探索
	static Node getSuccessor(Node x) {
		if(x.right != null) return treeMinimum(x.right);
		Node y = x.parent;
		while(y != null && x == y.right) {
			x = y;
			y = y.parent;
		}
		return y;
	}
	static void treeDelete(Node z) {
		Node y;	// 削除する対象
		Node x;	// yの子
		// 削除する節点を決める
		if(z.left == null || z.right == null) {
			y = z;
		}else {
			y = getSuccessor(z);
		}
		// yの子を決める
		if(y.left != null) {
			x = y.left;
		}else {
			x = y.right;
		}
		if(x != null) {
			x.parent = y.parent;
		}
		if(y.parent == null) {
			root = x;
		}else {
			if(y == y.parent.left) {
				y.parent.left = x;
			}else {
				y.parent.right = x;
			}
		}
		if(y != z) {
			z.key = y.key;
		}
	}
	static void inorder(Node u) {
		if(u == null) return;
		inorder(u.left);
		System.out.print(" " + u.key);
		inorder(u.right);
	}
	static void preoder(Node u) {
		if(u == null) return;
		System.out.print(" " + u.key);
		preoder(u.left);
		preoder(u.right);
	}
}
