import java.util.Scanner;

class Node{
	Integer parent = null;
	public Node(int v) {
		this.value = v;
	}
	int value = 0;
	Node left = null;
	Node right = null;
} 

public class Main {
	
	private static Scanner src;
	public static Node root;
	public static void main(String[] args) {
		src = new Scanner(System.in);
		int n = src.nextInt();
		for(int i = 0; i < n; i++) {
			String next = src.next();
			if(next.equals("insert")) {
				insert(root, src.nextInt());
			}
			else if(next.equals("find")) {
				System.out.println(find(root, src.nextInt()));
			}
			else if(next.equals("print")) {
				inorder(root); System.out.println();
				preorder(root); System.out.println();
			}
		}

	}
	private static String find(Node n, int v) {
		if(n == null) {return "no";}
		else if (n.value == v) {return "yes";}
		else if (v < n.value) {return find(n.left, v);}
		else {return find(n.right, v);}
	}
	private static void insert(Node n, int v) {
		if(n == null) {n = new Node(v); if(root == null) {root = n;} return;}
		if(v > n.value) { if(n.right == null ) { n.right = new Node(v);} else {insert(n.right, v);} }
		else { if(n.left == null ) { n.left = new Node(v);} else {insert(n.left, v);} }
		return;
	}

	private static void postorder(Node n) {
		if(n.left != null) postorder(n.left);
		if(n.right != null) postorder(n.right);
		System.out.print(" " + n.value);
	}
	private static void inorder(Node n) {
		if(n.left != null) inorder(n.left);
		System.out.print(" " + n.value);
		if(n.right != null) inorder(n.right);
	}
	private static void preorder(Node n) {
		System.out.print(" " + n.value);
		if(n.left != null) preorder(n.left);
		if(n.right != null) preorder(n.right);
	}
}

