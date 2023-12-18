import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] heights = new int[n];
		for (int i = 0; i < n; i++) {
			heights[i] = sc.nextInt();
		}
		int ans = 0;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && heights[i] >= stack.peek()) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				ans++;
			}
			stack.push(heights[i]);
		}
		System.out.println(ans);
	}
}

 
 

 
 
 
 
