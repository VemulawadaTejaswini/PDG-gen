import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		Arrays.fill(arr, -1);
		arr[0] = sc.nextInt();
		int max = 1;
		for (int i = 1; i < n; i++) {
		    int x = sc.nextInt();
		    if (arr[0] < x) {
		        arr[0] = x;
		    } else {
		        int left = 0;
		        int right = max;
		        while(right - left > 1) {
		            int m = (left + right) / 2;
		            if (arr[m] >= x) {
		                left = m;
		            } else {
		                right = m;
		            }
		        }
		        arr[right] = x;
		        max = Math.max(max, right + 1);
		    }
		}
		System.out.println(max);
   }
}
