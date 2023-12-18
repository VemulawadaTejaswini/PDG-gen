import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		int x = partition(arr, 0, arr.length - 1);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    if (i > 0) {
		        sb.append(" ");
		    }
		    if (i == x) {
		        sb.append("[").append(arr[i]).append("]");
		    } else {
		        sb.append(arr[i]);
		    }
		}
		System.out.println(sb);
	}
	
	static int partition(int[] arr, int p, int r) {
	    int x = arr[r];
	    int idx = p - 1;
	    for (int i = p; i < r; i++) {
	        if (arr[i] <= x) {
	            idx++;
	            int tmp = arr[i];
	            arr[i] = arr[idx];
	            arr[idx] = tmp;
	        }
	    }
	    int tmp = arr[idx + 1];
	    arr[idx + 1] = arr[r];
	    arr[r] = tmp;
	    return idx + 1;
	}
}

