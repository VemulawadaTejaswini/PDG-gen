import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

// ALDS1_7_A
public class Main {
	void searchDepth(Node[] tree, int i, int n) {
		tree[i].depth = n;
		for (Integer k : tree[i].childs) {
			searchDepth(tree, k, n+1);
		}
	}
	
	void run() throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node[] tree = new Node[n];
		for (int i = 0; i < n; i++) {
			tree[i] = new Node(i);
		}
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			int k = sc.nextInt();
			List<Integer> lis = new ArrayList<Integer>();
			for (int j = 0; j < k; j++) {
				int child = sc.nextInt();
				tree[child].parent = number;
				lis.add(child);
			}
			tree[number].childs = lis;
			if (lis.isEmpty()) tree[number].type = "leaf";
			else tree[number].type = "internal node";
		}
		// search root
		int root = 0;
		for (int i = 0; i < tree.length; i++) {
			if (tree[i].parent == -1) {
				tree[i].type = "root";
				root = i;
			}
		}
		searchDepth(tree, root, 0);
		for (int i = 0; i < n; i++) {
			tree[i].print();
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}

class Node {
	int number;
	int parent = -1;
	int depth;
	String type;
	List<Integer> childs;
	Node(int number) {
		this.number = number;
	}
	
	void print() {
		System.out.println("node " + number + ": parent = " + parent + ", depth = " + depth + ", " + type + ", " + childs);
	}
}
