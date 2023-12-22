import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] copy = (int[])arr.clone();
		Arrays.sort(copy);
		int mid = copy[(n + 1) / 2];
		int changed = copy[(n + 1) / 2 - 1];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (arr[i] >= mid) {
				sb.append(changed);
			} else {
				sb.append(mid);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
