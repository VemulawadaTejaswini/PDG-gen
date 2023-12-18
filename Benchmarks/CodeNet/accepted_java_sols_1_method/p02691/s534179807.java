import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = in.nextInt();
		long count = 0;
		Hashtable<Integer, Integer> hc = new Hashtable<Integer, Integer>();
		hc.put(arr[0], 1);
		for (int i = 1; i < n; i++) {
			if (hc.get(i-arr[i]) != null) count += hc.get(i-arr[i]);
			if (hc.get(arr[i]+i) == null) hc.put(arr[i]+i, 1);
			else hc.replace(arr[i]+i, hc.get(arr[i]+i)+1);
		}
		System.out.println(count);
	}
}
