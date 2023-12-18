import java.util.Scanner;

class Node {
	public int id;
	public int startTime = -1;
	public int finishTime = -1;
	int[] childrenIds;
	public Node[] children;
	
	public Node(int id, int[] children) {
		this.id = id;
		this.childrenIds = children;
		this.children = new Node[children.length];
	}
	
	public void getChildrenNodes(Node[] list) {
		for (int i = 0; i < this.childrenIds.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (this.childrenIds[i] == list[j].id) {
					this.children[i] = list[j];
				}
			}
		}
	}
}

public class Main {
	public static int currTime = 0;
	
	public static void traverseNode(Node node) {
		if (node.startTime != -1) return;
		
		node.startTime = currTime;
		
		for (int i = 0; i < node.children.length; i++) {
			if (node.children[i].startTime == -1) {
				currTime += 1;
				traverseNode(node.children[i]);
			}
		}
		
		currTime += 1;
		node.finishTime = currTime;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numNodes = scanner.nextInt();
		Node[] nodes = new Node[numNodes];
		
		//create our graph
		for (int i = 0; i < numNodes; i++) {
			int id = scanner.nextInt();
			int numChildren = scanner.nextInt();
			int[] children = new int[numChildren];
			
			for (int j = 0; j < numChildren; j++) {
				children[j] = scanner.nextInt();
			}
			nodes[i] = new Node(id, children);
		}
		scanner.close();
		
		//first get children nodes of each node
		for (int i = 0; i < nodes.length; i++) {
			nodes[i].getChildrenNodes(nodes);
		}
		
		//traverse the nodes
//		traverseNode(nodes[0]);
		for (int i = 0; i < nodes.length; i++) {
			if (nodes[i].startTime == -1) currTime += 1;
			traverseNode(nodes[i]);
		}
		
		//say that we're done
		for (int i = 0; i < nodes.length; i++) {
			System.out.println(nodes[i].id + " " + nodes[i].startTime + " " + nodes[i].finishTime);
		}
	}
}

