import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[A], b = new int[B];
		for (int i = 0; i < A; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < B; i++) {
			b[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < m; i++) {
			min = Math.min(min, a[sc.nextInt()-1]+b[sc.nextInt()-1]-sc.nextInt());
		}
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		min = Math.min(min, a[0]+b[0]);
		System.out.println(min);
		sc.close();
	}
}