//API???????????????
import java.util.Scanner;
import java.io.IOException;
class Main {
  	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Nodes nodes = new Nodes();
		Node[] node = new Node[n];
		nodes.nodes = node;
		for(int i = 0;i < n;i++){
			node[i] = new Node(i);
		}
		
		for(int i = 0;i < n; i++){
			int id = scan.nextInt();
			int left = scan.nextInt();
			int right = scan.nextInt();
			if(left != -1){
				node[id].left = left;
				node[left].parent = id;
			}
			if(right != -1) {
				node[id].right = right;
				node[right].parent = id;
			}
		}
		
		int root = 0;
		
		while(node[root].parent != -1){
			root = node[root].parent;
		}
		
		System.out.println("Preorder");
		nodes.Preorder(root);
		System.out.println("\r\nInorder");
		nodes.Inorder(root);
		System.out.println("\r\nPostorder");
		nodes.Postorder(root);
		System.out.println();
	}
}

class Node{
	int id;
	int parent = -1;
	int left = -1;
	int right = -1;
	public Node(int id) {
		this.id = id;
	}
}

class Nodes{
	/*
	List<Node> nodes;
	/*/
	Node[] nodes;
	/**/
	
	public void Preorder(int id){
		
		if(id == -1){
			return;
		}
		System.out.print(" " + id);
		Preorder(nodes[id].left);
		Preorder(nodes[id].right);
	}
	
	public void Inorder(int id){
		if(id == -1){
			return;
		}
		Inorder(nodes[id].left);
		System.out.print(" " + id);
		Inorder(nodes[id].right);
	}

	public void Postorder(int id){
		if(id == -1){
			return;
		}
		Postorder(nodes[id].left);
		Postorder(nodes[id].right);
		System.out.print(" " + id);
	}
}