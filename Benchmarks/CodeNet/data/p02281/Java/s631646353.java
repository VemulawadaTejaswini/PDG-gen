import java.util.Scanner;

class Node{
	int parent = -1;
	String type = "";
	int left = -1;
	int right = - 1;
} 

public class Main {
	
	private static Scanner src;
	public static Node[] tree;
	public static void main(String[] args) {
		src = new Scanner(System.in);
		int n = src.nextInt();
		tree = new Node[n];
		for(int i = 0; i < n; i++) tree[i] = new Node(); 
		for(int i = 0; i < n; i++) {
			int id = src.nextInt(); 
			Integer lc = src.nextInt(), rc = src.nextInt();
				tree[id].left = lc;
				tree[id].right = rc;
				if(lc != -1) tree[lc].parent = id;
				if(rc != -1) tree[rc].parent = id;
		}
		for(int i = 0; i < n; i++) {
			if(tree[i].parent == -1) {
				treeWalk(i);
				break;
			}
		}
	}
	private static void treeWalk(int root) {
		System.out.println("Preorder");
		preorder(root); System.out.println();
		System.out.println("Inorder");
		inorder(root); System.out.println();
		System.out.println("Postorder");
		postorder(root); System.out.println();
	}
	private static void postorder(int root) {
		if(tree[root].left != -1) postorder(tree[root].left);
		if(tree[root].right != -1) postorder(tree[root].right);
		System.out.print(" " + root);
	}
	private static void inorder(int root) {
		if(tree[root].left != -1) inorder(tree[root].left);
		System.out.print(" " + root);
		if(tree[root].right != -1) inorder(tree[root].right);
	}
	private static void preorder(int root) {
		System.out.print(" " + root);
		if(tree[root].left != -1) preorder(tree[root].left);
		if(tree[root].right != -1) preorder(tree[root].right);
	}
}

