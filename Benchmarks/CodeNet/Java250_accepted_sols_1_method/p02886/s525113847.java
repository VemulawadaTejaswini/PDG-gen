import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		long total = 0;
		for (int i = 0; i < n - 1; i++) {
		    for (int j = i + 1; j < n; j++) {
		        total += arr[i] * arr[j];
		    }
		}
		System.out.println(total);
	}
}
