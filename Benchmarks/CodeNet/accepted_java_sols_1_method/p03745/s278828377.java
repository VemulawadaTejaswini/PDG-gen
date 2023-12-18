import java.util.*;

// ABC 32-C
// http://abc032.contest.atcoder.jp/tasks/abc032_c
 
public class Main {

	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] nums = new int[n];
		
		int answer = 1;
		int state = 0; // 0 means it can go either up or down. 1 means it must be increasing or equal. 2 means it must be decreasing or equal
		for (int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
			if (i > 0) {
				// Direction is not determined
				if (state == 0) {
					if (nums[i - 1] < nums[i]) {
						state = 1;
					} else if (nums[i - 1] > nums[i] ) {
						state = 2;
					}
				} else if (state == 1) {
					if (nums[i - 1] > nums[i]) {
						state = 0;
						answer++;
					}
				} else {
					if (nums[i - 1] < nums[i]) {
						state = 0;
						answer++;
					}
				}
			}
		}
		System.out.println(answer);
		
		
	}
	
}