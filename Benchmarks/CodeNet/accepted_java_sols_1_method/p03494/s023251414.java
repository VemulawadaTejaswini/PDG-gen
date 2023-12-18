import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int count = 0;
		int tmp = a[0];
		for (int i = 0; i < (tmp/2); i++) {
			for (int j = 0; j < n; j++) {
				if (a[j] % 2 == 0) {
					a[j] /= 2;
				} else {
					System.out.println(count);
					return;
				}
			}
			count++;
		}
		System.out.println(count);
	}
}	