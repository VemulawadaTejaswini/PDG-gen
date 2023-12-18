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
