import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] k = new int[n];
		for(int i=0;i<n;i++) {
			k[i] = in.nextInt();
		}
		Stack<int[]> stack = new Stack<>();
		int[] start = new int[2];
		start[0] = 0;
		start[1] = n-1;
		stack.push(start);
		int ans = 0;
		while(!stack.isEmpty()) {
			int[] tmp = stack.pop();
			int idx_l = tmp[0];
			int idx_r = tmp[1];
			int min = Integer.MAX_VALUE;
			int min_idx = -1;
			for(int i=idx_l;i<=idx_r;i++) {
				if(k[i]<min) {
					min = k[i];
					min_idx = i;
				}
			}
			ans += min;
			for(int i=idx_l;i<=idx_r;i++) {
				k[i] -= min;
			}
			if(idx_l<=min_idx-1) {
				int[] left = new int[2];
				left[0] = idx_l;
				left[1] = min_idx-1;
				stack.push(left);
			}
			if(min_idx+1<=idx_r) {
				int[] right = new int[2];
				right[0] = min_idx+1;
				right[1] = idx_r;
				stack.push(right);
			}	
		}
		System.out.println(ans);
		in.close();
	}

}
