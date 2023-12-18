import java.util.*;
import java.io.*;

public class Main {
	static class Node {
		int id = 0;
		Node left = NIL;
		Node right = NIL;
	}
	static Node NIL = new Node();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		
		Node[] tree = new Node[n + 1];
		tree[0] = NIL;
		NIL.id = 0;
		for (int i = 1; i < n + 1; i ++) {
			tree[i] = new Node();
		}
		int[] preorder = new int[n];
		int[] inorder = new int[n];
		int[] postorder = new int[n];
		
		for (int i = 0; i < n; i ++) {
			preorder[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i ++) {
			inorder[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		reci = 0;
		reconstruct(preorder, inorder, 0, n - 1, tree);
		
		postorder(tree[preorder[0]], postorder, 0);
		for (int i = 0; i < n - 1; i ++) {
			System.out.print(postorder[i]);
			System.out.print(" ");
		}
		System.out.println(postorder[n - 1]);
	}
	
	static int reci;
	static Node reconstruct(int[] preorder, int[] inorder, int left, int right, Node[] tree) {
		if (left > right) return NIL;
		Node root = tree[preorder[reci]];
		root.id = preorder[reci];
		
		int mid;
		for (mid = left; tree[inorder[mid]] != root; mid ++);
		reci ++;
		
		root.left = reconstruct(preorder, inorder, left, mid - 1, tree);
		root.right = reconstruct(preorder, inorder, mid + 1, right, tree);
		
		return root;
	}
	
	static int postorder(Node u, int[] postorder, int posti) {
		if (u == NIL) return posti;
		
		posti = postorder(u.left, postorder, posti);
		posti = postorder(u.right, postorder, posti);
		postorder[posti] = u.id;
		
		return posti + 1;
	}
} 

