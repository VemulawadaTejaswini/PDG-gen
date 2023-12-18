import java.util.Arrays;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		while(true) {
			Scanner s = new Scanner(System.in);
			String[] line = s.nextLine().split(" ");
			if(Integer.parseInt(line[0]) == 0 && Integer.parseInt(line[1]) == 0)
				break;
			int[][] vertexs = new int[Integer.parseInt(line[0]) + 1][Integer.parseInt(line[0]) + 1];
			for(int i=0 ; i<Integer.parseInt(line[1]) ; i++) {
				String[] lines = s.nextLine().split(" ");
				if(Integer.parseInt(lines[0]) == 1) {
					vertexs[Integer.parseInt(lines[1])][Integer.parseInt(lines[2])] = Integer.parseInt(lines[3]);
					vertexs[Integer.parseInt(lines[2])][Integer.parseInt(lines[1])] = Integer.parseInt(lines[3]);
				}else {
					int start = Integer.parseInt(lines[1]);
					int end = Integer.parseInt(lines[2]);
					System.out.println(solve(start, end, vertexs));
				}
			}
		}
	}

	public static int solve(int start, int end, int[][] vertexs) {
		int[] result = new int[vertexs.length];
		boolean[] visited = new boolean[vertexs.length];
		for(int i=0 ; i<vertexs.length ; i++) {
			Arrays.fill(result, Integer.MAX_VALUE);
		}
		result[start] = 0;

		while(true) {
			int index = 0;
			int minCost = Integer.MAX_VALUE;
			for(int i=1 ; i<vertexs.length ; i++) {
				if(minCost>result[i] && !visited[i]) {
					minCost = result[i];
					index = i;
				}
			}
			if(index == 0)
				break;

			visited[index] = true;

			for(int j=1 ; j<vertexs[index].length ; j++) {
				if(vertexs[index][j] != 0) {
					if(result[j] > result[index] + vertexs[index][j]) {
						result[j] = result[index] + vertexs[index][j];
					}
				}
			}
		}
		return (result[end] == Integer.MAX_VALUE) ? 1 : result[end];
	}

}