import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Deque<Integer> ad = new ArrayDeque<Integer>();

		for(int i = 0; i < n; i++) {
			if(i%2==n%2) {
				ad.offerLast(a[i]);
			} else {
				ad.offerFirst(a[i]);
			}
		}
		for(int num : ad) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
}