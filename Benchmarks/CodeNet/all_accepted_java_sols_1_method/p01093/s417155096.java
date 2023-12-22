import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (true) {
		    int n = sc.nextInt();
		    if (n == 0) {
		        break;
		    }
		    int[] arr = new int[n];
		    for (int i = 0; i < n; i++) {
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int min = Integer.MAX_VALUE;
		    for (int i = 1; i < n; i++) {
		        min = Math.min(min, arr[i] - arr[i - 1]);
		    }
	        sb.append(min).append("\n");
		}
		System.out.print(sb);
	}
}

