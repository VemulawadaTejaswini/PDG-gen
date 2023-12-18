import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int total = 0;
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		    total += arr[i];
		}
		if (total % 2 == 0) {
		    System.out.println(total / 2);
		    return;
		}
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
		    if (arr[i] % 2 == 1) {
		        System.out.println((total - arr[i]) / 2);
		        return;
		    }
		}
	}
}

