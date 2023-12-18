import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    static Node[] nodes;
    public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	nodes = new Node[n];
	for (int i = 0; i < n; i++) {
	    nodes[i] = new Node(i);
	}
	String[] input;
	int id, left, right;
	for (int i = 0; i < n; i++) {
	    input = br.readLine().split(" ");
	    id = Integer.parseInt(input[0]);
	    left = Integer.parseInt(input[1]);
	    right = Integer.parseInt(input[2]);
	    nodes[id].left = left;
	    nodes[id].right = right;
	    if (left != -1) {
		nodes[left].isRoot = false;
	    }
	    if (right != -1) {
		nodes[right].isRoot = false;
	    }
	}
	int rootId = -1;
	for (int i = 0; i < n; i++) {
	    if (nodes[i].isRoot) {
		rootId = i;
	    }
	}
        runPreorder(rootId);
	runInorder(rootId);
	runPostorder(rootId);
    }
    static void runPreorder (int id) {
	StringBuilder sb = new StringBuilder();
	sb.append("Preorder\n");
	preorder(id, sb);
	System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
    static void preorder (int id, StringBuilder sb) {
	if (id < 0) return;
	sb.append(nodes[id].id + " ");
	preorder(nodes[id].left, sb);
	preorder(nodes[id].right, sb);
    }
    static void runInorder (int id) {
	StringBuilder sb = new StringBuilder();
	sb.append("Inorder\n");
        inorder(id, sb);
	System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
    static void inorder (int id, StringBuilder sb) {
	if (id < 0) return;
	inorder(nodes[id].left, sb);
	sb.append(nodes[id].id + " ");
	inorder(nodes[id].right, sb);
    }
    static void runPostorder (int id) {
	StringBuilder sb = new StringBuilder();
	sb.append("Postorder\n");
	postorder(id, sb);
	System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
    static void postorder (int id, StringBuilder sb) {
	if (id < 0) return;
	postorder(nodes[id].left, sb);
	postorder(nodes[id].right, sb);
	sb.append(nodes[id].id + " ");
    }
}
class Node {
    int id;
    int left;
    int right;
    boolean isRoot;
    Node (int id) {
	this.id = id;
	isRoot = true;
    }
}