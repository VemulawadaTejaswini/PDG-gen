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
		long total = 0;
		for (int i = 0; i < n - 2; i++) {
		    int left = i + 1;
		    int right = i + 1;
		    while(left < n - 1) {
		        while (right < n - 1 && arr[right + 1] < arr[i] + arr[left]) {
		            right++;
		        }
		        total += Math.max(right - left, 0);
		        left++;
		    }
		}
		System.out.println(total);
   }
}


