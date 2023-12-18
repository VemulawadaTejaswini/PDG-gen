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
		int l = 0;
		for(int i = 0;i < n; i++){
			int id = scan.nextInt();
			int k = scan.nextInt();
			for(int j = 0;j < k; j++){
				int c = scan.nextInt();
				if(j == 0){
					node[id].left = c;
					l = c;
				}
				else{
					node[l].right = c;
					l = c;
				}
				node[c].parent = id;
			}
		}
		for(int j = 0;j < n; j++){
			System.out.print("node " + j + ": ");
			System.out.print("parent = " + node[j].parent + ", ");
			System.out.print("depth = " + nodes.getDepth(j) + ", ");
			
			if(node[j].parent == -1) System.out.print("root, ");
			else if(node[j].left == -1) System.out.print("leaf, ");
			else System.out.print("internal node, ");
			
			System.out.print("[");
			int c = node[j].left;
			while(c != -1){
				System.out.print(c);
				c = node[c].right;
				if(c != -1) System.out.print(", ");
			}
			System.out.println("]");
		}
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
	public int getDepth(int id){
		int d = 0;
		int u = nodes[id].parent;
		while(u != -1){
			u = nodes[u].parent;
			d++;
		}
		return d;
	}

}