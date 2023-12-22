import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		Arrays.sort(a);
		
		for (int i = 0; i < n / 2; i++) {
			int tmp = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = tmp;
		}
		
		int alice = 0;
		int bob = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				alice += a[i];
			} else {
				bob += a[i];
			}
		}
		
		System.out.println(alice - bob);
	}
}