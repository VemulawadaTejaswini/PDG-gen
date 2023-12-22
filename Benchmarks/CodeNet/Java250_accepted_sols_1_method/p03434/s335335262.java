import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int alice = 0, bob = 0;
		for (int i = n - 1; i >= 0; i = i - 2) {
			alice += a[i];
		}
		for (int i = n - 2; i >= 0; i = i - 2) {
			bob += a[i];
		}
		System.out.println(alice - bob);
	}
}
