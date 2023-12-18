//API???????????????
import java.util.Scanner;
import java.io.IOException;
class Main {
  	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		Tree tree = new Tree();
		for (int i = 0; i < m; i++) {
			String str = scan.next();
			if (str.equals("insert")) {
				int temp = scan.nextInt();
				Node node = new Node(temp);
				if (tree.root == null) {
					tree.root = node;
					continue;
				}
				insert(tree.root, node);
			}  else if (str.equals("find")) {
				int temp = scan.nextInt();
				Node node = find(tree.root, temp);
				if (node != null) System.out.println("yes");
				else System.out.println("no");
			} else if (str.equals("delete")) {
				int temp = scan.nextInt();
				Node node = find(tree.root, temp);
				if (node != null) delete(tree, node);
			}else if(str.equals("print")){
				print(tree.root);
			}
		}
	}
		
	public static Node find(Node node, int k) {
		while (node != null && node.id != k) {
			if (k < node.id) node = node.left;
			else node = node.right;
		}
		return node;
	}
		
	public static void insert(Node root, Node node) {
		Node parent = root;
		while (true) {
			if (node.id < parent.id) {
				if (parent.left == null) {
					parent.left = node;
					node.parent = parent;
					break;
				}
				parent = parent.left;
			} else {
				if (parent.right == null) {
					parent.right = node;
					node.parent = parent;
					break;
				}
				parent = parent.right;
			}
			}
	}
		
	public static void delete(Tree tree, Node node) {
		if (node.left == null && node.right == null) {
			if (node.parent == null) {
				tree.root = null;
				return;
			}
			if (node.parent.left == node) node.parent.left = null;
			else node.parent.right = null;
		} else if (node.left == null || node.right == null) {
			if (node.left != null) {
				if (node.parent == null) {
					tree.root = node.left;
					node.left.parent = null;
				} else {
					if (node.parent.left == node) node.parent.left = node.left;
					else node.parent.right = node.left;
					node.left.parent = node.parent;
				}
			} else {
				if (node.parent == null) {
					tree.root = node.right;
					node.right.parent = null;
				} else {
					if (node.parent.left == node) node.parent.left = node.right;
					else node.parent.right = node.right;
					node.right.parent = node.parent;
				}
			}
		} else {
			Node next = node.right;
			while (next.left != null) {
				next = next.left;
			}
			node.id = next.id;
			delete(tree, next);
		}
	}
	
	public static void print(Node root){
		StringBuilder sb = new StringBuilder();
		root.intermediateOrderCrawl(sb);
		System.out.println(sb.toString());
		sb = new StringBuilder();
		root.precedingOrderCrawl(sb);
		System.out.println(sb.toString());
	}
}	

class Tree {
	Node root;
}
		
class Node {
	int id;
	Node parent;
	Node left;
	Node right;
		
	Node(int id) {
		this.id = id;
	}
		
	void intermediateOrderCrawl(StringBuilder sb) {
		if (left != null) {
			left.intermediateOrderCrawl(sb);
		}
		sb.append(" " + String.valueOf(id));
		if (right != null) {
			right.intermediateOrderCrawl(sb);
		}
	}
		
	void precedingOrderCrawl(StringBuilder sb) {
		sb.append(" " + String.valueOf(id));
		if (left != null) {
			left.precedingOrderCrawl(sb);
		}
		if (right != null) {
			right.precedingOrderCrawl(sb);
		}
	}
}