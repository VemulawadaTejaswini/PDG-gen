import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numOfVertex = scanner.nextInt();
		int numOfEdge = scanner.nextInt();
		int source = scanner.nextInt();
		int[][] weightedAdjacencyMatrix = new int[numOfVertex][numOfEdge];
		
		for(int i=0; i<numOfEdge; i++) {
			int s = scanner.nextInt();
			int t = scanner.nextInt();
			int weight = scanner.nextInt();
			
			weightedAdjacencyMatrix[s][t] = weightedAdjacencyMatrix[t][s] = weight;
		}
		
		int[][] shortestPathMatrix = new int[numOfVertex][numOfEdge];
		final int INF = 100000000;
		for(int i=0; i<numOfVertex; i++) {
			for(int j=i+1; j<numOfVertex; j++) {
				int cost = weightedAdjacencyMatrix[i][j];
				shortestPathMatrix[i][j] = shortestPathMatrix[j][i] = (cost>0) ? cost : INF;
			}
		}
		
		for(int k=0; k<numOfVertex; k++) {
			for(int i=0; i<numOfVertex; i++) {
				for(int j=0; j<numOfVertex; j++) {
					int distance = shortestPathMatrix[i][k] + shortestPathMatrix[k][j];
	                    if (distance <  shortestPathMatrix[i][j]) {
	                    	 shortestPathMatrix[i][j] = distance;
	                    }
				}
			}
		}
		
		for(int i=0; i<numOfVertex; i++) {
			if(i!=0) System.out.print(" ");
			String cost = shortestPathMatrix[source][i]!=INF ? String.valueOf(shortestPathMatrix[source][i]) : "INF";
			System.out.print(cost);
		}
		System.out.println();
		
		scanner.close();
	}

}