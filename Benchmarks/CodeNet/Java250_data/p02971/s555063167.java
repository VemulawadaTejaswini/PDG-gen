import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		int[] sorted = (int[])(arr.clone());
		Arrays.sort(sorted);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    if (arr[i] == sorted[n - 1]) {
		        sb.append(sorted[n - 2]);
		    } else {
		        sb.append(sorted[n - 1]);
		    }
		    sb.append("\n");
		}
		System.out.print(sb);
   }
}
