import java.util.LinkedList;
import java.util.Scanner;

class Node {
	public int id;
	public int[] childrenIds;
	public Node[] children;
	public Node parent;
	public int level = 0;
	
	public Node(int id, int[] childrenIds) {
		this.id  = id;
		this.childrenIds = childrenIds;
		this.children = new Node[childrenIds.length];
	}
	
	//puts children in 'children'
	public void putChildren(Node[] nodes) {
		for (int i = 0; i < childrenIds.length; i++) {
			for (int j = 0; j < nodes.length; j++) {
				if (childrenIds[i] == nodes[j].id) {
					children[i] = nodes[j];
					nodes[j].parent = this;
				}
			}
		}
	}
}

public class Main {
	public static int findDistance(Node start, Node end, Node[] allNodes) {
		LinkedList<Node> queue = new LinkedList<>();
		boolean[] visited = new boolean[allNodes.length+1];
		queue.add(start);
		Node currentNode = null;
		int level = 0;
		start.level = level;
		
		//find thing using BFS
		while (!queue.isEmpty()) {
			currentNode = queue.removeFirst();
			visited[currentNode.id] = true;
			
			if (currentNode == end) return currentNode.level;
			
//			for (int i = 0; i < currentNode.children.length; i++) {
//				if (!visited[currentNode.children[i].id]) {
//					queue.add(currentNode.children[i]);
//				}
//			}
			
			Node[] children = currentNode.children;
			for (int i = 0; i < children.length; i++) {
//				if (children[i].id == end.id) return currentNode.level+1;
				
				if (!visited[children[i].id]) {
					queue.add(children[i]);
					children[i].level = currentNode.level+1;
					visited[children[i].id] = true;
				}
			}
			
//			if (!queue.isEmpty()) System.out.println(queue.getFirst().id);
			
//			level++;
		}
		
		//use parents to trace to start
//		while (currentNode != start) {
//			currentNode = currentNode.parent;
//			
//		}
		
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numNodes = scanner.nextInt();
		Node[] nodes = new Node[numNodes];
		
		//load up nodes
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
		
		//put children in nodes
		for (int i = 0; i < nodes.length; i++) {
			nodes[i].putChildren(nodes);
		}
		
		//use breadth first search to find the route from node 1 to all other nodes
		for (int i = 0; i < nodes.length; i++) {
			System.out.println(nodes[i].id + " " + findDistance(nodes[0], nodes[i], nodes));
		}
//		System.out.println(findDistance(nodes[0], nodes[2]));
	}
}

