import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Node root = new Node();
	TreeWalker walker = new TreeWalker();
	int n = Integer.parseInt(br.readLine());
	String[] input;
	for (int i = 0; i < n; i++) {
	    input = br.readLine().split(" ");
	    if (input.length == 1) {
		walker.runPrintInorder(root.right);
		walker.runPrintPreorder(root.right);
	    } else if (input.length == 2) {
		root.insert (root, Integer.parseInt(input[1]));
	    }
	}
	
    }
}
class Node {
    int key;
    Node left;
    Node right;
    Node () {
	key = 2000000001 * (-1);
	left = null;
	right = null;
    }
    Node (int key) {
	this.key = key;
	left = null;
	right = null;
    }
    void insert (Node root, int key) {
	Node node = root;
	Node parent = null;
	while (node != null) {
	    parent = node;
	    if (key < node.key) {
		node = node.left;
	    } else {
		node = node.right;
	    }
	}
	if (parent == null) {
	    parent = new Node (key);
	} else if (key < parent.key) {
	    parent.left = new Node (key);
	} else {
	    parent.right = new Node (key);
	}
    }
}
class TreeWalker {
    void runPrintInorder (Node root) {
	StringBuilder sb = new StringBuilder();
	printInorder(root, sb);
	System.out.println(sb);
    }
    void printInorder (Node node, StringBuilder sb) {
	if (node == null) {
	    return;
	}
	printInorder(node.left, sb);
	sb.append(" " + node.key);
	printInorder(node.right, sb);
    }
    void runPrintPreorder (Node root) {
	StringBuilder sb = new StringBuilder();
	printPreorder(root, sb);
	System.out.println(sb);
    }
    void printPreorder (Node node, StringBuilder sb) {
	if (node == null) {
	    return;
	}
	sb.append(" " + node.key);
	printPreorder(node.left, sb);
	printPreorder(node.right, sb);
    }
}