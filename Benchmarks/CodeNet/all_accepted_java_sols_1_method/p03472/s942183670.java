import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
		    max = Math.max(max, sc.nextInt());
		    arr[i] = - sc.nextInt();
		}
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < n && h > 0 && -arr[i] > max; i++) {
		    h += arr[i];
		    count++;
		}
	    count += (Math.max(h, 0) + max - 1) / max;
        System.out.println(count);
    }
}

