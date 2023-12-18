import java.util.*;
public class Main { 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PriorityQueue<Integer> queue1 = new PriorityQueue<Integer>();
		PriorityQueue<Integer> queue2 = new PriorityQueue<Integer>();
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			queue1 = new PriorityQueue<Integer>();
			queue2 = new PriorityQueue<Integer>();
			
			for (int i = 0; i < n; i++) {
				String A = stdIn.next();
				String B = stdIn.next();
				String[] a0 = A.split(":");
				String[] b0 = B.split(":");
				int a2 = 0;
				int b2 = 0;
				for (int j = 0; j < 3; j++) {
					int a1 = Integer.parseInt(a0[j]);
					int b1 = Integer.parseInt(b0[j]);
					if (j == 0) {
						a2 += a1 * 3600;
						b2 += b1 * 3600;
					} else if (j == 1) {
						a2 += a1 * 60;
						b2 += b1 * 60;
					} else if (j == 2) {
						a2 += a1;
						b2 += b1;
					}
				}
				queue1.add(a2);
				queue2.add(b2);
			}
			int c = 0;
			for(int i = 0; i < n; i++) {
				int cx = queue1.poll();
				if(cx >= queue2.peek()) {
					queue2.poll();
				}
				else {
					c++;
				}
			}
			System.out.println(c);
		}
	}
}