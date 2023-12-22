import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		Deque<Integer> q = new ArrayDeque<>();
		if(n % 2 == 1) {
			for(int i = 0 ; i < n ; i++) {
				if(i % 2 == 0) q.addFirst(a[i]);
				else q.addLast(a[i]);
			}
		} else {
			for(int i = 0 ; i < n ; i++) {
				if(i % 2 == 1) q.addFirst(a[i]);
				else q.addLast(a[i]);
			}
		}
		while(!q.isEmpty()) {
			System.out.print(q.poll() + " ");
		}
		System.out.println();
	}
}
