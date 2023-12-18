import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long c = sc.nextLong();
		long k = sc.nextLong();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		Arrays.sort(arr);

		int wait = 1;
		long waitTime = arr[0];
		int result = 1;
		for(int i = 1; i < n; i++) {
			if(wait==c || arr[i] - waitTime > k) {
				result++;
				wait = 0;
				waitTime=arr[i];
			}
			wait++;
		}
		System.out.println(result);
	}
}