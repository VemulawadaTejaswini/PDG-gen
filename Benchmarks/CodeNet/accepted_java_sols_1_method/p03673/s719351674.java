import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] a = new long[n];
		ArrayDeque<Long> b = new ArrayDeque<Long>();
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextLong();
		}
		for(int i = 0; i < n; i++) {
			if(i % 2 != n % 2) {
				b.addFirst(a[i]);
			} else {
				b.addLast(a[i]);
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.print(b.pollFirst());
			if(i < n - 1) {
				System.out.print(" ");
			}
		}
		scan.close();
	}

}
