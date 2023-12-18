import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int[] arr = { a, b, c };
		Arrays.sort(arr);
		int diff1 = arr[2] - arr[0];
		int diff2 = arr[2] - arr[1];
//		System.out.println(diff1);
//		System.out.println(diff2);
		if (diff1 % 2 == 0 && diff2 % 2 == 0) {
			System.out.println((diff1 + diff2) / 2);
		} else if(diff1 % 2 == 1 && diff2 % 2 == 1) {
			System.out.println((diff1+diff2) / 2);
		} else {
			if(diff1 % 2 == 0) {
				long ans = diff1 / 2 + (diff2 + 1) / 2 + 1;
				System.out.println(ans);
			} else {
				long ans = diff2 / 2 + (diff1 + 1) / 2 + 1;
				System.out.println(ans);
			}
		}
	}
}