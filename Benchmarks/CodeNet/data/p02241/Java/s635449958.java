import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		int[][] matrix = new int[amount][amount];
		int[] visited = new int[amount];
		int weight = 0;
		visited[0] = 0;
		
		for(int i = 0; i < amount; i++) {
			for(int j = 0; j < amount; j++) {
				int num = input.nextInt();
				matrix[i][j] = num;
			}
		}
		input.close();
		for(int i = 1; i < amount; i++) {
			int[] result = findMin(matrix, visited);
			visited[i] = result[2];
			weight += result[0];
		}
		System.out.println(weight);
	}
	public static int[] findMin(int[][] matrix, int[] visited) {
		int row = 0;
		int vertex = 0;
		int min = matrix[visited[0]][1];
		
		for(int i = 0; i < visited.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(!contains(visited, j)) {
					if(matrix[visited[i]][j] < min && matrix[visited[i]][j] != -1) {
						min = matrix[visited[i]][j];
						row = visited[i];
						vertex = j;
					}
				}
			}
		}
		return new int[] {min, row, vertex};
	}
	public static boolean contains(int[] visited, int num) {
		for(int i = 0; i < visited.length; i++) {
			if(visited[i] == num)
				return true;
		}
		return false;
	}
}

