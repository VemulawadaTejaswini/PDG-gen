import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
//	static class AllocStatus {
//		int startIdx = 0;
//		int startWeight = 0;
//	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputs = reader.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]);
		int k = Integer.parseInt(inputs[1]);
		
		int[] weights = new int[n];
		int capacity = 0;
		for (int i = 0; i < n; i++) {
			int weight = Integer.parseInt(reader.readLine());
			weights[i] = weight;
			capacity += weight;
		}

		capacity /= k;
		capacity = 0;
//		AllocStatus allocStatus = new AllocStatus();
		while (true) {
			boolean canAllocate = checkAllocation(weights, k, capacity/*, allocStatus*/);
			if (canAllocate) {
				break;
			}
			capacity++;			
		}		
		System.out.println(capacity);		
	}

	private static boolean checkAllocation(int[] weights, int k, int capacity/*, AllocStatus allocStatus*/) {
		
		int num = 1;
//		int current = allocStatus.startWeight;
		int current = 0;

//		for (int i = allocStatus.startIdx; i < weights.length; i++) {
		for (int i = 0; i < weights.length; i++) {
			int weight = weights[i];
			if (current + weight > capacity) {
//				if (num == 1) {
//					allocStatus.startIdx = i;
//					allocStatus.startWeight = current;
//				}
				current = weight;
				num++;
				
				if (num > k || current > capacity) {
					return false;
				}
			} else {
				current += weight;
			}
		}
		return true;
	}
}

