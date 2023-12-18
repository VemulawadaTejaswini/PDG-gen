import java.util.Scanner;
public class A {
static Scanner s = new Scanner(System.in);
public static void main(String[] args) {
	int n = s.nextInt();
	Node[] nodes = new Node[n];
	StringBuilder sb = new StringBuilder();

	for(int i = 0;i < n;i++) {
		nodes[i] = new Node(i);
	}
	for(int i = 0;i < n;i++) {
		Node node = nodes[s.nextInt()];
		int k = s.nextInt();
		if(k > 0) {
			Node[] c = new Node[k];
			for(int j = 0;j < k;j++) {
				c[j] = nodes[s.nextInt()];
			}
			node.setCP(c);
		}
	}

	Node root = null;
	for(int i = 0;i < n;i++) {
	if(nodes[i].parent == null) {
		root = nodes[i];
		break;
	}
	}
	root.setDepth(0);
	for(int i = 0;i < n;i++) {
	sb.append("node " + i + ": parent = ");
	if(nodes[i].parent == null) {
		sb.append(-1);
	}else {
		sb.append(nodes[i].parent.id);
	}
	sb.append(", depth = " + nodes[i].dep + ", ");
	if(nodes[i].parent == null) {
		sb.append("root");
	}else {
		if(nodes[i].children == null) {
			sb.append("leaf");
		}else {
			sb.append("internal node");
		}
	}
	sb.append(", [");
	if(nodes[i].children != null) {
		for(int j = 0;j < nodes[i].children.length;j++) {
			sb.append(nodes[i].children[j].id);
			if(j == nodes[i].children.length-1) {
			sb.append("]");
			}else {
				sb.append(",");
			}
		}
	}else {
		sb.append("]");
	}
	sb.append("\n\r");
	}

	System.out.println(sb.toString());
	}
}

class Node{
	public int id;
	public int dep;
	public Node parent;
	public Node[] children;

	public Node(int id) {
	this.id = id;
	}

	void setCP(Node[] child) {
		this.children = child;
		for(int i = 0;i < children.length;i++) {
		this.children[i].parent = this;
		}
	}
	void setDepth(int d) {
		this.dep = d;
		if(this.children != null) {
		for(int i = 0;i < children.length;i++) {
			this.children[i].setDepth(d + 1);
		}
		}
	}


}
