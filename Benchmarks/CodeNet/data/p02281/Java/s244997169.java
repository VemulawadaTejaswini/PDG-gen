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
	}
        runPreorder();
	runInorder();
	runPostorder();
    }
    static void runPreorder () {
	StringBuilder sb = new StringBuilder();
	sb.append("Preorder\n");
	preorder(0, sb);
	System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
    static void preorder (int id, StringBuilder sb) {
	if (id < 0) return;
	sb.append(nodes[id].id + " ");
	preorder(nodes[id].left, sb);
	preorder(nodes[id].right, sb);
    }
    static void runInorder () {
	StringBuilder sb = new StringBuilder();
	sb.append("Inorder\n");
        inorder(0, sb);
	System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
    static void inorder (int id, StringBuilder sb) {
	if (id < 0) return;
	inorder(nodes[id].left, sb);
	sb.append(nodes[id].id + " ");
	inorder(nodes[id].right, sb);
    }
    static void runPostorder () {
	StringBuilder sb = new StringBuilder();
	sb.append("Postorder\n");
	postorder(0, sb);
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
    Node (int id) {
	this.id = id;
	left = -1;
	right = -1;
    }
}