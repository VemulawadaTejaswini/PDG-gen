import java.util.*;

class Node{
	int key;
	int parent = -1;
	int left = -1;
	int right = -1;
	public Node(int key){
		this.key = key;
	}
}

class Tree{
	Node[] nodes;
	int root = -1;

	public Tree(int n){
		nodes = new Node[n];
	}

	public void find(int key){
		find(root, key);
	}

	private void find(int x, int key){
		if(x == -1)
			System.out.println("no");
		else if(nodes[x].key == key)
			System.out.println("yes");
		else if(key < nodes[x].key)
			find(nodes[x].left, key);
		else
			find(nodes[x].right, key);
	}

	public void printPreorder(){
		printPre(root);
		System.out.println();
	}

	private void printPre(int id){
		if(id == -1)
			return;
		System.out.print(" " + nodes[id].key);
		printPre(nodes[id].left);
		printPre(nodes[id].right);
	}

	public void printInorder(){
		printIn(root);
		System.out.println();
	}

	private void printIn(int id){
		if(id == -1)
			return;
		printIn(nodes[id].left);
		System.out.print(" " + nodes[id].key);
		printIn(nodes[id].right);
	}

	public void insert(int i, int key){
		nodes[i] = new Node(key);
		insert(i);
	}

	private void insert(int z){
		int y = -1;
		int x = root;
		while(x != -1){
			y = x;
			if(nodes[z].key < nodes[x].key)
				x = nodes[x].left;
			else
				x = nodes[x].right;
		}
		nodes[z].parent = y;

		if(y == -1)
			root = z;
		else if(nodes[z].key < nodes[y].key)
			nodes[y].left = z;
		else
			nodes[y].right = z;
	}
}

public class Main{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Tree t = new Tree(n);

		for(int i = 0; i < n; i++){
			String s = scan.next();
			if(s.equals("insert"))
				t.insert(i, scan.nextInt());
			else if(s.equals("find"))
				t.find(scan.nextInt());
			else{
				t.printInorder();
				t.printPreorder();
			}
		}

		scan.close();
		System.exit(0);
	}
}