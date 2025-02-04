import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		Deque<Integer> q = new ArrayDeque<Integer>();
		if(n % 2 == 0) {
			for(int i = 0 ; i < n ; i++) {
				a[i] = sc.nextInt();
				if(i % 2 == 0) {
					q.addLast(a[i]);
				} else {
					q.addFirst(a[i]);
				}
			}
		} else {
			for(int i = 0 ; i < n ; i++) {
				a[i] = sc.nextInt();
				if(i % 2 == 0) {
					q.addFirst(a[i]);
				} else {
					q.addLast(a[i]);
				}
			}
		}
		for(int i = 0 ; i < n ; i++) {
			if(i != n - 1) {
				System.out.print(q.removeFirst() + " ");
			} else {
				System.out.println(q.removeFirst());
			}
		}
	}
}
