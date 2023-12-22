import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] h = new int[n];
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			list.get(a).add(b);
			list.get(b).add(a);
		}
		int count = 0;
		boolean[] dp = new boolean[n + 3];
		for (int i = 0; i < n; i++) {
			if (dp[i]) {
				continue;
			} else {
				boolean flag = true;
				int val = h[i];
				for (int j = 0; j < list.get(i).size(); j++) {
					if (val <= h[list.get(i).get(j)]) {
						flag = false;
						dp[i] = true;
						break;
					} else {
						dp[list.get(i).get(j)] = true;
					}
				}
				
				if (flag) {
					++count;
				}
			}
		}
		System.out.println(count);
	}
}
