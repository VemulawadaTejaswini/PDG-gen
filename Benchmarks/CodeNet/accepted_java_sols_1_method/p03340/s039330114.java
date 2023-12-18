import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		int left = -1;
		int right = -1;
		int base = 0;
		long count = 0;
		for (int i = 0; i < n; i++) {
		    while(right < n - 1 && (base ^ arr[right + 1]) == (base + arr[right + 1])) {
		        right++;
		        base += arr[right];
		    }
		    count += right - i + 1;
		    base -= arr[i];
		}
	    System.out.println(count);
   }
}


