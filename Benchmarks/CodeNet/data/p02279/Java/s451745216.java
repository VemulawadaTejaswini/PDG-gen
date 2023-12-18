import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String args[]) throws IOException{
		new Main().mainrun();
	}

	private BufferedReader br ;
	private int N,root;
	private Node[] L;

	private void mainrun() throws NumberFormatException, IOException{
		br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		L = new Node[N];

		root = 0;

		for(Integer i = 0;i < N;i++) {
			L[i] = new Node(-1,-1,0);
		}

		for(int i = 0;i < N;i++) {
			String[] str = br.readLine().split(" ");
			int id = Integer.parseInt(str[0]);
			L[id].id = id;

			L[id].setArray(Integer.parseInt(str[1]));

			for(int j = 0;j < Integer.parseInt(str[1]);j++) {
				int child = Integer.parseInt(str[j + 2]);

				L[child].parent = L[id].id;

				L[id].child[j] = child;
			}
		}

		rootDecision(0);

		putDepth(root);

		for(Node node : L) {
			node.print();
		}

		br.close();
	}

	private void rootDecision(int id) {
		if(L[id].parent != -1) {
			rootDecision(L[id].parent);
		}else {
			root = id;
		}
	}

	private void putDepth(int id) {
		for(Integer child : L[id].child) {
			L[child].depth = L[id].depth + 1;

			putDepth(child);
		}
	}
}

class Node{
	public int id,parent,depth;
	public Integer[] child;

	public Node(int id,int parent,int depth)
	{
		this.id = id;
		this.parent = parent;
		this.depth = depth;
	}

	public String type() {
		if(depth == 0) {
			return "root";
		}else if(child.length == 0) {
			return "leaf";
		}else {
			return "internal node";
		}
	}

	public void setArray(int n) {
		child = new Integer[n];
	}

	public void print() {
		System.out.printf("node %d: parent = %d, depth = %d, %s, [",
						   id, parent, depth, type());

		for(int i = 0;i < child.length;i++) {
			if(i == child.length -1) {
				System.out.print(child[i]);
			}else {
				System.out.print(child[i] + ", ");
			}
		}

		System.out.println("]");
	}
}

