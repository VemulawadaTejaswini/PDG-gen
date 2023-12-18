import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int left = arr[0];
		int idx = 0;
		int max = 1;
		for (int i = 1; i < n; i++) {
		    if (arr[i] - left > 2) {
		        while (arr[i] - arr[idx] > 2) {
		            idx++;
		            left = arr[idx];
		        }
		    } else {
		        max = Math.max(max, i - idx + 1);
		    }
		}
        System.out.println(max);
	}
}
