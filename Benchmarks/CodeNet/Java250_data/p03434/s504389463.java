import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int a = 0;
		int b = 0;
		for (int i = n - 1; i >= 0; i -= 2) {
			a += arr[i];
			if (i > 0) {
				b += arr[i - 1];
			}
		}
		System.out.println(a - b);
	}
}
