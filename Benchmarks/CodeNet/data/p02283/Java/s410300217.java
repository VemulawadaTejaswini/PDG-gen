import java.util.Scanner;

class Node {
	Node() {
		this.value = -1;
		this.leftNode = null;
		this.rightNode = null;
	}
	public int value;
	public Node leftNode;
	public Node rightNode;
}

public class Main{

	public static Node root = null;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = new Integer(s.nextLine()).intValue();
		for(int i=0 ; i<cnt ; i++) {
			String[] tmp = s.nextLine().split(" ");
			if("insert".equals(tmp[0])) {
				Node n = new Node();
				n.value = new Integer(tmp[1]).intValue();
				insert(n);
			}else {
				inorder(root);
				System.out.println();
				preorder(root);
			}
		}
	}

	public static void insert(Node node) {
		if(root==null){
			root = node;
			return;
		}
		Node targetNode = root;
		Node parent = null;
		while(targetNode != null) {
			parent = targetNode;
			if(targetNode.value > node.value)
				targetNode = targetNode.leftNode;
			else
				targetNode = targetNode.rightNode;
		}
		if(parent.value > node.value)
			parent.leftNode = node;
		else
			parent.rightNode = node;
	}

	public static void preorder(Node root) {
		System.out.print(" " + root.value);
		if(root.leftNode != null)
			preorder(root.leftNode);
		if(root.rightNode != null)
			preorder(root.rightNode);
	}

	public static void inorder(Node root) {
		if(root.leftNode != null)
			inorder(root.leftNode);
		System.out.print(" " + root.value);
		if(root.rightNode != null)
			inorder(root.rightNode);
	}
}