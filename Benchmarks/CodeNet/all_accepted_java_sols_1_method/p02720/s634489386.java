import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Date d1 = new Date();
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		Queue<Long> que = new ArrayDeque<>();
		
		for (long i = 1; i <= 9; i++) {
			que.add(i);
		}
		
		int cnt = 1;
		long num = -1;
		while (!que.isEmpty()) {
			num = que.poll();
			// System.out.printf("cnt=%d, num=%d\n", cnt, num);
			if (cnt++ == k) {
				break;
			}
			
			for (long nn = num % 10 - 1; nn <= num % 10 + 1; nn++) {
				// System.out.printf("  nn=%d\n", nn);
				if (nn < 0 || 9 < nn) {
					continue;
				}
				que.add(num * 10 + nn);
			}
		}
		
		System.out.println(num);
		// Date d2 = new Date();
		// System.out.println(d2.getTime() - d1.getTime());
	}
}
