import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class PathConnection {
	public PathNode to;
	public int weight;
	
	public PathConnection(PathNode to, int weight) {
		this.to = to;
		this.weight = weight;
	}
}

class PathNode {
	public int id;
//	public ArrayList<PathConnection> sources;
	public ArrayList<PathConnection> connections;
	
	public PathNode(int id) {
		this.id = id;
//		sources = new ArrayList<>();
		connections = new ArrayList<>();
	}
	
	public void addConnection(PathNode target, int weight) {
		connections.add(new PathConnection(target, weight));
	}
}

public class Main {
	public static int[] DijkstrasAlgorithm(PathNode[] nodes) {
		int[] minDist = new int[nodes.length];
		boolean[] settled = new boolean[nodes.length];
		
		//initialize all nodes besides minDist[0] to infinity
		minDist[0] = 0;
		for (int i = 1; i < minDist.length; i++) {
			minDist[i] = Integer.MAX_VALUE;
		}
		
		//our loop for dijkstras
		boolean shouldContinue = true;
		while(shouldContinue) {
			PathNode currentNode = null;
			int smallestIndex = -1;
			shouldContinue = false;
			//get index with smallest minDist so far
			for (int i = 0; i < minDist.length; i++) {
				if (settled[i] == false) {
					shouldContinue = true;//we should continue if at least one node isn't settled
					if (smallestIndex == -1 || minDist[i] < minDist[smallestIndex]) {
						smallestIndex = i;
					}
				}
			}
			
			if (!shouldContinue) break;
			
			//currentNode is the node with smallest minDist
			currentNode = nodes[smallestIndex];
			//go through every node connected to it
			Iterator<PathConnection> i = currentNode.connections.iterator();
			while (i.hasNext()) {
				PathConnection connection = i.next();
				minDist[connection.to.id] = Math.min(minDist[connection.to.id], minDist[currentNode.id]+connection.weight);
			}
			settled[currentNode.id] = true;
		}
		
		return minDist;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numNodes = scanner.nextInt();
		PathNode[] nodes = new PathNode[numNodes];
		
		//initialize nodes
		for (int i = 0; i < nodes.length; i++) {
			nodes[i] = new PathNode(i);
		}
		for (int i = 0; i < nodes.length; i++) {
			int id = scanner.nextInt();
			int numConnections = scanner.nextInt();
			//connections to other nodes with weights
			for (int j = 0; j < numConnections; j++) {
				int target = scanner.nextInt();
				int weight = scanner.nextInt();
				nodes[i].addConnection(nodes[target], weight);
			}
		}
		scanner.close();
		
		int[] results = DijkstrasAlgorithm(nodes);
		for (int i = 0; i < results.length; i++) {
			System.out.println(i + " " + results[i]);
		}
	}
}

