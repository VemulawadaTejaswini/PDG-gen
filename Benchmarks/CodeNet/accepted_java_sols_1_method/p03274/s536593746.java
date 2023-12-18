import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i + k - 1 < n; i++) {
		    if (arr[i + k - 1] <= 0) {
		        min = Math.min(min, -arr[i]);
		    } else if (arr[i] >= 0) {
		        min = Math.min(min, arr[i + k - 1]);
		    } else {
		        min = Math.min(min, -arr[i] * 2 + arr[i + k - 1]);
		        min = Math.min(min, -arr[i] + arr[i + k - 1] * 2);
		    }
		}
       System.out.println(min);
	}
}
