
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BinaryTree tree = new BinaryTree();
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		for(int i=0;i<count;i++) {
			String input = br.readLine();
			if(input.charAt(0) == 'i') {
				tree.insert(Long.parseLong(input.substring(7)));
			}else if(input.charAt(0) == 'f'){
				tree.find(Long.parseLong(input.substring(5)));
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
	
	/*
	 * public void insert(Node node, long value) { if(root == null) { root = new
	 * Node(value); return; } if(node.value>value) { if(node.left == null) {
	 * node.left = new Node(value); }else { insert(node.left,value); } }else {
	 * if(node.right == null) { node.right = new Node(value); }else {
	 * insert(node.right,value); } } }
	 */
	
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
	//t root  x=node y=parent
	
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
				return;
			}
			if(n.value>value) {
				n = n.left;
			}else {
				n = n.right;
			}
		}
		System.out.println("no");
	}
	

}

