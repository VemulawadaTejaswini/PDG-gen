
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BinaryTree tree = new BinaryTree();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		for(int i=0;i<count;i++) {
			String input = br.readLine();
			if(input.charAt(0) == 'i') {
				tree.insert(Long.parseLong(input.substring(7)));
			}else if(input.charAt(0) == 'f'){
				tree.find(Long.parseLong(input.substring(5)));
			}else if(input.charAt(0) == 'd'){
				tree.delete(Long.parseLong(input.substring(7)));
			}else{
				tree.inOrder(tree.root);
				System.out.println();
				tree.preOrder(tree.root);
				System.out.println();
			}
		}
	}
}

class BinaryTree {
	
	Node root;
	
	class Node{
		Node left;
		Node right;
		long value;
		public Node(long value) {
			super();
			this.value = value;
		}		
		
	}
	
	public void insert(long value) {
		Node node;
		Node parent = null;
		if(root == null) {
			root = new Node(value);
			return;
		}
		node = root;
		while(node !=null) {
			parent = node;
			if(node.value>value) {
				node = node.left;
			}else {
				node = node.right;
			}
		}
		
		node = new Node(value);
		if(parent.value>node.value) {
			parent.left = node;
		}else {
			parent.right = node;
		}
		
	}
	
	public void preOrder(Node n) {
		if(n == null) {
			return;
		}
		System.out.print(" "+n.value);
		preOrder(n.left);
		preOrder(n.right);
	}
	
	public void inOrder(Node n) {
		if(n == null) {
			return;
		}
		inOrder(n.left);
		System.out.print(" "+n.value);
		inOrder(n.right);
	}
	
	public void find(long value) {
		Node n = root;
		while(n!=null) {
			if(n.value==value) {
				System.out.println("yes");
				return ;
			}else if(n.value>value) {
				n = n.left;
			}else {
				n = n.right;
			}
		}
		System.out.println("no");
	}
	
	public void delete(long value) {
		Node parent = null;
		Node child = root;
		while(child!=null&&child.value!=value) {
			parent = child;
			if(child.value>value) {
				child = parent.left;
			}else {
				child = parent.right;
			}
		}
		if(child.left == null) {
			if(child.value<parent.value) {
				parent.left = child.right;
			}else {
				parent.right = child.right;
			}
		}else if(child.right == null) {
			if(child.value<parent.value) {
				parent.left = child.left;
			}else {
				parent.right = child.left;
			}
		}else {
			parent = child;
			Node next = child.right;
			while(next.left!=null) {
				parent = next;
				next = next.left;
			}
			child.value = next.value;
			if(next.value<parent.value) {
				parent.left = next.right;
			}else {
				parent.right = next.right;
			}
		}
	}
	
	

}

