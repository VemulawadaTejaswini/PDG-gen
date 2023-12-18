import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class Node {
	public int id;
	public LinkedList<Node> sources;
	public LinkedList<Node> targets;
	
	public Node(int id) {
		this.id = id;
		sources = new LinkedList<>();
		targets = new LinkedList<>();
	}
}

public class Main {
	public static boolean[] visited = null;
	
	public static Stack<Integer> topologicalSort(Stack<Node> nodes, int overallLength) {
		Stack<Integer> result = new Stack<Integer>();
		boolean[] visited = new boolean[overallLength];
		
		//go up the graph
		while (!nodes.isEmpty()) {
			Node currentNode = nodes.pop();
			result.push(currentNode.id);
			visited[currentNode.id] = true;
			
			//go through sources. If we have visited all the targets, we can add it to stack
			for (int i = 0; i < currentNode.sources.size(); i++) {
				Node currentSource = currentNode.sources.get(i);
				boolean isGood = true;
				for (int j = 0; j < currentSource.targets.size(); j++) {
					if (!visited[currentSource.targets.get(j).id]) {
						isGood = false;
						break;
					}
				}
				
				if (isGood) nodes.push(currentSource);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numVerticies = scanner.nextInt();
		int numEdges = scanner.nextInt();
		Node[] nodes = new Node[numVerticies];
		visited = new boolean[numVerticies];
		
		//creating all nodes as empty
		for (int i = 0; i < numVerticies; i++) {
			nodes[i] = new Node(i);
		}
		
		//creating all relations to nodes
		for (int i = 0; i < numEdges; i++) {
			int source = scanner.nextInt();
			int target = scanner.nextInt();
			
			nodes[source].targets.add(nodes[target]);
			nodes[target].sources.add(nodes[source]);
		}
		scanner.close();
		
		//create Stack with only nodes that doesn't point to anything
		Stack<Node> rootNodes = new Stack<>();
		for (int i = 0; i < nodes.length; i++) {
			if (nodes[i].targets.isEmpty()) {
				rootNodes.push(nodes[i]);
			}
		}
		
		//topological sort
		Stack<Integer> results = topologicalSort(rootNodes, nodes.length);
		while (!results.isEmpty()) {
			System.out.println(results.pop());
		}
	}
}

