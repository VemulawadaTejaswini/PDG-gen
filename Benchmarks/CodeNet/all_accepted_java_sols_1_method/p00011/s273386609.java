import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int w = s.nextInt();
		int n = s.nextInt();
		int [] nums = new int[w];
		for (int i=0;i<w;i++) {
			nums[i] = i + 1;
		}
		for (int i=0;i<n;i++) {
			String[] inp = s.next().split(",");
			int a = Integer.valueOf(inp[0]).intValue() - 1;
			int b = Integer.valueOf(inp[1]).intValue() - 1;
			int temp = nums[b];
			nums[b] = nums[a];
			nums[a] = temp;
		}
		for (int i=0;i<w;i++) {
			System.out.println(nums[i]);
		}
	}
}
