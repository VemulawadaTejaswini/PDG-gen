import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Queue;

class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1;
			int degree = in.nextInt();
			//System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt() - 1;
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
	}
	public void BFS() {
		//complete the following
		int[] distance = new int[totalVertex];
		boolean[] visited = new boolean[totalVertex];
		for(int i = 1; i < totalVertex; i++) {
			distance[i] = -1;
		}
		
		Queue<Integer> q1 = new LinkedList<Integer>();
		q1.add(0);
		while(!q1.isEmpty()) {
			int n = q1.poll();
			visited[n] = true;
			LinkedList<Integer> q2 = adjList.get(n);
			for(Integer neighbor:q2) {
				if(!visited[neighbor]) {
					q1.add(neighbor);
					int n1 = distance[n] + 1;
					distance[neighbor] = distance[neighbor] == -1 ? n1 : Math.min(distance[neighbor], n1);
				}
			}
		}
		for(int i = 0; i < totalVertex; i++) {
			System.out.println((i+1) + " " + distance[i]);
		}
	}
	
	
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.BFS();
	}
}

