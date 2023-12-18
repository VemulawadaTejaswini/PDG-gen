import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 1; i < n; i++) {
		    queue.add(arr[i] - arr[i - 1]);
		}
		int count = 0;
		for (int i = 0; i < n - m; i++) {
		    count += queue.poll();
		}
		System.out.println(count);
   }
}
