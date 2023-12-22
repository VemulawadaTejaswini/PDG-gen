import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int alice = 0, bob = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		for (int i = n; i > 0; i-=2) {
			alice += a[i];
			if (i != 0)
			bob += a[i-1];
		}

		System.out.println(Math.abs(alice - bob));

		sc.close();
	}
}
