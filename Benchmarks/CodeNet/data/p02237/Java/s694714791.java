

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] myGraph = new int[n][n]; //assume nxn
		
		int currentVertex;
		int degree;
		
		
		for (int j = 0; j < n; j++) {
			currentVertex = in.nextInt();
			degree = in.nextInt();
			for (int i = 0; i < degree; i++) {
				myGraph[currentVertex-1][in.nextInt()-1] = 1;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j != 0) System.out.print(" ");
				System.out.print(myGraph[i][j]);
				
			}
			System.out.println();
		}
	}
}

