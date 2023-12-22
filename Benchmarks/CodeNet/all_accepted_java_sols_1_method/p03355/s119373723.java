import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int k = sc.nextInt();
		int[] weight = new int[5];
		weight[4] = 1;
		for (int i = 3; i >= 0; i--) {
			weight[i] = weight[i + 1] * 27;
		}
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < arr.length; i++) {
			int prev = 0;
			for (int j = 0; j < 5 && i + j < arr.length; j++) {
				prev += (arr[i + j] - 'a' + 1) * weight[j];
				set.add(prev);
			}
		}
		int target = 0;
		for (int i = 0; i < k; i++) {
			target = set.pollFirst();
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			int x = target / weight[i];
			if (x == 0) {
				break;
			}
			sb.append((char)(x + 'a' - 1));
			target %= weight[i];
		}
		System.out.println(sb);
	}
}
