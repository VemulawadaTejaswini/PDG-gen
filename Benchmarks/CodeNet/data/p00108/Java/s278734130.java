import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] pre, next;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		do {
			pre = next = new int[n];
			int cc = -1;
			for (int i = 0; i < n; i++) {
				pre[i] = in.nextInt();
			}
			do {
				map.clear();
				pre = next;
				next = new int[n];
				cc++;
				for (int i = 0; i < n; i++) {
					int count = 0;
					if (map.containsKey(pre[i])) {
						count = map.get(pre[i]);
					}
					map.put(pre[i], count + 1);
				}
				for (int i = 0; i < n; i++) {
					next[i] = map.get(pre[i]);
				}
			} while (!Arrays.equals(pre, next));
			System.out.println(cc);
			StringBuilder sb = new StringBuilder();
			for (int i : pre) {
				sb.append(i);
				sb.append(" ");
			}
			System.out.println(sb.toString().trim());
			n = in.nextInt();
		} while (n != 0);
	}
}