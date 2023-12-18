import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// ALDS1_8_A
public class Main {
	Node root = null;
	
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
	
	void postParse(Node node) {
		if (node == null) return;
		postParse(node.left);
		postParse(node.right);
		System.out.print(" " + node.number);
	}
	
	void insert(List T, Node node) {
		Node y = null;
		Node x = root;
		while (x != null) {
			y = x;
			if (node.number < x.number) x = x.left;
			else x = x.right;
		}
		node.parent = y;
		if (y == null) root = node;
		else if (node.number < y.number) y.left = node;
		else y.right = node;
	}
	
	void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Node> T = new LinkedList<Node>();
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			switch(str.charAt(0)) {
			case 'i':
				Node node = new Node(Integer.parseInt(str.split(" ")[1]));
				insert(T, node);
				break;
			case 'p':
				inParse(root);
				System.out.println();
				preParse(root);
				System.out.println();
				break;
			}
		}
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
