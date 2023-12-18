import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int length = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		int left = -1;
		int right = left + length - 1;
		int min = 0;
		int minIdx = -1;
		StringBuilder sb = new StringBuilder();
		while (true) {
		    left++;
		    right++;
		    if (right >= n) {
		        break;
		    }
		    if (minIdx < left) {
		        min = Integer.MAX_VALUE;
		        for (int i = left; i <= right; i++) {
		            if (min >= arr[i]) {
		                min = arr[i];
		                minIdx = i;
		            }
		        }
		    } else {
		        if (arr[right] <= min) {
		            min = arr[right];
		            minIdx = right;
		        }
		    }
		    if (left > 0) {
		        sb.append(" ");
		    }
		    sb.append(min);
		}
		System.out.println(sb);
	}
}

