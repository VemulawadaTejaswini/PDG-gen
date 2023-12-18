import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int[] lefts = new int[n];
		int[] rights = new int[n];
		for (int i = 1; i < n; i++) {
			int add = 0;
			if (arr[i - 1] == 'W') {
				add++;
			}
			lefts[i] = lefts[i - 1] + add;
		}
		for (int i = n - 2; i >= 0; i--) {
			int add = 0;
			if (arr[i + 1] == 'E') {
				add++;
			}
			rights[i] = rights[i + 1] + add;
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			min = Math.min(min, lefts[i] + rights[i]);
		}
		System.out.println(min);
	}
}
