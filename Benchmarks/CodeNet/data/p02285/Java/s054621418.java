import java.util.*;
import java.io.*;

public class Main {
	static class Node {
		int key = 0;
		Node parent = NIL;
		Node left = NIL;
		Node right = NIL;
	}
	static Node NIL = new Node();
	
	static class Tree {
		Node root = NIL;
	}
	
	public static void main(String[]  args) {
		int m = nextInt();
		
		Tree tree = new Tree();
		
		for (int i = 0; i < m; i ++) {
			next();
			switch (nextbuf[0]) {
				case 'i':
					insert(tree, nextInt());
					break;
				case 'f':
					int key = nextInt();
					System.out.println((find(tree, key).key == key) ? "yes": "no");
					break;
				case 'd':
					delete(tree, nextInt());
					break;
				default:
					inorder(tree.root);
					System.out.println();
					preorder(tree.root);
					System.out.println();
					break;
			}
		}
	}
	
	static void insert(Tree tree, int key) {
		Node z = new Node();
		z.key = key;
		Node y = NIL;
		
		y = find(tree, key);
		
		if (y == NIL) {
			tree.root = z;
		} else if (z.key < y.key) {
			y.left = z;
			z.parent = y;
		} else {
			y.right = z;
			z.parent = y;
		}
	}
	
	static Node find(Tree tree, int key) {
		Node x = tree.root;
		Node y = NIL;

		while (x != NIL) {
			y = x;
			if (key == x.key) break;
			x = (key < x.key) ? x.left: x.right;
		}
		return y;
	}
	
	static void delete(Tree tree, int key){
		Node z = find(tree, key);
		if (z == NIL) return;
		
		Node y;
		if (z.left == NIL || z.right == NIL) {
			y = z;
		} else {
			for (y = z.right; y.left != NIL; y = y.left);
		}
		
		Node x = (y.left != NIL) ? y.left: y.right;
		if (x != NIL) x.parent = y.parent;
		
		if (y.parent == NIL) {
			tree.root = x;
		} else if (y == y.parent.left) {
			y.parent.left = x;
		} else {
			y.parent.right = x;
		}
		
		if (y != z) z.key = y.key;
	}

	static void preorder(Node u) {
		if (u == NIL) return;

		System.out.print(" ");
		System.out.print(u.key);
		preorder(u.left);
		preorder(u.right);
	}

	static void inorder(Node u) {
		if (u == NIL) return;

		inorder(u.left);
		System.out.print(" ");
		System.out.print(u.key);
		inorder(u.right);
	}
	
	private static byte[] buf = new byte[1 << 20];
	private static int len = 0;
	private static int ptr = 0;

	private static byte read() {
		if (ptr >= len) {
			try {
				len = System.in.read(buf);
			} catch (Exception e) {
			}
			ptr = 0;
		}

		return buf[ptr++];
	}

	private static int nextInt() {
		int num = 0;

		byte b = read();
		while(!Character.isDigit(b) && b != '-') b = read();
		int sign;
		if (b == '-') {
			sign = -1;
			b = read();
			if (!Character.isDigit(b)) return 0;
		} else {
			sign = 1;
		}
		
		while(Character.isDigit(b)) {
			num *= 10;
			num += sign * (b - '0');
			b = read();
		}
		
		return num;
	}

	private static byte[] nextbuf = new byte[11];
	private static int nextlen;

	private static void next() {
		nextlen = 0;

		byte b = read();
		while(!Character.isAlphabetic(b) && !Character.isDigit(b)) b = read();
		while(Character.isAlphabetic(b) || Character.isDigit(b)) {
			nextbuf[nextlen++] = b;
			b = read();
		}
	}
} 

