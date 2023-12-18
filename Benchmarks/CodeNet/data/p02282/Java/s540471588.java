import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Nodes mynodes = new Nodes();
		Node[] nodes = new Node[n];
		mynodes.nodes = nodes;
		for(int i = 0; i < n; i++)
			nodes[i] = new Node(i);

		int[] pre = new int[n];
		int[] in = new int[n];

		for(int i = 0; i < n; i++)
			pre[i] = scan.nextInt();
		for(int i = 0; i < n; i++)
			in[i] = scan.nextInt();

		for(int i = 1; i < n; i++){
			for(int j = 0; j < n; j++){
				if(in[j] == pre[i-1]){
					break;
				}else if(in[j] == pre[i]){
					mynodes.setLeft(pre[i-1], pre[i]);
					break;
				}
			}
		}

		for(int i = 1; i < n; i++){
			for(int j = 0; j < n; j++){
				if(pre[j] == in[i-1]){
					mynodes.setRight(in[i-1], mynodes.getRoot(in[i]));
					break;
				}else if(pre[j] == in[i]){
					break;
				}
			}
		}

		int root = 0;
		while(nodes[root].parent != -1)
			root = nodes[root].parent;

		mynodes.printPost(root);
		System.out.print("\n");
	}
}

class Node{
	int id;
	int parent, left, right;
	public Node(int id){
		this.id = id;
		this.parent = -1;
		this.left = -1;
		this.right = -1;
	}
}

class Nodes{

	Node[] nodes;

	public int getRoot(int id){
		if(nodes[id].parent == -1)
			return id;
		return getRoot(nodes[id].parent);
	}

	boolean first = true;

	public void printPost(int id){
		if(id == -1)
			return;
		printPost(nodes[id].left);
		printPost(nodes[id].right);
		if(first){
			System.out.print(id);
			first = false;
		}else{
			System.out.print(" " + id);
		}
	}

	public void setLeft(int id, int left){
		nodes[id].left = left;
		nodes[left].parent = id;
	}

	public void setRight(int id, int right){
		nodes[id].right = right;
		nodes[right].parent = id;
	}
}