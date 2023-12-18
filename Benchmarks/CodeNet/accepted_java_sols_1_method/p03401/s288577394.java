import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 2];
		long total = 0;
		for (int i = 1; i <= n; i++) {
		    arr[i] = sc.nextInt();
		    total += Math.abs(arr[i] - arr[i - 1]);
		}
		total += Math.abs(arr[n + 1] - arr[n]);
		StringBuilder sb  = new StringBuilder();
		for (int i = 1; i <= n; i++) {
		    int d = Math.abs(arr[i] - arr[i - 1]) + Math.abs(arr[i + 1] - arr[i]) - Math.abs(arr[i + 1] - arr[i - 1]);
		    sb.append(total - d).append("\n");
		}
		System.out.print(sb);
	}
}
