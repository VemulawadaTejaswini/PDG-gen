import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] arr2 = Arrays.copyOf(arr, n);
		Arrays.sort(arr2);
		for(int i = 0; i < n; i++) {
			map.put(arr2[i], i);
		}
		for (int i = 0; i < n; i++) {
			if (map.get(arr[i]) < n/2) {
				System.out.println(arr2[n/2]);
			} else {
				System.out.println(arr2[(n/2)-1]);
			}
		}
	}
}
