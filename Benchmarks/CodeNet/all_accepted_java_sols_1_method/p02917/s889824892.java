
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b[] = new int[n];
		for (int i = 0; i < n - 1; i++) {
			b[i] = sc.nextInt();
		}
		b[n - 1] = Integer.MAX_VALUE;
		
		int[] a = new int[n];
		a[0] = b[0];
		for (int i = 1; i < n; i++) {
			a[i] = Math.min(b[i], b[i - 1]);
		}
		
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		System.out.println(sum);
	}
}