
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		long alice = 0, bob = 0;
		for(int i = 0; i < n; i++) {
			if(i%2==0) {
				alice += arr[n - 1 - i];
			} else {
				bob += arr[n - 1 - i];
			}
		}
		System.out.println(alice - bob);
	}
}