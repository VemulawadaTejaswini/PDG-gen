import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int i = 0;
		int Alice = 0;
		int Bob = 0;
		for(i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		for(i = 1; i <= n; i++) {
			if(i % 2 == 1) {
				Alice = Alice + a[n - i];
			} else {
				Bob = Bob + a[n - i];
			}
		}
		System.out.println(Alice - Bob);
	}
}