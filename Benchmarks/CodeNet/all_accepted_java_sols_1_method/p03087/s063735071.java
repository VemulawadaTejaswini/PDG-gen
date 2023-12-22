import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int[] sums = new int[n];
		for (int i = 1; i < n; i++) {
		    if (arr[i - 1] == 'A' && arr[i] == 'C') {
		        sums[i]++;
		    }
	        sums[i] += sums[i - 1];
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    int left = sc.nextInt();
		    int right = sc.nextInt();
		    int count = sums[right - 1] - sums[left - 1];
		    sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
}
