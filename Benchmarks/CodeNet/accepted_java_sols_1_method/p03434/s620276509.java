
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);

		int alice = 0;
		int bob = 0;

		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				alice += a[i];
			}else {
				bob += a[i];
			}
		}
		if (alice > bob) {
			System.out.println(alice - bob);
		} else {
			System.out.println(bob - alice);
		}
	}
}