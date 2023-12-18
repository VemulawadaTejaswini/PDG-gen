import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// ALDS1_7_D
public class Main {
	Node root = null;
	int key = 0;
	void preParse(Node node) {
		if (node == null) return;
		System.out.print(" " + node.number);
		preParse(node.left);
		preParse(node.right);
	}
	
	void inParse(Node node) {
		if (node == null) return;
		inParse(node.left);
		System.out.print(" " + node.number);
		inParse(node.right);
	}
	
	void postParse(Node node, StringBuilder build) {
		if (node == null) return;
		postParse(node.left, build);
		postParse(node.right, build);
		build.append(" " + node.number);
	}
	
	void reTree(Node parent, int[] pre, int[] in, int pinindex, int left, int right) {
		// System.out.println("key:"+key + ", left:" + left + ", right:" + right);
		if (key > pre.length-1) return;
		if (left > right) return;
		int inkey = -1;
		for (int i = left; i <= right; i++) {
			if (pre[key] == in[i]) {
				inkey = i;
			}
		}
		if (inkey == -1) {
			return;
		}
		Node node = new Node(pre[key]);
		if (parent == null) {
			root = node;
		} else if (pinindex > inkey) {
			parent.left = node;
		} else {
			parent.right = node;
		}
		key++;
		reTree(node, pre, in, inkey, left, inkey-1);
		reTree(node, pre, in,  inkey, inkey+1, right);
	}
	
	void run() throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] pre = new int[n];
		int[] in = new int[n];
		// preorder
		for (int i = 0; i < n; i++) {
			pre[i] = sc.nextInt();
			
		}
		// inorder
		for (int i = 0; i < n; i++) {
			in[i] = sc.nextInt();
		}
		reTree(null, pre, in, -1, 0, pre.length-1);
		StringBuilder build = new StringBuilder();
		postParse(root, build);
		build.deleteCharAt(0);
		System.out.println(build);
		sc.close();
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}

class Node {
	int number;
	Node parent = null;
	Node left = null;
	Node right = null;
	Node(int number) {
		this.number = number;
	}
}
