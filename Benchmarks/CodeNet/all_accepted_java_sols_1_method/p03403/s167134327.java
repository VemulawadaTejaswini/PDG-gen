import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int curr = 0;
		long sum = 0;
		
		int nums[] = new int[N + 2];
		nums[0] = 0;
		
		for (int i = 0; i < N; i++) {
			int next = in.nextInt();
			nums[i + 1] = next;
			sum += (long) Math.abs(next - curr);
			curr = next;
		}
		nums[N + 1] = 0;
		sum += (long) Math.abs(0 - curr);
		
		for (int i = 0; i < N; i++) {
			int skipIndex = i + 1;
			long dist = sum
					- Math.abs(nums[skipIndex - 1] - nums[skipIndex])
					- Math.abs(nums[skipIndex] - nums[skipIndex + 1])
					+ Math.abs(nums[skipIndex - 1] - nums[skipIndex + 1]);
			
			System.out.println(dist);
		}
	}
}