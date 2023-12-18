import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		Deque<Integer> deque = new ArrayDeque<>();
		for(int i = 0 ; i < n ; i++) {
			if((n + 1) % 2 == i % 2) {
				deque.addLast(a[i]);
			} else {
				deque.addFirst(a[i]);
			}
		}
		for(int i = 0 ; i < n ; i++) {
			System.out.print(deque.pollLast() + " ");
		}
	}
}
