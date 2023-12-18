import java.util.Scanner;

class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String code;
		
		Tree tree = new Tree();
		int k;
		
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			code = scan.next();
			
			if(code.equals("insert")) {
				k = scan.nextInt();
				tree.insert(new Node(k));
			
			} else if(code.equals("print")) {
				tree.print(Tree.Order.Inorder);
				tree.print(Tree.Order.Preorder);
			}
		}
		
		scan.close();
	}

	public static class Tree {
 
		enum Order {Preorder, Inorder, Postorder}
	
		Node root;
	
		Node insert(Node node) {
			Node parent = null;
			Node child = root;
		
			while (child != null) {
				parent = child;
				if (node.key < child.key) child = child.left;
				else child = child.right;
			}
		
			node.parent = parent;
		
			if (parent == null) {
				this.root = node;
		
			} else if (node.key < parent.key) {
				parent.left = node;
		
			} else {
				parent.right = node;
			}
		
			return node;
		}
	
		void print(Order order) {
			switch (order) {
				case Preorder:
					walkPreorder(root);
					break;
				
				case Inorder:
					walkInorder(root);
					break;
				
				case Postorder:
					walkPostorder(root);
					break;
			}
			System.out.println();
		}
	
		void walkPreorder(Node node) {
			if (node == null) return;
		
			System.out.print(" " + node.key);
			walkPreorder(node.left);
			walkPreorder(node.right);
		}
	
		void walkInorder(Node node) {
			if (node == null) return;
		
			walkInorder(node.left);
			System.out.print(" " + node.key);
			walkInorder(node.right);
		}
	
		void walkPostorder(Node node) {
			if (node == null) return;
		
			walkPostorder(node.left);
			walkPostorder(node.right);
			System.out.print(" " + node.key);
		}
	}

	public static class Node {
		int key;
		Node parent, left, right;
	
		Node(int key) {
			this.key = key;
		}
	}
}