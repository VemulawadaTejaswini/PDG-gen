import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nodeCount = sc.nextInt();
		
		int[][] edges = new int[nodeCount][nodeCount];
		//each row is that node's edges
		
		//fill the edges array
		for(int i = 0; i < nodeCount; i++) {
			int node = sc.nextInt();
			int edgeCount = sc.nextInt();
			for(int j = 0; j < edgeCount; j++) {
				edges[i][sc.nextInt()-1] = 1;
			}
		}
		
		int[] visited = new int[nodeCount];
		int[] answers = new int[nodeCount];
		for(int i = 0; i < nodeCount; i++) {
			answers[i] = -1;
		}
		
		Queue<Integer> curQ = new LinkedList<>();
		Queue<Integer> nextQ = new LinkedList<>();
		
		
		//do the thing
		int row = 0;
		curQ.add(0);
		visited[0] = 1;
		answers[0] = 0;
		int round = 1;
		while(curQ.peek() != null) {
			//use curQ to make nextQ, update visited, update answers
			while(curQ.peek() != null) {
				row = curQ.remove();
				for(int i = 0; i < nodeCount; i++) {
					if(edges[row][i] == 1 && visited[i] == 0){
						nextQ.add(i);
						visited[i] = 1;
						answers[i] = round;
					}
				}
			}
			//transfer nextQ to curQ
			while(nextQ.peek() != null) {
				curQ.add(nextQ.remove());
			}
			round++;
		}
		
		
		for(int i = 0; i < answers.length; i++) {
			System.out.println((i + 1) + " " + answers[i]);
		}
		sc.close();
	}
	
}

