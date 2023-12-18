import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node[] nodes = new Node[n];
		for (int i = 0; i < n; i++) {
		    nodes[i] = new Node(i);
		}
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    int left = sc.nextInt();
		    int right = sc.nextInt();
		    nodes[x].left = left;
		    nodes[x].right = right;
		    if (left >= 0) {
		        nodes[left].parent = x;
		    }
		    if (right >= 0) {
		        nodes[right].parent = x;
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (Node x : nodes) {
		    if (x.parent == -1) {
		        sb.append("Preorder\n");
		        set(nodes, x.idx, sb, 0);
		        sb.append("\nInorder\n");
		        set(nodes, x.idx, sb, 1);
		        sb.append("\nPostorder\n");
		        set(nodes, x.idx, sb, 2);
		        break;
		    }
		}
		System.out.println(sb);
	}
	
	static void set(Node[] nodes, int idx, StringBuilder sb, int type) {
	    if (type == 0) {
	        sb.append(" ").append(idx);
	    }
	    if (nodes[idx].left >= 0) {
	        set(nodes, nodes[idx].left, sb, type);
	    }
	    if (type == 1) {
	        sb.append(" ").append(idx);
	    }
	    if (nodes[idx].right >= 0) {
	        set(nodes, nodes[idx].right, sb, type);
	    }
	    if (type == 2) {
	        sb.append(" ").append(idx);
	    }
	}
	
	static class Node {
	    int idx;
	    int parent;
	    int left;
	    int right;

	    public Node(int idx) {
	        this.idx = idx;
	        parent = -1;
	        left = -1;
	        right = -1;
	    }
	}
}

