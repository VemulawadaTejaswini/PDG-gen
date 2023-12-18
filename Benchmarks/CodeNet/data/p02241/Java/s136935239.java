
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// The first input line gives us the size of our graph
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		// Initialize our matrix
		int[][] weights = new int[n][n];
		for (int i = 0; i < n; i++) {
			
			String[] row = in.nextLine().split(" ");
			// Now that we have the row, we will initialize said row in the matrix
			// For some reason, aizu includes a space before the line (strange), so the index of row for column j will be j+1
			for (int j = 0; j < n; j++) {
				weights[i][j] = Integer.parseInt(row[j+1]);
			}
		}
		Main test = new Main();
		System.out.println(test.MSTbuilder(weights, n));
		
	}
	
	public int MSTbuilder(int[][] weights, int size) {
		int weight = 0;
		ArrayList<Integer> mstSet = new ArrayList<>();
		int max = Integer.MAX_VALUE;
		int[] keyVals = new int[size];
		// First vertex gets picked first
		keyVals[0] = 0;
		for (int i = 1; i < size; i++) {
			keyVals[i] = max;
		}
		
		while (mstSet.size() < size) {
			// Retrieve the vertex with minimum key value
			int index = this.getMin(keyVals, mstSet);
			// Add it to the mstSet
			mstSet.add(index);
			// Now we update the weights of the neighbor vertices
			for (int i = 0; i < weights[index].length; i++) {
				int[] row = weights[index];
				// If the vertex is not connected to vertex i, then skip over it
				if (row[i] == -1) {	}
				else {
					keyVals[i] = Math.min(row[i], keyVals[i]);
				}
			}
		}
		for (int v : keyVals) {
			weight += v;
		}
		return weight;
	}
	
	// Returns the index of the value with the smallest number in an array that has not already been visited
	public int getMin(int[] nums, ArrayList<Integer> visited) {
		int minVal = Integer.MAX_VALUE;
		int minIndex = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < minVal && !visited.contains(i)) {
				minIndex = i;
				minVal = nums[i];
			}
		}
		return minIndex;
	}
}

